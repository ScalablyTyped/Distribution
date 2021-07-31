package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BanEntry
  extends StObject
     with ResponseEntry {
  
  var banid: String
  
  var created: Double
  
  var duration: Double
  
  var enforcements: Double
  
  var invokercldbid: String
  
  var invokername: String
  
  var invokeruid: String
  
  var ip: String
  
  var lastnickname: String
  
  var mytsid: String
  
  var name: String
  
  var reason: String
  
  var uid: String
}
object BanEntry {
  
  @scala.inline
  def apply(
    banid: String,
    created: Double,
    duration: Double,
    enforcements: Double,
    invokercldbid: String,
    invokername: String,
    invokeruid: String,
    ip: String,
    lastnickname: String,
    mytsid: String,
    name: String,
    reason: String,
    uid: String
  ): BanEntry = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], enforcements = enforcements.asInstanceOf[js.Any], invokercldbid = invokercldbid.asInstanceOf[js.Any], invokername = invokername.asInstanceOf[js.Any], invokeruid = invokeruid.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lastnickname = lastnickname.asInstanceOf[js.Any], mytsid = mytsid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanEntry]
  }
  
  @scala.inline
  implicit class BanEntryMutableBuilder[Self <: BanEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanid(value: String): Self = StObject.set(x, "banid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcements(value: Double): Self = StObject.set(x, "enforcements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokercldbid(value: String): Self = StObject.set(x, "invokercldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokername(value: String): Self = StObject.set(x, "invokername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeruid(value: String): Self = StObject.set(x, "invokeruid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastnickname(value: String): Self = StObject.set(x, "lastnickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMytsid(value: String): Self = StObject.set(x, "mytsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
