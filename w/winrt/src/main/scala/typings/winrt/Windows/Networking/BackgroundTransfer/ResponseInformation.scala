package typings.winrt.Windows.Networking.BackgroundTransfer

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInformation
  extends StObject
     with IResponseInformation
object ResponseInformation {
  
  @scala.inline
  def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): ResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isResumable = isResumable.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInformation]
  }
}
