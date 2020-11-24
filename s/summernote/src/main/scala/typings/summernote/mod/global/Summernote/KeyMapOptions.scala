package typings.summernote.mod.global.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapOptions extends js.Object {
  
  var mac: js.UndefOr[KeyMapMacOptions] = js.native
  
  var pc: js.UndefOr[KeyMapPcOptions] = js.native
}
object KeyMapOptions {
  
  @scala.inline
  def apply(): KeyMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapOptions]
  }
  
  @scala.inline
  implicit class KeyMapOptionsOps[Self <: KeyMapOptions] (val x: Self) extends AnyVal {
    
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
    def setMac(value: KeyMapMacOptions): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    
    @scala.inline
    def setPc(value: KeyMapPcOptions): Self = this.set("pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePc: Self = this.set("pc", js.undefined)
  }
}
