package typings.tern.libTernMod

import typings.tern.anon.Depth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionsQueryResult extends StObject {
  
  // TODO depends on completionsquery settings -> conditional types?
  /**
    * array of completions. When one of the `types`, `depths`, `docs`, `urls`, or `origins`
    * options was passed, the array will hold objects with a `name` property (the completion text),
    * and, depending on the options, `type`, `depth`, `doc`, `url`, and `origin` properties.
    * When none of these options are enabled, the result array will hold plain strings.
    */
  var completions: js.Array[Depth | String]
  
  /** end offsets of the word that was completed */
  var end: Double | Position
  
  /** whether the completion is for a property or a variable */
  var isProperty: Boolean
  
  /** start offsets of the word that was completed */
  var start: Double | Position
}
object CompletionsQueryResult {
  
  inline def apply(
    completions: js.Array[Depth | String],
    end: Double | Position,
    isProperty: Boolean,
    start: Double | Position
  ): CompletionsQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], isProperty = isProperty.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionsQueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionsQueryResult] (val x: Self) extends AnyVal {
    
    inline def setCompletions(value: js.Array[Depth | String]): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
    
    inline def setCompletionsVarargs(value: (Depth | String)*): Self = StObject.set(x, "completions", js.Array(value*))
    
    inline def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setIsProperty(value: Boolean): Self = StObject.set(x, "isProperty", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
