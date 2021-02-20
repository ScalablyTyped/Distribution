package typings.weixinApp.wx

import typings.weixinApp.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsGetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var filePath: String = js.native
  
  // 要读取的文件路径
  @JSName("success")
  var success_FsGetFileInfoOptions: js.UndefOr[js.Function1[/* res */ Size, Unit]] = js.native
}
object FsGetFileInfoOptions {
  
  @scala.inline
  def apply(filePath: String): FsGetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsGetFileInfoOptions]
  }
  
  @scala.inline
  implicit class FsGetFileInfoOptionsMutableBuilder[Self <: FsGetFileInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ Size => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
