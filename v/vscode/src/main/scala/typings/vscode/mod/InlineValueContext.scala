package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineValueContext extends StObject {
  
  /**
    * The stack frame (as a DAP Id) where the execution has stopped.
    */
  val frameId: Double
  
  /**
    * The document range where execution has stopped.
    * Typically the end position of the range denotes the line where the inline values are shown.
    */
  val stoppedLocation: Range
}
object InlineValueContext {
  
  inline def apply(frameId: Double, stoppedLocation: Range): InlineValueContext = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], stoppedLocation = stoppedLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineValueContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineValueContext] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setStoppedLocation(value: Range): Self = StObject.set(x, "stoppedLocation", value.asInstanceOf[js.Any])
  }
}
