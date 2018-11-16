package typings
package webdriverDashManagerLib.builtLibBinariesConfigUnderscoreSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/binaries/config_source", "XmlConfigSource")
@js.native
abstract class XmlConfigSource protected () extends ConfigSource {
  def this(name: java.lang.String, xmlUrl: java.lang.String) = this()
  var name: java.lang.String = js.native
  var xmlUrl: java.lang.String = js.native
  /* private */ def convertXml2js(xml: js.Any): js.Any = js.native
  /* protected */ def getFileName(): java.lang.String = js.native
  /* protected */ def getXml(): stdLib.Promise[_] = js.native
  /* private */ def readResponse(): js.Any = js.native
  /* private */ def requestXml(): js.Any = js.native
}

