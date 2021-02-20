package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupEntry extends ResponseEntry {
  
  var iconid: String = js.native
  
  var nMemberAddp: Double = js.native
  
  var nMemberRemovep: Double = js.native
  
  var nModifyp: Double = js.native
  
  var name: String = js.native
  
  var namemode: Double = js.native
  
  var savedb: Double = js.native
  
  var sgid: String = js.native
  
  var sortid: Double = js.native
  
  var `type`: Double = js.native
}
object ServerGroupEntry {
  
  @scala.inline
  def apply(
    iconid: String,
    nMemberAddp: Double,
    nMemberRemovep: Double,
    nModifyp: Double,
    name: String,
    namemode: Double,
    savedb: Double,
    sgid: String,
    sortid: Double,
    `type`: Double
  ): ServerGroupEntry = {
    val __obj = js.Dynamic.literal(iconid = iconid.asInstanceOf[js.Any], nMemberAddp = nMemberAddp.asInstanceOf[js.Any], nMemberRemovep = nMemberRemovep.asInstanceOf[js.Any], nModifyp = nModifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerGroupEntry]
  }
  
  @scala.inline
  implicit class ServerGroupEntryMutableBuilder[Self <: ServerGroupEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconid(value: String): Self = StObject.set(x, "iconid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNMemberAddp(value: Double): Self = StObject.set(x, "nMemberAddp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNMemberRemovep(value: Double): Self = StObject.set(x, "nMemberRemovep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNModifyp(value: Double): Self = StObject.set(x, "nModifyp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamemode(value: Double): Self = StObject.set(x, "namemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedb(value: Double): Self = StObject.set(x, "savedb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortid(value: Double): Self = StObject.set(x, "sortid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
