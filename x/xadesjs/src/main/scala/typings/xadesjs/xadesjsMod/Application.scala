package typings.xadesjs.xadesjsMod

import typings.std.Crypto
import typings.xmldsigjs.buildTypesApplicationMod.CryptoEx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs", "Application")
@js.native
class Application ()
  extends typings.xmldsigjs.xmldsigjsMod.Application

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
  def setEngine(name: String, crypto: Crypto): Unit = js.native
}

