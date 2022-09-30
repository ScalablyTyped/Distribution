package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props
import typings.wordpressComponents.colorPaletteMod.ColorPalette.Color
import typings.wordpressComponents.iconMod.Icon.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelColorSettingsMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/panel-color-settings", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PanelColorSettings {
    
    /* Inlined std.Partial<@wordpress/components.@wordpress/components.ColorPalette.Props> & std.Pick<@wordpress/components.@wordpress/components.ColorPalette.Props, 'onChange' | 'value'> & {  label :string} */
    trait ColorSetting extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      var clearable: js.UndefOr[Boolean] = js.undefined
      
      var colors: js.UndefOr[js.Array[Color]] = js.undefined
      
      var disableCustomColors: js.UndefOr[Boolean] = js.undefined
      
      var label: String
      
      var onChange: js.UndefOr[js.Function0[Unit]] & js.Function0[Unit]
      
      var value: js.UndefOr[String] & String
    }
    object ColorSetting {
      
      inline def apply(
        label: String,
        onChange: js.UndefOr[js.Function0[Unit]] & js.Function0[Unit],
        value: js.UndefOr[String] & String
      ): ColorSetting = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[ColorSetting]
      }
      
      extension [Self <: ColorSetting](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
        
        inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
        
        inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
        
        inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        inline def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setOnChange(value: js.UndefOr[js.Function0[Unit]] & js.Function0[Unit]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
        
        inline def setValue(value: js.UndefOr[String] & String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined parent std.Omit<@wordpress/components.@wordpress/components.PanelBody.Props, 'children'> */
    trait Props extends StObject {
      
      var className: js.UndefOr[Any] = js.undefined
      
      var colorSettings: js.Array[ColorSetting]
      
      var disableCustomColors: js.UndefOr[Boolean] = js.undefined
      
      var icon: js.UndefOr[IconType[js.Object]] = js.undefined
      
      var initialOpen: js.UndefOr[Boolean] = js.undefined
      
      var onToggle: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var opened: js.UndefOr[Boolean] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(colorSettings: js.Array[ColorSetting]): Props = {
        val __obj = js.Dynamic.literal(colorSettings = colorSettings.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setColorSettings(value: js.Array[ColorSetting]): Self = StObject.set(x, "colorSettings", value.asInstanceOf[js.Any])
        
        inline def setColorSettingsVarargs(value: ColorSetting*): Self = StObject.set(x, "colorSettings", js.Array(value*))
        
        inline def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        inline def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
        
        inline def setIcon(value: IconType[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
        
        inline def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
        
        inline def setOnToggle(value: () => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction0(value))
        
        inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
        
        inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
