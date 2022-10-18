package typings.uirouterCore

import typings.uirouterCore.libCommonCoreservicesMod.LocationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVanillaBrowserLocationConfigMod {
  
  @JSImport("@uirouter/core/lib/vanilla/browserLocationConfig", "BrowserLocationConfig")
  @js.native
  open class BrowserLocationConfig ()
    extends StObject
       with LocationConfig {
    def this(router: Any) = this()
    def this(router: Any, _isHtml5: Boolean) = this()
    def this(router: Unit, _isHtml5: Boolean) = this()
    
    /* private */ var _baseHref: Any = js.native
    
    /* private */ var _hashPrefix: Any = js.native
    
    /* private */ var _isHtml5: Any = js.native
    
    def baseHref(href: String): String = js.native
    
    /* private */ var getBaseHref: Any = js.native
  }
}
