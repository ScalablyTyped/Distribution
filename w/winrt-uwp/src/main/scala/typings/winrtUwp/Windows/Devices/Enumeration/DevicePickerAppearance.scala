package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the appearance of a device picker. */
@js.native
trait DevicePickerAppearance extends js.Object {
  
  /** Gets and sets the accent color of the picker UI. */
  var accentColor: Color = js.native
  
  /** Gets and sets the background color of the picker UI. */
  var backgroundColor: Color = js.native
  
  /** Gets and sets the foreground color of the picker UI. */
  var foregroundColor: Color = js.native
  
  /** Gets and sets the accent color for a device that has been selected in the picker. */
  var selectedAccentColor: Color = js.native
  
  /** Gets and sets the background color for a device that is selected in the picker. */
  var selectedBackgroundColor: Color = js.native
  
  /** Gets and sets the foreground color for a device that is selected in the picker. */
  var selectedForegroundColor: Color = js.native
  
  /** Gets and sets the title for the picker UI. */
  var title: String = js.native
}
object DevicePickerAppearance {
  
  @scala.inline
  def apply(
    accentColor: Color,
    backgroundColor: Color,
    foregroundColor: Color,
    selectedAccentColor: Color,
    selectedBackgroundColor: Color,
    selectedForegroundColor: Color,
    title: String
  ): DevicePickerAppearance = {
    val __obj = js.Dynamic.literal(accentColor = accentColor.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], selectedAccentColor = selectedAccentColor.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedForegroundColor = selectedForegroundColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePickerAppearance]
  }
  
  @scala.inline
  implicit class DevicePickerAppearanceOps[Self <: DevicePickerAppearance] (val x: Self) extends AnyVal {
    
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
    def setAccentColor(value: Color): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(value: Color): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedAccentColor(value: Color): Self = this.set("selectedAccentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackgroundColor(value: Color): Self = this.set("selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedForegroundColor(value: Color): Self = this.set("selectedForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
