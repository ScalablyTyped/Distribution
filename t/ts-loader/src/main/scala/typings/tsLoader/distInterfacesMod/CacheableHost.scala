package typings.tsLoader.distInterfacesMod

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
  
  inline def apply(fileExists: /* fileName */ String => Boolean): CacheableHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
    __obj.asInstanceOf[CacheableHost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheableHost] (val x: Self) extends AnyVal {
    
    inline def setDirectoryExists(value: /* directoryName */ String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    inline def setFileExists(value: /* fileName */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setRealpath(value: /* path */ String => String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    
    inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
  }
}
