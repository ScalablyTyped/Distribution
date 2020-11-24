package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** MessageContext. */
@js.native
trait MessageContext extends js.Object {
  
  /** Information that is shared by all skills used by the Assistant. */
  var global: js.UndefOr[MessageContextGlobal] = js.native
  
  /** Information specific to particular skills used by the Assistant. **Note:** Currently, only a single property named `main skill` is supported. This object contains variables that apply to the dialog skill used by the assistant. */
  var skills: js.UndefOr[MessageContextSkills] = js.native
}
object MessageContext {
  
  @scala.inline
  def apply(): MessageContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContext]
  }
  
  @scala.inline
  implicit class MessageContextOps[Self <: MessageContext] (val x: Self) extends AnyVal {
    
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
    def setGlobal(value: MessageContextGlobal): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setSkills(value: MessageContextSkills): Self = this.set("skills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkills: Self = this.set("skills", js.undefined)
  }
}
