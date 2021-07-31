package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data that is returned by a server response. */
trait ResponseInformation extends StObject {
  
  /** Gets the URI that contains the requested data. */
  var actualUri: Uri
  
  /** Gets all response headers sent by the server. */
  var headers: IMapView[String, String]
  
  /** Gets a value that specifies whether the download is resumable. */
  var isResumable: Boolean
  
  /** Gets the status code returned by the server. */
  var statusCode: Double
}
object ResponseInformation {
  
  @scala.inline
  def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): ResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isResumable = isResumable.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
  
  @scala.inline
  implicit class ResponseInformationMutableBuilder[Self <: ResponseInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualUri(value: Uri): Self = StObject.set(x, "actualUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: IMapView[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResumable(value: Boolean): Self = StObject.set(x, "isResumable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
