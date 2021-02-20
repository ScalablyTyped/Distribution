package typings.stripe.mod

import typings.stripe.stripeStrings.authorization_code
import typings.stripe.stripeStrings.bearer
import typings.stripe.stripeStrings.refresh_token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth {
  
  @js.native
  trait IOAuthAuthorizationCodeTokenRequest extends StObject {
    
    /**
      * Check whether the suggested_capabilities were applied to the connected account.
      */
    var assert_capabilities: js.UndefOr[String] = js.native
    
    /**
      * The value of the code
      */
    var code: String = js.native
    
    /**
      * authorization_code when turning an authorization code into an access token
      */
    var grant_type: authorization_code = js.native
    
    /**
      * Has no effect when requesting an access token from an authorization code.
      */
    var scope: js.UndefOr[String] = js.native
  }
  object IOAuthAuthorizationCodeTokenRequest {
    
    @scala.inline
    def apply(code: String, grant_type: authorization_code): IOAuthAuthorizationCodeTokenRequest = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuthAuthorizationCodeTokenRequest]
    }
    
    @scala.inline
    implicit class IOAuthAuthorizationCodeTokenRequestMutableBuilder[Self <: IOAuthAuthorizationCodeTokenRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssert_capabilities(value: String): Self = StObject.set(x, "assert_capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssert_capabilitiesUndefined: Self = StObject.set(x, "assert_capabilities", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrant_type(value: authorization_code): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait IOAuthDeauthorizationResponse extends StObject {
    
    /**
      * The unique id of the account you have revoked access to, as a string. This is the same as the stripe_user_id you passed in. If this is returned, the revocation was successful.
      */
    var stripe_user_id: String = js.native
  }
  object IOAuthDeauthorizationResponse {
    
    @scala.inline
    def apply(stripe_user_id: String): IOAuthDeauthorizationResponse = {
      val __obj = js.Dynamic.literal(stripe_user_id = stripe_user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuthDeauthorizationResponse]
    }
    
    @scala.inline
    implicit class IOAuthDeauthorizationResponseMutableBuilder[Self <: IOAuthDeauthorizationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStripe_user_id(value: String): Self = StObject.set(x, "stripe_user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOAuthRefreshTokenRequest extends StObject {
    
    /**
      * Check whether the suggested_capabilities were applied to the connected account.
      */
    var assert_capabilities: js.UndefOr[String] = js.native
    
    /**
      * use a refresh token to get a new access token.
      */
    var grant_type: refresh_token = js.native
    
    /**
      * The value of the refresh_token
      */
    var refresh_token: String = js.native
    
    /**
      * When requesting a new access token from a refresh token, any scope that has an equal or lesser scope as the refresh token.
      *
      * Defaults to the scope of the refresh token.
      */
    var scope: js.UndefOr[String] = js.native
  }
  object IOAuthRefreshTokenRequest {
    
    @scala.inline
    def apply(grant_type: refresh_token, refresh_token: String): IOAuthRefreshTokenRequest = {
      val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuthRefreshTokenRequest]
    }
    
    @scala.inline
    implicit class IOAuthRefreshTokenRequestMutableBuilder[Self <: IOAuthRefreshTokenRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssert_capabilities(value: String): Self = StObject.set(x, "assert_capabilities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssert_capabilitiesUndefined: Self = StObject.set(x, "assert_capabilities", js.undefined)
      
      @scala.inline
      def setGrant_type(value: refresh_token): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait IOAuthToken extends StObject {
    
    /**
      * The access token you can use to make requests on behalf of this Stripe account. Use it as you would any Stripe secret API key.
      *
      * This key does not expire, but may be revoked by the user at any time (you'll get a account.application.deauthorized webhook event when this happens).
      */
    var access_token: String = js.native
    
    /**
      * The live mode indicator for the token. If true, the access_token can be used as a live secret key. If false, the access_token can be used as a test secret key.
      *
      * Depends on the mode of the secret API key used to make the request.
      */
    var livemode: Boolean = js.native
    
    /**
      * Can be used to get a new access token of an equal or lesser scope, or of a different live mode (where applicable).
      */
    var refresh_token: String = js.native
    
    /**
      * The scope granted to the access token, depending on the scope of the authorization code and scope parameter.
      */
    var scope: String = js.native
    
    /**
      * A publishable key that can be used with this account. Matches the mode—live or test—of the token.
      */
    var stripe_publishable_key: String = js.native
    
    /**
      * The unique id of the account you have been granted access to, as a string.
      */
    var stripe_user_id: String = js.native
    
    /**
      * Will always have a value of bearer.
      */
    var token_type: bearer = js.native
  }
  object IOAuthToken {
    
    @scala.inline
    def apply(
      access_token: String,
      livemode: Boolean,
      refresh_token: String,
      scope: String,
      stripe_publishable_key: String,
      stripe_user_id: String,
      token_type: bearer
    ): IOAuthToken = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], stripe_publishable_key = stripe_publishable_key.asInstanceOf[js.Any], stripe_user_id = stripe_user_id.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOAuthToken]
    }
    
    @scala.inline
    implicit class IOAuthTokenMutableBuilder[Self <: IOAuthToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripe_publishable_key(value: String): Self = StObject.set(x, "stripe_publishable_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripe_user_id(value: String): Self = StObject.set(x, "stripe_user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_type(value: bearer): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
}
