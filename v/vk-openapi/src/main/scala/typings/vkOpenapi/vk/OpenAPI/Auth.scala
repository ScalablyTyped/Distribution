package typings.vkOpenapi.vk.OpenAPI

import typings.vkOpenapi.anon.Domain
import typings.vkOpenapi.vkOpenapiStrings.connected
import typings.vkOpenapi.vkOpenapiStrings.not_authorized
import typings.vkOpenapi.vkOpenapiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Auth {
  
  @js.native
  trait API extends StObject {
    
    def getLoginStatus(cb: js.Function1[/* status */ LoginStatus, Unit]): Unit = js.native
    
    def getSession(cb: js.Function1[/* session */ Session, Unit]): Unit = js.native
    
    def login(cb: js.Function1[/* status */ LoginStatus, Unit], settings: Double): Unit = js.native
    
    def logout(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit = js.native
    
    def revokeGrants(cb: js.Function1[/* status */ EmptyLoginStatus, Unit]): Unit = js.native
  }
  object API {
    
    @scala.inline
    def apply(
      getLoginStatus: js.Function1[/* status */ LoginStatus, Unit] => Unit,
      getSession: js.Function1[/* session */ Session, Unit] => Unit,
      login: (js.Function1[/* status */ LoginStatus, Unit], Double) => Unit,
      logout: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit,
      revokeGrants: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit
    ): API = {
      val __obj = js.Dynamic.literal(getLoginStatus = js.Any.fromFunction1(getLoginStatus), getSession = js.Any.fromFunction1(getSession), login = js.Any.fromFunction2(login), logout = js.Any.fromFunction1(logout), revokeGrants = js.Any.fromFunction1(revokeGrants))
      __obj.asInstanceOf[API]
    }
    
    @scala.inline
    implicit class APIMutableBuilder[Self <: API] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLoginStatus(value: js.Function1[/* status */ LoginStatus, Unit] => Unit): Self = StObject.set(x, "getLoginStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSession(value: js.Function1[/* session */ Session, Unit] => Unit): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogin(value: (js.Function1[/* status */ LoginStatus, Unit], Double) => Unit): Self = StObject.set(x, "login", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogout(value: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit): Self = StObject.set(x, "logout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRevokeGrants(value: js.Function1[/* status */ EmptyLoginStatus, Unit] => Unit): Self = StObject.set(x, "revokeGrants", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait EmptyLoginStatus extends StObject {
    
    var session: Null = js.native
    
    var settings: js.UndefOr[scala.Nothing] = js.native
    
    var status: unknown = js.native
  }
  object EmptyLoginStatus {
    
    @scala.inline
    def apply(session: Null, status: unknown): EmptyLoginStatus = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmptyLoginStatus]
    }
    
    @scala.inline
    implicit class EmptyLoginStatusMutableBuilder[Self <: EmptyLoginStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Null): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoginStatus extends StObject {
    
    var session: Session = js.native
    
    var status: connected | not_authorized | unknown = js.native
  }
  object LoginStatus {
    
    @scala.inline
    def apply(session: Session, status: connected | not_authorized | unknown): LoginStatus = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginStatus]
    }
    
    @scala.inline
    implicit class LoginStatusMutableBuilder[Self <: LoginStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: connected | not_authorized | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Session extends StObject {
    
    var expire: Double = js.native
    
    var mid: Double = js.native
    
    var secret: String = js.native
    
    var sid: String = js.native
    
    var sig: String = js.native
    
    var user: Domain = js.native
  }
  object Session {
    
    @scala.inline
    def apply(expire: Double, mid: Double, secret: String, sid: String, sig: String, user: Domain): Session = {
      val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMid(value: Double): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: Domain): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
