package typings.uirouterCore

import typings.uirouterCore.coreservicesMod.LocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/browserLocationConfig", JSImport.Namespace)
@js.native
object browserLocationConfigMod extends js.Object {
  @js.native
  class BrowserLocationConfig () extends LocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
    var _baseHref: js.Any = js.native
    var _hashPrefix: js.Any = js.native
    var _isHtml5: js.Any = js.native
    var getBaseHref: js.Any = js.native
    def baseHref(href: String): String = js.native
  }
  
}

