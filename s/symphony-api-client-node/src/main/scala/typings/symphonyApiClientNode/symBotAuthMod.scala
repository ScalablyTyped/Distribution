package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.usersClientMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symBotAuthMod {
  
  @JSImport("symphony-api-client-node/SymBotAuth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBotUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBotUser")().asInstanceOf[Unit]
  
  @scala.inline
  def oboAuthenticateByUserId(userId: Double): js.Promise[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("oboAuthenticateByUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Token]]
  
  @scala.inline
  def verifyJwt(jwt: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwt")(jwt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait BotUser
    extends StObject
       with User {
    
    var roles: js.Array[String]
  }
  object BotUser {
    
    @scala.inline
    def apply(
      displayName: String,
      emailAddress: String,
      firstName: String,
      id: String,
      lastName: String,
      roles: js.Array[String]
    ): BotUser = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BotUser]
    }
    
    @scala.inline
    implicit class BotUserMutableBuilder[Self <: BotUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    }
  }
  
  trait Token extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var sessionToken: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object Token {
    
    @scala.inline
    def apply(): Token = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
