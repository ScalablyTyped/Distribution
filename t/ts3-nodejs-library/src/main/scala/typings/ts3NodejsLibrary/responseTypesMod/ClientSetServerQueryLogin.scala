package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSetServerQueryLogin extends ResponseEntry {
  
  var clientLoginPassword: String = js.native
}
object ClientSetServerQueryLogin {
  
  @scala.inline
  def apply(clientLoginPassword: String): ClientSetServerQueryLogin = {
    val __obj = js.Dynamic.literal(clientLoginPassword = clientLoginPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSetServerQueryLogin]
  }
  
  @scala.inline
  implicit class ClientSetServerQueryLoginMutableBuilder[Self <: ClientSetServerQueryLogin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientLoginPassword(value: String): Self = StObject.set(x, "clientLoginPassword", value.asInstanceOf[js.Any])
  }
}
