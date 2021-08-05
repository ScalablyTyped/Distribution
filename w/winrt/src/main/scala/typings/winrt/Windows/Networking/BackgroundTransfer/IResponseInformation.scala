package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResponseInformation extends StObject {
  
  var actualUri: Uri
  
  var headers: IMapView[String, String]
  
  var isResumable: Boolean
  
  var statusCode: Double
}
object IResponseInformation {
  
  inline def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): IResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isResumable = isResumable.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseInformation]
  }
  
  extension [Self <: IResponseInformation](x: Self) {
    
    inline def setActualUri(value: Uri): Self = StObject.set(x, "actualUri", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: IMapView[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIsResumable(value: Boolean): Self = StObject.set(x, "isResumable", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
