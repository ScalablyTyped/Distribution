package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `completions` request. */
trait CompletionsArguments extends StObject {
  
  /** The character position for which to determine the completion proposals. */
  var column: Double
  
  /** Returns completions in the scope of this stack frame. If not specified, the completions are returned for the global scope. */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /** A line for which to determine the completion proposals. If missing the first line of the text is assumed. */
  var line: js.UndefOr[Double] = js.undefined
  
  /** One or more source lines. Typically this is the text a user has typed into the debug console before he asked for completion. */
  var text: String
}
object CompletionsArguments {
  
  inline def apply(column: Double, text: String): CompletionsArguments = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionsArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompletionsArguments] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
