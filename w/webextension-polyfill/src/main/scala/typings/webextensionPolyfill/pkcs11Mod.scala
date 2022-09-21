package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs11Mod {
  
  object Pkcs11 {
    
    trait ModuleSlot extends StObject {
      
      /**
        * The name of the slot.
        */
      var name: String
      
      /**
        * The token of the slot.
        */
      var token: Token | Null
    }
    object ModuleSlot {
      
      inline def apply(name: String): ModuleSlot = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], token = null)
        __obj.asInstanceOf[ModuleSlot]
      }
      
      extension [Self <: ModuleSlot](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenNull: Self = StObject.set(x, "token", null)
      }
    }
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Enumerate a module's slots, each with their name and whether a token is present
        *
        * @param name
        */
      def getModuleSlots(name: String): js.Promise[Unit] = js.native
      
      /**
        * Install a PKCS#11 module with a given name
        *
        * @param name
        * @param flags Optional.
        */
      def installModule(name: String): js.Promise[Unit] = js.native
      def installModule(name: String, flags: Double): js.Promise[Unit] = js.native
      
      /**
        * checks whether a PKCS#11 module, given by name, is installed
        *
        * @param name
        */
      def isModuleInstalled(name: String): js.Promise[Boolean] = js.native
      
      /**
        * Remove an installed PKCS#11 module from firefox
        *
        * @param name
        */
      def uninstallModule(name: String): js.Promise[Unit] = js.native
    }
    
    trait Token extends StObject {
      
      /**
        * Firmware version, as a PKCS #11 version number (two 32-bit integers separated with a dot, like "1.0".
        */
      var FWVersion: String
      
      /**
        * Hardware version, as a PKCS #11 version number (two 32-bit integers separated with a dot, like "1.0".
        */
      var HWVersion: String
      
      /**
        * true if the token is logged on already, false otherwise.
        */
      var isLoggedIn: Boolean
      
      /**
        * Name of the token's manufacturer.
        */
      var manufacturer: String
      
      /**
        * Name of the token.
        */
      var name: String
      
      /**
        * Serial number, whose format is defined by the token specification.
        */
      var serial: String
    }
    object Token {
      
      inline def apply(
        FWVersion: String,
        HWVersion: String,
        isLoggedIn: Boolean,
        manufacturer: String,
        name: String,
        serial: String
      ): Token = {
        val __obj = js.Dynamic.literal(FWVersion = FWVersion.asInstanceOf[js.Any], HWVersion = HWVersion.asInstanceOf[js.Any], isLoggedIn = isLoggedIn.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
        __obj.asInstanceOf[Token]
      }
      
      extension [Self <: Token](x: Self) {
        
        inline def setFWVersion(value: String): Self = StObject.set(x, "FWVersion", value.asInstanceOf[js.Any])
        
        inline def setHWVersion(value: String): Self = StObject.set(x, "HWVersion", value.asInstanceOf[js.Any])
        
        inline def setIsLoggedIn(value: Boolean): Self = StObject.set(x, "isLoggedIn", value.asInstanceOf[js.Any])
        
        inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      }
    }
  }
}
