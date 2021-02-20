package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.panelColorSettingsMod.PanelColorSettings.Props
import typings.wordpressComponents.colorPaletteMod.ColorPalette.Color
import typings.wordpressComponents.iconMod.Icon.IconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @js.native
    trait ColorSetting extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      var clearable: js.UndefOr[Boolean] = js.native
      
      var colors: js.UndefOr[js.Array[Color]] = js.native
      
      var disableCustomColors: js.UndefOr[Boolean] = js.native
      
      var label: String = js.native
      
      var onChange: js.UndefOr[js.Function0[Unit]] with js.Function0[Unit] = js.native
      
      var value: js.UndefOr[Color] with Color = js.native
    }
    object ColorSetting {
      
      @scala.inline
      def apply(
        label: String,
        onChange: js.UndefOr[js.Function0[Unit]] with js.Function0[Unit],
        value: js.UndefOr[Color] with Color
      ): ColorSetting = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[ColorSetting]
      }
      
      @scala.inline
      implicit class ColorSettingMutableBuilder[Self <: ColorSetting] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
        
        @scala.inline
        def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        @scala.inline
        def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value :_*))
        
        @scala.inline
        def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChange(value: js.UndefOr[js.Function0[Unit]] with js.Function0[Unit]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: js.UndefOr[Color] with Color): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined parent std.Omit<@wordpress/components.@wordpress/components.PanelBody.Props, 'children'> */
    @js.native
    trait Props extends StObject {
      
      var className: js.UndefOr[js.Any] = js.native
      
      var colorSettings: js.Array[ColorSetting] = js.native
      
      var disableCustomColors: js.UndefOr[Boolean] = js.native
      
      var icon: js.UndefOr[IconType[js.Object]] = js.native
      
      var initialOpen: js.UndefOr[Boolean] = js.native
      
      var onToggle: js.UndefOr[js.Function0[Unit]] = js.native
      
      var opened: js.UndefOr[Boolean] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(colorSettings: js.Array[ColorSetting]): Props = {
        val __obj = js.Dynamic.literal(colorSettings = colorSettings.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: js.Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setColorSettings(value: js.Array[ColorSetting]): Self = StObject.set(x, "colorSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorSettingsVarargs(value: ColorSetting*): Self = StObject.set(x, "colorSettings", js.Array(value :_*))
        
        @scala.inline
        def setDisableCustomColors(value: Boolean): Self = StObject.set(x, "disableCustomColors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableCustomColorsUndefined: Self = StObject.set(x, "disableCustomColors", js.undefined)
        
        @scala.inline
        def setIcon(value: IconType[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
        
        @scala.inline
        def setOnToggle(value: () => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        @scala.inline
        def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
