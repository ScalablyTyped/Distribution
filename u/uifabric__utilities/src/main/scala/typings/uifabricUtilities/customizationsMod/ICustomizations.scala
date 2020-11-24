package typings.uifabricUtilities.customizationsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomizations extends js.Object {
  
  var inCustomizerContext: js.UndefOr[Boolean] = js.native
  
  var scopedSettings: StringDictionary[ISettings] = js.native
  
  var settings: ISettings = js.native
}
object ICustomizations {
  
  @scala.inline
  def apply(scopedSettings: StringDictionary[ISettings], settings: ISettings): ICustomizations = {
    val __obj = js.Dynamic.literal(scopedSettings = scopedSettings.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizations]
  }
  
  @scala.inline
  implicit class ICustomizationsOps[Self <: ICustomizations] (val x: Self) extends AnyVal {
    
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
    def setScopedSettings(value: StringDictionary[ISettings]): Self = this.set("scopedSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: ISettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInCustomizerContext(value: Boolean): Self = this.set("inCustomizerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInCustomizerContext: Self = this.set("inCustomizerContext", js.undefined)
  }
}
