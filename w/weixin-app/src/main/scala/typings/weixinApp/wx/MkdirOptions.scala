package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MkdirOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var dirPath: String
  
  // 创建的目录路径
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object MkdirOptions {
  
  inline def apply(dirPath: String): MkdirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MkdirOptions]
  }
  
  extension [Self <: MkdirOptions](x: Self) {
    
    inline def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
