package typings.xmldsigjs

import typings.std.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationMod {
  
  @JSImport("xmldsigjs/build/types/application", "Application")
  @js.native
  class Application () extends StObject
  /* static members */
  object Application {
    
    @JSImport("xmldsigjs/build/types/application", "Application.isNodePlugin")
    @js.native
    def isNodePlugin(): Boolean = js.native
    
    /**
      * Sets crypto engine for the current Application
      * @param  {string} name
      * @param  {Crypto} crypto
      * @returns void
      */
    @JSImport("xmldsigjs/build/types/application", "Application.setEngine")
    @js.native
    def setEngine(name: String, crypto: Crypto): Unit = js.native
  }
  
  @js.native
  trait CryptoEx extends Crypto {
    
    var name: String = js.native
  }
}
