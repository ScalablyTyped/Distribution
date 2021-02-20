package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataRequestedEventArgs extends StObject {
  
  var request: DataRequest = js.native
}
object IDataRequestedEventArgs {
  
  @scala.inline
  def apply(request: DataRequest): IDataRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IDataRequestedEventArgsMutableBuilder[Self <: IDataRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: DataRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
