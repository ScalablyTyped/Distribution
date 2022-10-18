package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesTypesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesCaptivePortalMod {
  
  object CaptivePortal {
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.captive
      - typings.webextensionPolyfill.webextensionPolyfillStrings.clear
    */
    trait OnConnectivityAvailableStatusEnum extends StObject
    object OnConnectivityAvailableStatusEnum {
      
      inline def captive: typings.webextensionPolyfill.webextensionPolyfillStrings.captive = "captive".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.captive]
      
      inline def clear: typings.webextensionPolyfill.webextensionPolyfillStrings.clear = "clear".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.clear]
    }
    
    trait OnStateChangedDetailsType extends StObject {
      
      /**
        * The current captive portal state.
        */
      var state: OnStateChangedDetailsTypeStateEnum
    }
    object OnStateChangedDetailsType {
      
      inline def apply(state: OnStateChangedDetailsTypeStateEnum): OnStateChangedDetailsType = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnStateChangedDetailsType]
      }
      
      extension [Self <: OnStateChangedDetailsType](x: Self) {
        
        inline def setState(value: OnStateChangedDetailsTypeStateEnum): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The current captive portal state.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unknown
      - typings.webextensionPolyfill.webextensionPolyfillStrings.not_captive
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unlocked_portal
      - typings.webextensionPolyfill.webextensionPolyfillStrings.locked_portal
    */
    trait OnStateChangedDetailsTypeStateEnum extends StObject
    object OnStateChangedDetailsTypeStateEnum {
      
      inline def locked_portal: typings.webextensionPolyfill.webextensionPolyfillStrings.locked_portal = "locked_portal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.locked_portal]
      
      inline def not_captive: typings.webextensionPolyfill.webextensionPolyfillStrings.not_captive = "not_captive".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.not_captive]
      
      inline def unknown: typings.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unknown]
      
      inline def unlocked_portal: typings.webextensionPolyfill.webextensionPolyfillStrings.unlocked_portal = "unlocked_portal".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unlocked_portal]
    }
    
    trait Static extends StObject {
      
      /**
        * Return the canonical captive-portal detection URL. Read-only.
        */
      var canonicalURL: Setting
      
      /**
        * Returns the time difference between NOW and the last time a request was completed in milliseconds.
        */
      def getLastChecked(): Unit
      
      /**
        * Returns the current portal state, one of `unknown`, `not_captive`, `unlocked_portal`, `locked_portal`.
        */
      def getState(): Unit
      
      /**
        * This notification will be emitted when the captive portal service has determined that we can connect to the internet.
        * The service will pass either `captive` if there is an unlocked captive portal present,
        * or `clear` if no captive portal was detected.
        *
        * @param status
        */
      var onConnectivityAvailable: Event[js.Function1[/* status */ OnConnectivityAvailableStatusEnum, Unit]]
      
      /**
        * Fired when the captive portal state changes.
        *
        * @param details
        */
      var onStateChanged: Event[js.Function1[/* details */ OnStateChangedDetailsType, Unit]]
    }
    object Static {
      
      inline def apply(
        canonicalURL: Setting,
        getLastChecked: () => Unit,
        getState: () => Unit,
        onConnectivityAvailable: Event[js.Function1[/* status */ OnConnectivityAvailableStatusEnum, Unit]],
        onStateChanged: Event[js.Function1[/* details */ OnStateChangedDetailsType, Unit]]
      ): Static = {
        val __obj = js.Dynamic.literal(canonicalURL = canonicalURL.asInstanceOf[js.Any], getLastChecked = js.Any.fromFunction0(getLastChecked), getState = js.Any.fromFunction0(getState), onConnectivityAvailable = onConnectivityAvailable.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setCanonicalURL(value: Setting): Self = StObject.set(x, "canonicalURL", value.asInstanceOf[js.Any])
        
        inline def setGetLastChecked(value: () => Unit): Self = StObject.set(x, "getLastChecked", js.Any.fromFunction0(value))
        
        inline def setGetState(value: () => Unit): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
        
        inline def setOnConnectivityAvailable(value: Event[js.Function1[/* status */ OnConnectivityAvailableStatusEnum, Unit]]): Self = StObject.set(x, "onConnectivityAvailable", value.asInstanceOf[js.Any])
        
        inline def setOnStateChanged(value: Event[js.Function1[/* details */ OnStateChangedDetailsType, Unit]]): Self = StObject.set(x, "onStateChanged", value.asInstanceOf[js.Any])
      }
    }
  }
}
