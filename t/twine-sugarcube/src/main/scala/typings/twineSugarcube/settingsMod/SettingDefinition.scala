package typings.twineSugarcube.settingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingDefinition extends js.Object {
  
  /**
    * Description explaining the control in greater detail.
    */
  var desc: js.UndefOr[String] = js.native
  
  /**
    * Label to use for the control.
    */
  var label: String = js.native
  
  /**
    * The function to call when the control's state is changed.
    */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The function to call during initialization.
    */
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
}
object SettingDefinition {
  
  @scala.inline
  def apply(label: String): SettingDefinition = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingDefinition]
  }
  
  @scala.inline
  implicit class SettingDefinitionOps[Self <: SettingDefinition] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
  }
}
