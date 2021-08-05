package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Disposition HTTP header on HTTP content in a request or a response. */
trait HttpContentDispositionHeaderValue extends StObject {
  
  /** Gets or sets the value of the disposition-type information in the Content-Disposition HTTP header. */
  var dispositionType: String
  
  /** Gets or sets the value of the filename-parm information in the Content-Disposition HTTP header for a single file. */
  var fileName: String
  
  /** Gets or sets the value of the filename-parm characteristic in the Content-Disposition HTTP header for multiple files. */
  var fileNameStar: String
  
  /** Gets or sets the name for a content body part in the Content-Disposition HTTP header. */
  var name: String
  
  /** Gets a set of parameters included in the Content-Disposition HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue]
  
  /** Gets or sets the approximate size, in bytes, of the file used in the Content-Disposition HTTP header. */
  var size: Double
}
object HttpContentDispositionHeaderValue {
  
  inline def apply(
    dispositionType: String,
    fileName: String,
    fileNameStar: String,
    name: String,
    parameters: IVector[HttpNameValueHeaderValue],
    size: Double
  ): HttpContentDispositionHeaderValue = {
    val __obj = js.Dynamic.literal(dispositionType = dispositionType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileNameStar = fileNameStar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentDispositionHeaderValue]
  }
  
  extension [Self <: HttpContentDispositionHeaderValue](x: Self) {
    
    inline def setDispositionType(value: String): Self = StObject.set(x, "dispositionType", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameStar(value: String): Self = StObject.set(x, "fileNameStar", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
