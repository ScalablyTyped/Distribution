package typings.xmldsigjs

import typings.std.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationMod {
  
  @JSImport("xmldsigjs/build/types/application", "Application")
  @js.native
  class Application () extends StObject
  /* static members */
  object Application {
    
    @JSImport("xmldsigjs/build/types/application", "Application")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isNodePlugin(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodePlugin")().asInstanceOf[Boolean]
    
    /**
      * Sets crypto engine for the current Application
      * @param  {string} name
      * @param  {Crypto} crypto
      * @returns void
      */
    @scala.inline
    def setEngine(name: String, crypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait CryptoEx
    extends StObject
       with Crypto {
    
    var name: String = js.native
  }
}
