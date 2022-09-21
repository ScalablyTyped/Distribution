package typings.tsLoader.interfacesMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostMayBeCacheable extends StObject {
  
  var clearCache: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var directoryExistsCache: js.UndefOr[Map[String, Boolean]] = js.undefined
  
  var fileExistsCache: js.UndefOr[Map[String, Boolean]] = js.undefined
  
  var realpathCache: js.UndefOr[Map[String, String]] = js.undefined
}
object HostMayBeCacheable {
  
  inline def apply(): HostMayBeCacheable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostMayBeCacheable]
  }
  
  extension [Self <: HostMayBeCacheable](x: Self) {
    
    inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
    
    inline def setClearCacheUndefined: Self = StObject.set(x, "clearCache", js.undefined)
    
    inline def setDirectoryExistsCache(value: Map[String, Boolean]): Self = StObject.set(x, "directoryExistsCache", value.asInstanceOf[js.Any])
    
    inline def setDirectoryExistsCacheUndefined: Self = StObject.set(x, "directoryExistsCache", js.undefined)
    
    inline def setFileExistsCache(value: Map[String, Boolean]): Self = StObject.set(x, "fileExistsCache", value.asInstanceOf[js.Any])
    
    inline def setFileExistsCacheUndefined: Self = StObject.set(x, "fileExistsCache", js.undefined)
    
    inline def setRealpathCache(value: Map[String, String]): Self = StObject.set(x, "realpathCache", value.asInstanceOf[js.Any])
    
    inline def setRealpathCacheUndefined: Self = StObject.set(x, "realpathCache", js.undefined)
  }
}
