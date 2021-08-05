package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.usersClientMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symBotAuthMod {
  
  @JSImport("symphony-api-client-node/SymBotAuth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBotUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBotUser")().asInstanceOf[Unit]
  
  inline def oboAuthenticateByUserId(userId: Double): js.Promise[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("oboAuthenticateByUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Token]]
  
  inline def verifyJwt(jwt: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyJwt")(jwt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait BotUser
    extends StObject
       with User {
    
    var roles: js.Array[String]
  }
  object BotUser {
    
    inline def apply(
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
    
    extension [Self <: BotUser](x: Self) {
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    }
  }
  
  trait Token extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var sessionToken: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object Token {
    
    inline def apply(): Token = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
