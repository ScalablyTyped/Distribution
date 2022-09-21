package typings.tsLoader.interfacesMod

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheableHost
  extends StObject
     with HostMayBeCacheable {
  
  var directoryExists: NonNullable[js.UndefOr[js.Function1[/* directoryName */ String, Boolean]]]
  
  def fileExists(fileName: String): Boolean
  @JSName("fileExists")
  var fileExists_Original: js.Function1[/* fileName */ String, Boolean]
  
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
}
object CacheableHost {
  
  inline def apply(
    directoryExists: NonNullable[js.UndefOr[js.Function1[/* directoryName */ String, Boolean]]],
    fileExists: /* fileName */ String => Boolean
  ): CacheableHost = {
    val __obj = js.Dynamic.literal(directoryExists = directoryExists.asInstanceOf[js.Any], fileExists = js.Any.fromFunction1(fileExists))
    __obj.asInstanceOf[CacheableHost]
  }
  
  extension [Self <: CacheableHost](x: Self) {
    
    inline def setDirectoryExists(value: NonNullable[js.UndefOr[js.Function1[/* directoryName */ String, Boolean]]]): Self = StObject.set(x, "directoryExists", value.asInstanceOf[js.Any])
    
    inline def setFileExists(value: /* fileName */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setRealpath(value: /* path */ String => String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    
    inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
  }
}
