package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEntry
  extends StObject
     with ResponseEntry {
  
  var cluid: String
  
  var flagRead: Boolean
  
  var msgid: String
  
  var subject: String
  
  var timestamp: Double
}
object MessageEntry {
  
  inline def apply(cluid: String, flagRead: Boolean, msgid: String, subject: String, timestamp: Double): MessageEntry = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], flagRead = flagRead.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageEntry] (val x: Self) extends AnyVal {
    
    inline def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    inline def setFlagRead(value: Boolean): Self = StObject.set(x, "flagRead", value.asInstanceOf[js.Any])
    
    inline def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
