package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupCopy extends ResponseEntry {
  
  /** only available when a new group gets created */
  var sgid: js.UndefOr[String] = js.native
}
object ServerGroupCopy {
  
  @scala.inline
  def apply(): ServerGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupCopy]
  }
  
  @scala.inline
  implicit class ServerGroupCopyOps[Self <: ServerGroupCopy] (val x: Self) extends AnyVal {
    
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
    def setSgid(value: String): Self = this.set("sgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSgid: Self = this.set("sgid", js.undefined)
  }
}
