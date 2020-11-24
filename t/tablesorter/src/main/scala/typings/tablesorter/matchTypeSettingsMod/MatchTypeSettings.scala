package typings.tablesorter.matchTypeSettingsMod

import typings.tablesorter.matchTypeMod.MatchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchTypeSettings extends js.Object {
  
  /**
    * The match-type for `input`-controls.
    */
  var input: js.UndefOr[MatchType] = js.native
  
  /**
    * The match-type for `select`-controls.
    */
  var select: js.UndefOr[MatchType] = js.native
}
object MatchTypeSettings {
  
  @scala.inline
  def apply(): MatchTypeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchTypeSettings]
  }
  
  @scala.inline
  implicit class MatchTypeSettingsOps[Self <: MatchTypeSettings] (val x: Self) extends AnyVal {
    
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
    def setInput(value: MatchType): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setSelect(value: MatchType): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
}
