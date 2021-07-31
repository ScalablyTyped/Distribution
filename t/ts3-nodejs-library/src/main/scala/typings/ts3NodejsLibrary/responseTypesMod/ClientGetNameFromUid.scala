package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientGetNameFromUid
  extends StObject
     with ResponseEntry {
  
  var cldbid: String
  
  var cluid: String
  
  var name: String
}
object ClientGetNameFromUid {
  
  @scala.inline
  def apply(cldbid: String, cluid: String, name: String): ClientGetNameFromUid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetNameFromUid]
  }
  
  @scala.inline
  implicit class ClientGetNameFromUidMutableBuilder[Self <: ClientGetNameFromUid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
