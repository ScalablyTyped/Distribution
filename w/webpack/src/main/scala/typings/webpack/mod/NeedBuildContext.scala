package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedBuildContext extends StObject {
  
  var compilation: Compilation
  
  var fileSystemInfo: FileSystemInfo
  
  var valueCacheVersions: Map[String, String | Set[String]]
}
object NeedBuildContext {
  
  inline def apply(
    compilation: Compilation,
    fileSystemInfo: FileSystemInfo,
    valueCacheVersions: Map[String, String | Set[String]]
  ): NeedBuildContext = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], fileSystemInfo = fileSystemInfo.asInstanceOf[js.Any], valueCacheVersions = valueCacheVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedBuildContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NeedBuildContext] (val x: Self) extends AnyVal {
    
    inline def setCompilation(value: Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setFileSystemInfo(value: FileSystemInfo): Self = StObject.set(x, "fileSystemInfo", value.asInstanceOf[js.Any])
    
    inline def setValueCacheVersions(value: Map[String, String | Set[String]]): Self = StObject.set(x, "valueCacheVersions", value.asInstanceOf[js.Any])
  }
}
