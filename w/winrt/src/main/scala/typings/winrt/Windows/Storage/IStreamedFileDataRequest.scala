package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamedFileDataRequest extends StObject {
  
  def failAndClose(failureMode: StreamedFileFailureMode): Unit
}
object IStreamedFileDataRequest {
  
  inline def apply(failAndClose: StreamedFileFailureMode => Unit): IStreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(failAndClose = js.Any.fromFunction1(failAndClose))
    __obj.asInstanceOf[IStreamedFileDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStreamedFileDataRequest] (val x: Self) extends AnyVal {
    
    inline def setFailAndClose(value: StreamedFileFailureMode => Unit): Self = StObject.set(x, "failAndClose", js.Any.fromFunction1(value))
  }
}
