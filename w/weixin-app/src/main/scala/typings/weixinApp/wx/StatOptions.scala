package typings.weixinApp.wx

import typings.weixinApp.anon.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var path: String = js.native
  
  // 文件/目录路径
  var recursive: js.UndefOr[Boolean] = js.native
  
  // 是否递归,默认false
  @JSName("success")
  var success_StatOptions: js.UndefOr[js.Function1[/* res */ Stats, Unit]] = js.native
}
object StatOptions {
  
  @scala.inline
  def apply(path: String): StatOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  
  @scala.inline
  implicit class StatOptionsMutableBuilder[Self <: StatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Stats => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
