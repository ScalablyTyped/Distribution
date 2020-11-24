package typings.wanakana.mod

import typings.std.Record
import typings.wanakana.wanakanaStrings.hepburn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WanakanaOptions extends js.Object {
  
  var IMEMode: js.UndefOr[IMEModes] = js.native
  
  var customKanaMapping: js.UndefOr[Record[String, String]] = js.native
  
  var customRomajiMapping: js.UndefOr[Record[String, String]] = js.native
  
  var passRomaji: js.UndefOr[Boolean] = js.native
  
  var romanization: js.UndefOr[hepburn] = js.native
  
  var upcaseKatakana: js.UndefOr[Boolean] = js.native
  
  var useObsoleteKana: js.UndefOr[Boolean] = js.native
}
object WanakanaOptions {
  
  @scala.inline
  def apply(): WanakanaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WanakanaOptions]
  }
  
  @scala.inline
  implicit class WanakanaOptionsOps[Self <: WanakanaOptions] (val x: Self) extends AnyVal {
    
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
    def setIMEMode(value: IMEModes): Self = this.set("IMEMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIMEMode: Self = this.set("IMEMode", js.undefined)
    
    @scala.inline
    def setCustomKanaMapping(value: Record[String, String]): Self = this.set("customKanaMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomKanaMapping: Self = this.set("customKanaMapping", js.undefined)
    
    @scala.inline
    def setCustomRomajiMapping(value: Record[String, String]): Self = this.set("customRomajiMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRomajiMapping: Self = this.set("customRomajiMapping", js.undefined)
    
    @scala.inline
    def setPassRomaji(value: Boolean): Self = this.set("passRomaji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassRomaji: Self = this.set("passRomaji", js.undefined)
    
    @scala.inline
    def setRomanization(value: hepburn): Self = this.set("romanization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRomanization: Self = this.set("romanization", js.undefined)
    
    @scala.inline
    def setUpcaseKatakana(value: Boolean): Self = this.set("upcaseKatakana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpcaseKatakana: Self = this.set("upcaseKatakana", js.undefined)
    
    @scala.inline
    def setUseObsoleteKana(value: Boolean): Self = this.set("useObsoleteKana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseObsoleteKana: Self = this.set("useObsoleteKana", js.undefined)
  }
}
