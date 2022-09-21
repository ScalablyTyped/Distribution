package typings.webextensionPolyfill

import typings.webextensionPolyfill.eventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkStatusMod {
  
  object NetworkStatus {
    
    trait NetworkLinkInfo extends StObject {
      
      /**
        * If known, the network id or name.
        * Optional.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Status of the network link, if "unknown" then link is usually assumed to be "up"
        */
      var status: NetworkLinkInfoStatusEnum
      
      /**
        * If known, the type of network connection that is avialable.
        */
      var `type`: NetworkLinkInfoTypeEnum
    }
    object NetworkLinkInfo {
      
      inline def apply(status: NetworkLinkInfoStatusEnum, `type`: NetworkLinkInfoTypeEnum): NetworkLinkInfo = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NetworkLinkInfo]
      }
      
      extension [Self <: NetworkLinkInfo](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setStatus(value: NetworkLinkInfoStatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setType(value: NetworkLinkInfoTypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Status of the network link, if "unknown" then link is usually assumed to be "up"
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unknown
      - typings.webextensionPolyfill.webextensionPolyfillStrings.up
      - typings.webextensionPolyfill.webextensionPolyfillStrings.down
    */
    trait NetworkLinkInfoStatusEnum extends StObject
    object NetworkLinkInfoStatusEnum {
      
      inline def down: typings.webextensionPolyfill.webextensionPolyfillStrings.down = "down".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.down]
      
      inline def unknown: typings.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unknown]
      
      inline def up: typings.webextensionPolyfill.webextensionPolyfillStrings.up = "up".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.up]
    }
    
    /**
      * If known, the type of network connection that is avialable.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unknown
      - typings.webextensionPolyfill.webextensionPolyfillStrings.ethernet
      - typings.webextensionPolyfill.webextensionPolyfillStrings.usb
      - typings.webextensionPolyfill.webextensionPolyfillStrings.wifi
      - typings.webextensionPolyfill.webextensionPolyfillStrings.wimax
      - typings.webextensionPolyfill.webextensionPolyfillStrings.mobile
    */
    trait NetworkLinkInfoTypeEnum extends StObject
    object NetworkLinkInfoTypeEnum {
      
      inline def ethernet: typings.webextensionPolyfill.webextensionPolyfillStrings.ethernet = "ethernet".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.ethernet]
      
      inline def mobile: typings.webextensionPolyfill.webextensionPolyfillStrings.mobile = "mobile".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.mobile]
      
      inline def unknown: typings.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unknown]
      
      inline def usb: typings.webextensionPolyfill.webextensionPolyfillStrings.usb = "usb".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.usb]
      
      inline def wifi: typings.webextensionPolyfill.webextensionPolyfillStrings.wifi = "wifi".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.wifi]
      
      inline def wimax: typings.webextensionPolyfill.webextensionPolyfillStrings.wimax = "wimax".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.wimax]
    }
    
    trait Static extends StObject {
      
      /**
        * Returns the $(ref:NetworkLinkInfo} of the current network connection.
        */
      def getLinkInfo(): Unit
      
      /**
        * Fired when the network connection state changes.
        *
        * @param details
        */
      var onConnectionChanged: Event[js.Function1[/* details */ NetworkLinkInfo, Unit]]
    }
    object Static {
      
      inline def apply(
        getLinkInfo: () => Unit,
        onConnectionChanged: Event[js.Function1[/* details */ NetworkLinkInfo, Unit]]
      ): Static = {
        val __obj = js.Dynamic.literal(getLinkInfo = js.Any.fromFunction0(getLinkInfo), onConnectionChanged = onConnectionChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setGetLinkInfo(value: () => Unit): Self = StObject.set(x, "getLinkInfo", js.Any.fromFunction0(value))
        
        inline def setOnConnectionChanged(value: Event[js.Function1[/* details */ NetworkLinkInfo, Unit]]): Self = StObject.set(x, "onConnectionChanged", value.asInstanceOf[js.Any])
      }
    }
  }
}
