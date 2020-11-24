package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEntry extends ResponseEntry {
  
  var cluid: String = js.native
  
  var flagRead: Boolean = js.native
  
  var msgid: String = js.native
  
  var subject: String = js.native
  
  var timestamp: Double = js.native
}
object MessageEntry {
  
  @scala.inline
  def apply(cluid: String, flagRead: Boolean, msgid: String, subject: String, timestamp: Double): MessageEntry = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], flagRead = flagRead.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEntry]
  }
  
  @scala.inline
  implicit class MessageEntryOps[Self <: MessageEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCluid(value: String): Self = this.set("cluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagRead(value: Boolean): Self = this.set("flagRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgid(value: String): Self = this.set("msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
