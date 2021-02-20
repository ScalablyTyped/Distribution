package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamedFileDataRequest extends StObject {
  
  def failAndClose(failureMode: StreamedFileFailureMode): Unit = js.native
}
object IStreamedFileDataRequest {
  
  @scala.inline
  def apply(failAndClose: StreamedFileFailureMode => Unit): IStreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(failAndClose = js.Any.fromFunction1(failAndClose))
    __obj.asInstanceOf[IStreamedFileDataRequest]
  }
  
  @scala.inline
  implicit class IStreamedFileDataRequestMutableBuilder[Self <: IStreamedFileDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailAndClose(value: StreamedFileFailureMode => Unit): Self = StObject.set(x, "failAndClose", js.Any.fromFunction1(value))
  }
}
