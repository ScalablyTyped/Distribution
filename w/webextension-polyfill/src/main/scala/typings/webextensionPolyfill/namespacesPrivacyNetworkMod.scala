package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesTypesMod.Types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesPrivacyNetworkMod {
  
  object PrivacyNetwork {
    
    /**
      * The mode for https-only mode.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.always
      - typings.webextensionPolyfill.webextensionPolyfillStrings.private_browsing
      - typings.webextensionPolyfill.webextensionPolyfillStrings.never
    */
    trait HTTPSOnlyModeOption extends StObject
    object HTTPSOnlyModeOption {
      
      inline def always: typings.webextensionPolyfill.webextensionPolyfillStrings.always = "always".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.always]
      
      inline def never: typings.webextensionPolyfill.webextensionPolyfillStrings.never = "never".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.never]
      
      inline def private_browsing: typings.webextensionPolyfill.webextensionPolyfillStrings.private_browsing = "private_browsing".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.private_browsing]
    }
    
    /**
      * The IP handling policy of WebRTC.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.default
      - typings.webextensionPolyfill.webextensionPolyfillStrings.default_public_and_private_interfaces
      - typings.webextensionPolyfill.webextensionPolyfillStrings.default_public_interface_only
      - typings.webextensionPolyfill.webextensionPolyfillStrings.disable_non_proxied_udp
      - typings.webextensionPolyfill.webextensionPolyfillStrings.proxy_only
    */
    trait IPHandlingPolicy extends StObject
    object IPHandlingPolicy {
      
      inline def default: typings.webextensionPolyfill.webextensionPolyfillStrings.default = "default".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.default]
      
      inline def default_public_and_private_interfaces: typings.webextensionPolyfill.webextensionPolyfillStrings.default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.default_public_and_private_interfaces]
      
      inline def default_public_interface_only: typings.webextensionPolyfill.webextensionPolyfillStrings.default_public_interface_only = "default_public_interface_only".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.default_public_interface_only]
      
      inline def disable_non_proxied_udp: typings.webextensionPolyfill.webextensionPolyfillStrings.disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.disable_non_proxied_udp]
      
      inline def proxy_only: typings.webextensionPolyfill.webextensionPolyfillStrings.proxy_only = "proxy_only".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.proxy_only]
    }
    
    trait Static extends StObject {
      
      /**
        * Allow users to query the status of 'Global Privacy Control'. This setting's value is of type boolean,
        * defaulting to <code>false</code>.
        */
      var globalPrivacyControl: Setting
      
      /**
        * Allow users to query the mode for 'HTTPS-Only Mode'. This setting's value is of type HTTPSOnlyModeOption,
        * defaulting to <code>never</code>.
        */
      var httpsOnlyMode: Setting
      
      /**
        * If enabled, the browser attempts to speed up your web browsing experience by pre-resolving DNS entries,
        * prerendering sites (<code>&lt;link rel='prefetch' ...&gt;</code>), and preemptively opening TCP and SSL connections to
        * servers.  This preference's value is a boolean, defaulting to <code>true</code>.
        */
      var networkPredictionEnabled: Setting
      
      /**
        * Allow users to enable and disable RTCPeerConnections (aka WebRTC).
        */
      var peerConnectionEnabled: Setting
      
      /**
        * This property controls the minimum and maximum TLS versions. This setting's value is an object of
        * $(ref:tlsVersionRestrictionConfig).
        */
      var tlsVersionRestriction: Setting
      
      /**
        * Allow users to specify the media performance/privacy tradeoffs which impacts how WebRTC traffic will be routed and how
        * much local address information is exposed. This preference's value is of type IPHandlingPolicy, defaulting to <code>
        * default</code>.
        */
      var webRTCIPHandlingPolicy: Setting
    }
    object Static {
      
      inline def apply(
        globalPrivacyControl: Setting,
        httpsOnlyMode: Setting,
        networkPredictionEnabled: Setting,
        peerConnectionEnabled: Setting,
        tlsVersionRestriction: Setting,
        webRTCIPHandlingPolicy: Setting
      ): Static = {
        val __obj = js.Dynamic.literal(globalPrivacyControl = globalPrivacyControl.asInstanceOf[js.Any], httpsOnlyMode = httpsOnlyMode.asInstanceOf[js.Any], networkPredictionEnabled = networkPredictionEnabled.asInstanceOf[js.Any], peerConnectionEnabled = peerConnectionEnabled.asInstanceOf[js.Any], tlsVersionRestriction = tlsVersionRestriction.asInstanceOf[js.Any], webRTCIPHandlingPolicy = webRTCIPHandlingPolicy.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setGlobalPrivacyControl(value: Setting): Self = StObject.set(x, "globalPrivacyControl", value.asInstanceOf[js.Any])
        
        inline def setHttpsOnlyMode(value: Setting): Self = StObject.set(x, "httpsOnlyMode", value.asInstanceOf[js.Any])
        
        inline def setNetworkPredictionEnabled(value: Setting): Self = StObject.set(x, "networkPredictionEnabled", value.asInstanceOf[js.Any])
        
        inline def setPeerConnectionEnabled(value: Setting): Self = StObject.set(x, "peerConnectionEnabled", value.asInstanceOf[js.Any])
        
        inline def setTlsVersionRestriction(value: Setting): Self = StObject.set(x, "tlsVersionRestriction", value.asInstanceOf[js.Any])
        
        inline def setWebRTCIPHandlingPolicy(value: Setting): Self = StObject.set(x, "webRTCIPHandlingPolicy", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The maximum TLS version supported.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot1
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot2
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot3
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unknown
    */
    trait TlsVersionRestrictionConfigMaximumEnum extends StObject
    object TlsVersionRestrictionConfigMaximumEnum {
      
      inline def TLSv1: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1 = "TLSv1".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1]
      
      inline def TLSv1Dot1: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot1]
      
      inline def TLSv1Dot2: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot2]
      
      inline def TLSv1Dot3: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot3]
      
      inline def unknown: typings.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unknown]
    }
    
    /**
      * The minimum TLS version supported.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot1
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot2
      - typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot3
      - typings.webextensionPolyfill.webextensionPolyfillStrings.unknown
    */
    trait TlsVersionRestrictionConfigMinimumEnum extends StObject
    object TlsVersionRestrictionConfigMinimumEnum {
      
      inline def TLSv1: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1 = "TLSv1".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1]
      
      inline def TLSv1Dot1: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot1]
      
      inline def TLSv1Dot2: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot2]
      
      inline def TLSv1Dot3: typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.TLSv1Dot3]
      
      inline def unknown: typings.webextensionPolyfill.webextensionPolyfillStrings.unknown = "unknown".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.unknown]
    }
    
    /**
      * An object which describes TLS minimum and maximum versions.
      */
    trait tlsVersionRestrictionConfig extends StObject {
      
      /**
        * The maximum TLS version supported.
        * Optional.
        */
      var maximum: js.UndefOr[TlsVersionRestrictionConfigMaximumEnum] = js.undefined
      
      /**
        * The minimum TLS version supported.
        * Optional.
        */
      var minimum: js.UndefOr[TlsVersionRestrictionConfigMinimumEnum] = js.undefined
    }
    object tlsVersionRestrictionConfig {
      
      inline def apply(): tlsVersionRestrictionConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[tlsVersionRestrictionConfig]
      }
      
      extension [Self <: tlsVersionRestrictionConfig](x: Self) {
        
        inline def setMaximum(value: TlsVersionRestrictionConfigMaximumEnum): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
        
        inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
        
        inline def setMinimum(value: TlsVersionRestrictionConfigMinimumEnum): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      }
    }
  }
}
