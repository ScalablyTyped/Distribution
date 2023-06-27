package typings.wicgWebAppLaunch

import typings.std.FileSystemHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchParams extends StObject {
  
  var files: js.Array[FileSystemHandle]
  
  var targetURL: js.UndefOr[String] = js.undefined
}
object LaunchParams {
  
  inline def apply(files: js.Array[FileSystemHandle]): LaunchParams = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchParams] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[FileSystemHandle]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: FileSystemHandle*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setTargetURL(value: String): Self = StObject.set(x, "targetURL", value.asInstanceOf[js.Any])
    
    inline def setTargetURLUndefined: Self = StObject.set(x, "targetURL", js.undefined)
  }
}
