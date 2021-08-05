package typings.wixStyleReact

import typings.csstype.mod.ColorProperty
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.AddItemButton
import typings.wixStyleReact.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeProviderMod {
  
  @JSImport("wix-style-react/dist/es/src/ThemeProvider", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ThemeProviderProps, js.Object, js.Any]
  
  trait ThemeInterface extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var color00: js.UndefOr[ColorProperty] = js.undefined
    
    var color05: js.UndefOr[ColorProperty] = js.undefined
    
    var color10: js.UndefOr[ColorProperty] = js.undefined
    
    var color20: js.UndefOr[ColorProperty] = js.undefined
    
    var color30: js.UndefOr[ColorProperty] = js.undefined
    
    var color40: js.UndefOr[ColorProperty] = js.undefined
    
    var color50: js.UndefOr[ColorProperty] = js.undefined
    
    var color60: js.UndefOr[ColorProperty] = js.undefined
    
    var componentWrapper: js.UndefOr[js.Function1[/* hasChildren */ Children, ReactNode]] = js.undefined
    
    var dividerColor: js.UndefOr[ColorProperty] = js.undefined
    
    var icons: js.UndefOr[AddItemButton] = js.undefined
    
    var textColorPrimary: js.UndefOr[ColorProperty] = js.undefined
    
    var textColorPrimaryLight: js.UndefOr[ColorProperty] = js.undefined
    
    var textColorSecondary: js.UndefOr[ColorProperty] = js.undefined
    
    var textColorSecondaryLight: js.UndefOr[ColorProperty] = js.undefined
  }
  object ThemeInterface {
    
    inline def apply(): ThemeInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeInterface]
    }
    
    extension [Self <: ThemeInterface](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor00(value: ColorProperty): Self = StObject.set(x, "color00", value.asInstanceOf[js.Any])
      
      inline def setColor00Undefined: Self = StObject.set(x, "color00", js.undefined)
      
      inline def setColor05(value: ColorProperty): Self = StObject.set(x, "color05", value.asInstanceOf[js.Any])
      
      inline def setColor05Undefined: Self = StObject.set(x, "color05", js.undefined)
      
      inline def setColor10(value: ColorProperty): Self = StObject.set(x, "color10", value.asInstanceOf[js.Any])
      
      inline def setColor10Undefined: Self = StObject.set(x, "color10", js.undefined)
      
      inline def setColor20(value: ColorProperty): Self = StObject.set(x, "color20", value.asInstanceOf[js.Any])
      
      inline def setColor20Undefined: Self = StObject.set(x, "color20", js.undefined)
      
      inline def setColor30(value: ColorProperty): Self = StObject.set(x, "color30", value.asInstanceOf[js.Any])
      
      inline def setColor30Undefined: Self = StObject.set(x, "color30", js.undefined)
      
      inline def setColor40(value: ColorProperty): Self = StObject.set(x, "color40", value.asInstanceOf[js.Any])
      
      inline def setColor40Undefined: Self = StObject.set(x, "color40", js.undefined)
      
      inline def setColor50(value: ColorProperty): Self = StObject.set(x, "color50", value.asInstanceOf[js.Any])
      
      inline def setColor50Undefined: Self = StObject.set(x, "color50", js.undefined)
      
      inline def setColor60(value: ColorProperty): Self = StObject.set(x, "color60", value.asInstanceOf[js.Any])
      
      inline def setColor60Undefined: Self = StObject.set(x, "color60", js.undefined)
      
      inline def setComponentWrapper(value: /* hasChildren */ Children => ReactNode): Self = StObject.set(x, "componentWrapper", js.Any.fromFunction1(value))
      
      inline def setComponentWrapperUndefined: Self = StObject.set(x, "componentWrapper", js.undefined)
      
      inline def setDividerColor(value: ColorProperty): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
      
      inline def setDividerColorUndefined: Self = StObject.set(x, "dividerColor", js.undefined)
      
      inline def setIcons(value: AddItemButton): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setTextColorPrimary(value: ColorProperty): Self = StObject.set(x, "textColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setTextColorPrimaryLight(value: ColorProperty): Self = StObject.set(x, "textColorPrimaryLight", value.asInstanceOf[js.Any])
      
      inline def setTextColorPrimaryLightUndefined: Self = StObject.set(x, "textColorPrimaryLight", js.undefined)
      
      inline def setTextColorPrimaryUndefined: Self = StObject.set(x, "textColorPrimary", js.undefined)
      
      inline def setTextColorSecondary(value: ColorProperty): Self = StObject.set(x, "textColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setTextColorSecondaryLight(value: ColorProperty): Self = StObject.set(x, "textColorSecondaryLight", value.asInstanceOf[js.Any])
      
      inline def setTextColorSecondaryLightUndefined: Self = StObject.set(x, "textColorSecondaryLight", js.undefined)
      
      inline def setTextColorSecondaryUndefined: Self = StObject.set(x, "textColorSecondary", js.undefined)
    }
  }
  
  type ThemeProvider = PureComponent[ThemeProviderProps, js.Object, js.Any]
  
  trait ThemeProviderProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[ThemeInterface] = js.undefined
  }
  object ThemeProviderProps {
    
    inline def apply(): ThemeProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setTheme(value: ThemeInterface): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
