package typings.xadesjs.mod

import typings.std.Crypto_
import typings.xmldsigjs.applicationMod.CryptoEx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "Application")
@js.native
class Application ()
  extends typings.xmldsigjs.mod.Application

/* static members */
@JSImport("xadesjs", "Application")
@js.native
object Application extends js.Object {
  /**
    * Gets the crypto module from the Application
    */
  def crypto(): CryptoEx = js.native
  def isNodePlugin(): Boolean = js.native
  /**
    * Sets crypto engine for the current Application
    * @param  {string} name
    * @param  {Crypto} crypto
    * @returns void
    */
  def setEngine(name: String, crypto: Crypto_): Unit = js.native
}

