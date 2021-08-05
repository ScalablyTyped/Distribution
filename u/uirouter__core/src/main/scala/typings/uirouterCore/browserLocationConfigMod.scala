package typings.uirouterCore

import typings.uirouterCore.coreservicesMod.LocationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserLocationConfigMod {
  
  @JSImport("@uirouter/core/lib/vanilla/browserLocationConfig", "BrowserLocationConfig")
  @js.native
  class BrowserLocationConfig ()
    extends StObject
       with LocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
    def this(router: Unit, _isHtml5: Boolean) = this()
    
    /* private */ var _baseHref: js.Any = js.native
    
    /* private */ var _hashPrefix: js.Any = js.native
    
    /* private */ var _isHtml5: js.Any = js.native
    
    def baseHref(href: String): String = js.native
    
    /* private */ var getBaseHref: js.Any = js.native
  }
}
