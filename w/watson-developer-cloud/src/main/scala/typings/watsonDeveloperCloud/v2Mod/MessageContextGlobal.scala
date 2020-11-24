package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information that is shared by all skills used by the Assistant. */
@js.native
trait MessageContextGlobal extends js.Object {
  
  /** Built-in system properties that apply to all skills used by the assistant. */
  var system: js.UndefOr[MessageContextGlobalSystem] = js.native
}
object MessageContextGlobal {
  
  @scala.inline
  def apply(): MessageContextGlobal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextGlobal]
  }
  
  @scala.inline
  implicit class MessageContextGlobalOps[Self <: MessageContextGlobal] (val x: Self) extends AnyVal {
    
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
    def setSystem(value: MessageContextGlobalSystem): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
}
