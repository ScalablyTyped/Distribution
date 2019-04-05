package typings
package webdriverDashManagerLib.builtLibBinariesConfigUnderscoreSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/binaries/config_source", "ConfigSource")
@js.native
abstract class ConfigSource () extends js.Object {
  var osarch: java.lang.String = js.native
  var ostype: java.lang.String = js.native
  var out_dir: java.lang.String = js.native
  def getUrl(version: java.lang.String): js.Promise[webdriverDashManagerLib.Anon_Url] = js.native
  def getVersionList(): js.Promise[js.Array[java.lang.String]] = js.native
}

