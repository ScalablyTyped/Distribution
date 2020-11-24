package typings.uifabricMergeStyles.stylesheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICSPSettings extends js.Object {
  
  /**
    * Nonce to inject into script tag
    */
  var nonce: js.UndefOr[String] = js.native
}
object ICSPSettings {
  
  @scala.inline
  def apply(): ICSPSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICSPSettings]
  }
  
  @scala.inline
  implicit class ICSPSettingsOps[Self <: ICSPSettings] (val x: Self) extends AnyVal {
    
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
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
}
