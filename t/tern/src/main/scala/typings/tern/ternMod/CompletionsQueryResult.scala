package typings.tern.ternMod

import typings.tern.anon.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionsQueryResult extends StObject {
  
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
  implicit class CompletionsQueryResultMutableBuilder[Self <: CompletionsQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletions(value: js.Array[Depth | String]): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionsVarargs(value: (Depth | String)*): Self = StObject.set(x, "completions", js.Array(value :_*))
    
    @scala.inline
    def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsProperty(value: Boolean): Self = StObject.set(x, "isProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
