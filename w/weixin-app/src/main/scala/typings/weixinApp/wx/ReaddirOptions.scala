package typings.weixinApp.wx

import typings.weixinApp.anon.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaddirOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var dirPath: String
  
  // 要读取的目录路径
  @JSName("success")
  var success_ReaddirOptions: js.UndefOr[js.Function1[/* res */ Files, Unit]] = js.undefined
}
object ReaddirOptions {
  
  inline def apply(dirPath: String): ReaddirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaddirOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaddirOptions] (val x: Self) extends AnyVal {
    
    inline def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Files => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
