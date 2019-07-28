package typings.tern.libTernMod

import typings.tern.Anon_Depth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionsQueryResult extends js.Object {
  // TODO depends on completionsquery settings -> conditional types?
  /**
    * array of completions. When one of the `types`, `depths`, `docs`, `urls`, or `origins`
    * options was passed, the array will hold objects with a `name` property (the completion text),
    * and, depending on the options, `type`, `depth`, `doc`, `url`, and `origin` properties.
    * When none of these options are enabled, the result array will hold plain strings.
    */
  var completions: js.Array[Anon_Depth | String]
  /** end offsets of the word that was completed */
  var end: Double | Position
  /** whether the completion is for a property or a variable */
  var isProperty: Boolean
  /** start offsets of the word that was completed */
  var start: Double | Position
}

object CompletionsQueryResult {
  @scala.inline
  def apply(
    completions: js.Array[Anon_Depth | String],
    end: Double | Position,
    isProperty: Boolean,
    start: Double | Position
  ): CompletionsQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions, end = end.asInstanceOf[js.Any], isProperty = isProperty, start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompletionsQueryResult]
  }
}

