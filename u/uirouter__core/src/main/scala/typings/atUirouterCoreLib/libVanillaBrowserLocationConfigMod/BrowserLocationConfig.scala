package typings
package atUirouterCoreLib.libVanillaBrowserLocationConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/browserLocationConfig", "BrowserLocationConfig")
@js.native
class BrowserLocationConfig ()
  extends atUirouterCoreLib.libCommonCoreservicesMod.LocationConfig {
  def this(router: js.Any) = this()
  def this(router: js.Any, _isHtml5: scala.Boolean) = this()
  var _baseHref: js.Any = js.native
  var _hashPrefix: js.Any = js.native
  var _isHtml5: js.Any = js.native
  var getBaseHref: js.Any = js.native
  @JSName("baseHref")
  def baseHref_MBrowserLocationConfig(): java.lang.String = js.native
  @JSName("baseHref")
  def baseHref_MBrowserLocationConfig(href: java.lang.String): java.lang.String = js.native
  @JSName("hashPrefix")
  def hashPrefix_MBrowserLocationConfig(): java.lang.String = js.native
  @JSName("host")
  def host_MBrowserLocationConfig(): java.lang.String = js.native
  @JSName("html5Mode")
  def html5Mode_MBrowserLocationConfig(): scala.Boolean = js.native
  @JSName("port")
  def port_MBrowserLocationConfig(): scala.Double = js.native
  @JSName("protocol")
  def protocol_MBrowserLocationConfig(): java.lang.String = js.native
}

