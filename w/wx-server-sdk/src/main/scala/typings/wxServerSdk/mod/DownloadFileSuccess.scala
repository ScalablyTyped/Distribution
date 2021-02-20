package typings.wxServerSdk.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileSuccess extends StObject {
  
  var fileContent: Buffer = js.native
  
  var statusCode: Double = js.native
}
object DownloadFileSuccess {
  
  @scala.inline
  def apply(fileContent: Buffer, statusCode: Double): DownloadFileSuccess = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileSuccess]
  }
  
  @scala.inline
  implicit class DownloadFileSuccessMutableBuilder[Self <: DownloadFileSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileContent(value: Buffer): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
