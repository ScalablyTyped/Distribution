package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the appearance of a device picker. */
trait DevicePickerAppearance extends StObject {
  
  /** Gets and sets the accent color of the picker UI. */
  var accentColor: Color
  
  /** Gets and sets the background color of the picker UI. */
  var backgroundColor: Color
  
  /** Gets and sets the foreground color of the picker UI. */
  var foregroundColor: Color
  
  /** Gets and sets the accent color for a device that has been selected in the picker. */
  var selectedAccentColor: Color
  
  /** Gets and sets the background color for a device that is selected in the picker. */
  var selectedBackgroundColor: Color
  
  /** Gets and sets the foreground color for a device that is selected in the picker. */
  var selectedForegroundColor: Color
  
  /** Gets and sets the title for the picker UI. */
  var title: String
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
  implicit class DevicePickerAppearanceMutableBuilder[Self <: DevicePickerAppearance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccentColor(value: Color): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(value: Color): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedAccentColor(value: Color): Self = StObject.set(x, "selectedAccentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackgroundColor(value: Color): Self = StObject.set(x, "selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedForegroundColor(value: Color): Self = StObject.set(x, "selectedForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
