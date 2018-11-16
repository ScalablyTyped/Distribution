package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Application")
@js.native
class Application ()
  extends xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.Application

@JSImport("xmldsigjs", "Application")
@js.native
object Application extends js.Object {
  val crypto: xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs.CryptoEx = js.native
  /**
           * Gets the crypto module from the Application
           */
  def isNodePlugin(): scala.Boolean = js.native
  /**
           * Sets crypto engine for the current Application
           * @param  {string} name
           * @param  {Crypto} crypto
           * @returns void
           */
  def setEngine(name: java.lang.String, crypto: stdLib.Crypto): scala.Unit = js.native
}

