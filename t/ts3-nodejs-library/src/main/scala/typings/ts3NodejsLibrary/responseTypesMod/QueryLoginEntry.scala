package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryLoginEntry extends ResponseEntry {
  
  var cldbid: String = js.native
  
  var clientLoginName: String = js.native
  
  var sid: String = js.native
}
object QueryLoginEntry {
  
  @scala.inline
  def apply(cldbid: String, clientLoginName: String, sid: String): QueryLoginEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginEntry]
  }
  
  @scala.inline
  implicit class QueryLoginEntryMutableBuilder[Self <: QueryLoginEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
  }
}
