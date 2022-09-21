package typings.wxServerSdk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileSuccess extends StObject {
  
  var fileContent: Buffer
  
  var statusCode: Double
}
object DownloadFileSuccess {
  
  inline def apply(fileContent: Buffer, statusCode: Double): DownloadFileSuccess = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileSuccess]
  }
  
  extension [Self <: DownloadFileSuccess](x: Self) {
    
    inline def setFileContent(value: Buffer): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
