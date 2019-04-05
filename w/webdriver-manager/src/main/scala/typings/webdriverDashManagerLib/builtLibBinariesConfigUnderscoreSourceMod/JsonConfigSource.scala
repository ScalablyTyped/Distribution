package typings
package webdriverDashManagerLib.builtLibBinariesConfigUnderscoreSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/binaries/config_source", "JsonConfigSource")
@js.native
abstract class JsonConfigSource protected () extends ConfigSource {
  def this(name: java.lang.String, jsonUrl: java.lang.String) = this()
  var jsonUrl: java.lang.String = js.native
  var name: java.lang.String = js.native
  /* protected */ def getFileName(): java.lang.String = js.native
  /* protected */ def getJson(): js.Promise[java.lang.String] = js.native
}

