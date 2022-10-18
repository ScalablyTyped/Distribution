package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerTempPasswordEntry
  extends StObject
     with ResponseEntry {
  
  var desc: String
  
  var end: Double
  
  var nickname: String
  
  var pwClear: String
  
  var start: Double
  
  var tcid: String
  
  var uid: String
}
object ServerTempPasswordEntry {
  
  inline def apply(
    desc: String,
    end: Double,
    nickname: String,
    pwClear: String,
    start: Double,
    tcid: String,
    uid: String
  ): ServerTempPasswordEntry = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], pwClear = pwClear.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tcid = tcid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTempPasswordEntry]
  }
  
  extension [Self <: ServerTempPasswordEntry](x: Self) {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setPwClear(value: String): Self = StObject.set(x, "pwClear", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTcid(value: String): Self = StObject.set(x, "tcid", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
