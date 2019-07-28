package typings.xmldsigjs.xmldsigjsMod

import typings.std.Crypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "Application")
@js.native
class Application () extends js.Object

/* static members */
@JSImport("xmldsigjs", "Application")
@js.native
object Application extends js.Object {
  val crypto: CryptoEx = js.native
  /**
    * Gets the crypto module from the Application
    */
  def isNodePlugin(): Boolean = js.native
  /**
    * Sets crypto engine for the current Application
    * @param  {string} name
    * @param  {Crypto} crypto
    * @returns void
    */
  def setEngine(name: String, crypto: Crypto): Unit = js.native
}

