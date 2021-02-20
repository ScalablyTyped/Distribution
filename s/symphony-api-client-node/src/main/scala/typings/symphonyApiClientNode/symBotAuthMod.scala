package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.usersClientMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symBotAuthMod {
  
  @JSImport("symphony-api-client-node/SymBotAuth", "getBotUser")
  @js.native
  def getBotUser(): Unit = js.native
  
  @JSImport("symphony-api-client-node/SymBotAuth", "oboAuthenticateByUserId")
  @js.native
  def oboAuthenticateByUserId(userId: Double): js.Promise[Token] = js.native
  
  @JSImport("symphony-api-client-node/SymBotAuth", "verifyJwt")
  @js.native
  def verifyJwt(jwt: String): js.Promise[String] = js.native
  
  @js.native
  trait BotUser extends User {
    
    var roles: js.Array[String] = js.native
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
  
  @js.native
  trait Token extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var sessionToken: js.UndefOr[String] = js.native
    
    var token: js.UndefOr[String] = js.native
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
