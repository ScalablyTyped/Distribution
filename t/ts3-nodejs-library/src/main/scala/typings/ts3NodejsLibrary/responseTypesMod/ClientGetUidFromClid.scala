package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientGetUidFromClid extends ResponseEntry {
  
  var clid: String = js.native
  
  var cluid: String = js.native
  
  var nickname: String = js.native
}
object ClientGetUidFromClid {
  
  @scala.inline
  def apply(clid: String, cluid: String, nickname: String): ClientGetUidFromClid = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetUidFromClid]
  }
  
  @scala.inline
  implicit class ClientGetUidFromClidMutableBuilder[Self <: ClientGetUidFromClid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
  }
}
