package typings.tizenTvWebapis

import typings.tizenTvWebapis.webapisMod.ErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssoMod {
  
  @js.native
  sealed trait SsoLoginState extends StObject
  @JSImport("tizen-tv-webapis/sso", "SsoLoginState")
  @js.native
  object SsoLoginState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SsoLoginState with Double] = js.native
    
    /**
      * Logged in
      */
    @js.native
    sealed trait SSO_LOGIN extends SsoLoginState
    /* 1 */ val SSO_LOGIN: typings.tizenTvWebapis.ssoMod.SsoLoginState.SSO_LOGIN with Double = js.native
    
    /**
      * Not logged in
      */
    @js.native
    sealed trait SSO_NOT_LOGIN extends SsoLoginState
    /* 0 */ val SSO_NOT_LOGIN: typings.tizenTvWebapis.ssoMod.SsoLoginState.SSO_NOT_LOGIN with Double = js.native
  }
  
  @js.native
  trait SsoCallData extends StObject {
    
    var status: String = js.native
  }
  object SsoCallData {
    
    @scala.inline
    def apply(status: String): SsoCallData = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SsoCallData]
    }
    
    @scala.inline
    implicit class SsoCallDataMutableBuilder[Self <: SsoCallData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type SsoCallDataSuccessCallback = js.Function1[/* data */ SsoCallData, Unit]
  
  @js.native
  trait SsoData extends StObject {
    
    var authToken: String = js.native
    
    var bLogin: Boolean = js.native
    
    var guid: String = js.native
    
    var id: String = js.native
    
    var uid: String = js.native
  }
  object SsoData {
    
    @scala.inline
    def apply(authToken: String, bLogin: Boolean, guid: String, id: String, uid: String): SsoData = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], bLogin = bLogin.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SsoData]
    }
    
    @scala.inline
    implicit class SsoDataMutableBuilder[Self <: SsoData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBLogin(value: Boolean): Self = StObject.set(x, "bLogin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  type SsoDataSuccessCallback = js.Function1[/* data */ SsoData, Unit]
  
  @js.native
  trait SsoManager extends StObject {
    
    /**
      * Retrieves the SSO login status.
      * @returns  `SsoLoginState` A object of the current login state.
      * @privilegeLevel Partner
      * @privilegeName http://developer.samsung.com/privilege/sso.partner
      * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `SecurityError`, `UnknownError`
      * @since 2.3
      */
    def getLoginStatus(): SsoLoginState = js.native
    
    /**
      * Retrieves the UID.
      * The UID is considered personally-identifying information and must be handled according to the privacy regulations for each country.
      * It must not be used for any purpose other than as an input parameter for the Samsung Checkout API.
      * Whenever the UID value is sent outside the TV device, a secure protocol, such as HTTPS, must be used.
      * @returns string UID
      * @privilegeLevel Partner
      * @privilegeName http://developer.samsung.com/privilege/sso.partner
      * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `InvalidStateError`, `SecurityError`, `UnknownError`
      * @since 2.3
      */
    def getLoginUid(): String = js.native
    
    /**
      * Retrieves the plugin version number.
      * @returns string The version of the sso
      * @privilegeLevel Partner
      * @privilegeName http://developer.samsung.com/privilege/sso.partner
      * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `SecurityError`, `UnknownError`
      * @since 2.3
      */
    def getVersion(): String = js.native
    
    /**
      * Shows the SSO login or logout page, and returns the SSO login or logout information.
      * @param widgetName Widget name
      * @param onsuccess Callback method to invoke when the account page is shown
      * @param onerror Callback method to invoke if an error has occurred. It provides the status, error name, and error message.
      * @privilegeLevel Partner
      * @privilegeName http://developer.samsung.com/privilege/sso.partner
      * @throw `SecurityError`, `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `UnknownError`
      * @since 2.3
      */
    def showAccountView(widgetName: String, onsuccess: SsoCallDataSuccessCallback): Unit = js.native
    def showAccountView(widgetName: String, onsuccess: SsoCallDataSuccessCallback, onerror: ErrorCallback): Unit = js.native
    
    /**
      * Shows the SSO account creation screen.
      * @param onsuccess Callback method to invoke when the CreateAccountPage is shown
      * @param onerror Callback method to invoke if an error has occurred. It provides the status, error name, and error message.
      * @privilegeLevel Partner
      * @privilegeName http://developer.samsung.com/privilege/sso.partner
      * @throw `TypeMismatchError`, `NotSupportedError`, `InvalidValuesError`, `UnknownError`
      * @since 2.3
      */
    def showCreateAccountView(onsuccess: SsoStringSuccessCallback): Unit = js.native
    def showCreateAccountView(onsuccess: SsoStringSuccessCallback, onerror: ErrorCallback): Unit = js.native
  }
  
  type SsoStringSuccessCallback = js.Function1[/* data */ String, Unit]
}
