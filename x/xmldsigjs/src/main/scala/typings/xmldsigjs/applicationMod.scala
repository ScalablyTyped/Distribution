package typings.xmldsigjs

import typings.std.Crypto_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/application", JSImport.Namespace)
@js.native
object applicationMod extends js.Object {
  @js.native
  class Application () extends js.Object
  
  @js.native
  trait CryptoEx extends Crypto_ {
    var name: String = js.native
  }
  
  /* static members */
  @js.native
  object Application extends js.Object {
    /**
      * Gets the crypto module from the Application
      */
    def crypto: CryptoEx = js.native
    def isNodePlugin(): Boolean = js.native
    /**
      * Sets crypto engine for the current Application
      * @param  {string} name
      * @param  {Crypto} crypto
      * @returns void
      */
    def setEngine(name: String, crypto: Crypto_): Unit = js.native
  }
  
}

