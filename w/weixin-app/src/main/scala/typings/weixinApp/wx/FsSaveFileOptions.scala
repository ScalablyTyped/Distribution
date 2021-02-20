package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsSaveFileOptions extends SaveFileOptions {
  
  var filePath: String = js.native
}
object FsSaveFileOptions {
  
  @scala.inline
  def apply(filePath: String, tempFilePath: String): FsSaveFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsSaveFileOptions]
  }
  
  @scala.inline
  implicit class FsSaveFileOptionsMutableBuilder[Self <: FsSaveFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
