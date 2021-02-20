package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsRemoveSavedFileOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var filePath: String = js.native
}
object FsRemoveSavedFileOptions {
  
  @scala.inline
  def apply(filePath: String): FsRemoveSavedFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsRemoveSavedFileOptions]
  }
  
  @scala.inline
  implicit class FsRemoveSavedFileOptionsMutableBuilder[Self <: FsRemoveSavedFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
