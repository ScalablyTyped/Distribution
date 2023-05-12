package typings.twilio

import typings.twilio.libRestOauthBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestOauthV1Mod {
  
  @JSImport("twilio/lib/rest/oauth/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Oauth
      *
      * @param domain - The Twilio (Twilio.Oauth) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** deviceCode - { Twilio.Oauth.V1.DeviceCodeListInstance } resource */
    /* protected */ var _deviceCode: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceCodeListInstance */ Any
      ] = js.native
    
    /** oauth - { Twilio.Oauth.V1.OauthListInstance } resource */
    /* protected */ var _oauth: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OauthListInstance */ Any
      ] = js.native
    
    /** openidDiscovery - { Twilio.Oauth.V1.OpenidDiscoveryListInstance } resource */
    /* protected */ var _openidDiscovery: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpenidDiscoveryListInstance */ Any
      ] = js.native
    
    /** token - { Twilio.Oauth.V1.TokenListInstance } resource */
    /* protected */ var _token: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TokenListInstance */ Any
      ] = js.native
    
    /** userInfo - { Twilio.Oauth.V1.UserInfoListInstance } resource */
    /* protected */ var _userInfo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserInfoListInstance */ Any
      ] = js.native
    
    /** Getter for deviceCode resource */
    def deviceCode: Any = js.native
    
    /** Getter for oauth resource */
    def oauth: Any = js.native
    
    /** Getter for openidDiscovery resource */
    def openidDiscovery: Any = js.native
    
    /** Getter for token resource */
    def token: Any = js.native
    
    /** Getter for userInfo resource */
    def userInfo: Any = js.native
  }
}
