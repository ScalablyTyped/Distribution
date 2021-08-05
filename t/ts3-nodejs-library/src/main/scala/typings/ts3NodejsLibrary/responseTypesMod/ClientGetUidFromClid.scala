package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientGetUidFromClid
  extends StObject
     with ResponseEntry {
  
  var clid: String
  
  var cluid: String
  
  var nickname: String
}
object ClientGetUidFromClid {
  
  inline def apply(clid: String, cluid: String, nickname: String): ClientGetUidFromClid = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetUidFromClid]
  }
  
  extension [Self <: ClientGetUidFromClid](x: Self) {
    
    inline def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    inline def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
  }
}
