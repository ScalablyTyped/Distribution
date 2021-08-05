package typings.winrt.Windows.ApplicationModel.DataTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataRequestedEventArgs extends StObject {
  
  var request: DataRequest
}
object IDataRequestedEventArgs {
  
  inline def apply(request: DataRequest): IDataRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRequestedEventArgs]
  }
  
  extension [Self <: IDataRequestedEventArgs](x: Self) {
    
    inline def setRequest(value: DataRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
