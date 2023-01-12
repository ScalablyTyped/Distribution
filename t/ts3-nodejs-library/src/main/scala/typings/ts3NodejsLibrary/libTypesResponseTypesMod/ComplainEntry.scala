package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplainEntry
  extends StObject
     with ResponseEntry {
  
  var fcldbid: String
  
  var fname: String
  
  var message: String
  
  var tcldbid: String
  
  var timestamp: Double
  
  var tname: String
}
object ComplainEntry {
  
  inline def apply(fcldbid: String, fname: String, message: String, tcldbid: String, timestamp: Double, tname: String): ComplainEntry = {
    val __obj = js.Dynamic.literal(fcldbid = fcldbid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tcldbid = tcldbid.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplainEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplainEntry] (val x: Self) extends AnyVal {
    
    inline def setFcldbid(value: String): Self = StObject.set(x, "fcldbid", value.asInstanceOf[js.Any])
    
    inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTcldbid(value: String): Self = StObject.set(x, "tcldbid", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTname(value: String): Self = StObject.set(x, "tname", value.asInstanceOf[js.Any])
  }
}
