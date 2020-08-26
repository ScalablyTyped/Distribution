package typings.tern.ternMod

import typings.tern.anon.Depth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletionsQueryResult extends js.Object {
  // TODO depends on completionsquery settings -> conditional types?
  /**
    * array of completions. When one of the `types`, `depths`, `docs`, `urls`, or `origins`
    * options was passed, the array will hold objects with a `name` property (the completion text),
    * and, depending on the options, `type`, `depth`, `doc`, `url`, and `origin` properties.
    * When none of these options are enabled, the result array will hold plain strings.
    */
  var completions: js.Array[Depth | String] = js.native
  /** end offsets of the word that was completed */
  var end: Double | Position = js.native
  /** whether the completion is for a property or a variable */
  var isProperty: Boolean = js.native
  /** start offsets of the word that was completed */
  var start: Double | Position = js.native
}

object CompletionsQueryResult {
  @scala.inline
  def apply(
    completions: js.Array[Depth | String],
    end: Double | Position,
    isProperty: Boolean,
    start: Double | Position
  ): CompletionsQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], isProperty = isProperty.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionsQueryResult]
  }
  @scala.inline
  implicit class CompletionsQueryResultOps[Self <: CompletionsQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompletionsVarargs(value: (Depth | String)*): Self = this.set("completions", js.Array(value :_*))
    @scala.inline
    def setCompletions(value: js.Array[Depth | String]): Self = this.set("completions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double | Position): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsProperty(value: Boolean): Self = this.set("isProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double | Position): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

