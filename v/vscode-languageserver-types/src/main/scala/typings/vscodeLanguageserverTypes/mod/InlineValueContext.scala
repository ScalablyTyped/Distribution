package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineValueContext extends StObject {
  
  /**
    * The stack frame (as a DAP Id) where the execution has stopped.
    */
  var frameId: integer
  
  /**
    * The document range where execution has stopped.
    * Typically the end position of the range denotes the line where the inline values are shown.
    */
  var stoppedLocation: Range
}
object InlineValueContext {
  
  inline def apply(frameId: integer, stoppedLocation: Range): InlineValueContext = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], stoppedLocation = stoppedLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineValueContext]
  }
  
  @JSImport("vscode-languageserver-types", "InlineValueContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueContext literal.
    */
  inline def create(frameId: integer, stoppedLocation: Range): InlineValueContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(frameId.asInstanceOf[js.Any], stoppedLocation.asInstanceOf[js.Any])).asInstanceOf[InlineValueContext]
  
  /**
    * Checks whether the given literal conforms to the [InlineValueContext](#InlineValueContext) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueContext */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueContext */ Boolean]
  
  extension [Self <: InlineValueContext](x: Self) {
    
    inline def setFrameId(value: integer): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setStoppedLocation(value: Range): Self = StObject.set(x, "stoppedLocation", value.asInstanceOf[js.Any])
  }
}
