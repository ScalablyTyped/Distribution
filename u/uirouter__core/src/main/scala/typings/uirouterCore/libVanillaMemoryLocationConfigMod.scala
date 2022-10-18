package typings.uirouterCore

import typings.uirouterCore.libCommonCoreservicesMod.LocationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVanillaMemoryLocationConfigMod {
  
  @JSImport("@uirouter/core/lib/vanilla/memoryLocationConfig", "MemoryLocationConfig")
  @js.native
  open class MemoryLocationConfig ()
    extends StObject
       with LocationConfig {
    
    var _baseHref: String = js.native
    
    var _hashPrefix: String = js.native
    
    var _host: String = js.native
    
    var _port: Double = js.native
    
    var _protocol: String = js.native
    
    @JSName("dispose")
    var dispose_Original: js.Function0[Any] = js.native
    
    def hashPrefix(newval: Any): Any = js.native
  }
}
