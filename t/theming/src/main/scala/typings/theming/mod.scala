package typings.theming

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.NonNullable
import typings.theming.anon.ThemeNonNullable
import typings.theming.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("theming", "ThemeContext")
  @js.native
  val ThemeContext: Context[DefaultTheme] = js.native
  
  @JSImport("theming", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderFactory[DefaultTheme] = js.native
  
  inline def createTheming[Theme](context: Context[Theme]): Theming[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheming")(context.asInstanceOf[js.Any]).asInstanceOf[Theming[Theme]]
  
  @JSImport("theming", "useTheme")
  @js.native
  val useTheme: UseThemeFactory[DefaultTheme] = js.native
  
  @JSImport("theming", "withTheme")
  @js.native
  val withTheme: WithThemeFactory[DefaultTheme] = js.native
  
  type DefaultTheme = js.Object | Null
  
  type ThemeProviderFactory[Theme] = ComponentType[ThemeProviderProps[Theme]]
  
  trait ThemeProviderProps[Theme] extends StObject {
    
    var children: ReactNode
    
    var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])
  }
  object ThemeProviderProps {
    
    inline def apply[Theme](theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): ThemeProviderProps[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps[Theme]]
    }
    
    extension [Self <: ThemeProviderProps[?], Theme](x: Self & ThemeProviderProps[Theme]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ Theme => NonNullable[Theme]): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  trait Theming[Theme] extends StObject {
    
    var ThemeProvider: ThemeProviderFactory[Theme]
    
    var context: Context[Theme]
    
    var useTheme: UseThemeFactory[Theme]
    
    var withTheme: WithThemeFactory[Theme]
  }
  object Theming {
    
    inline def apply[Theme](
      ThemeProvider: ThemeProviderFactory[Theme],
      context: Context[Theme],
      useTheme: () => Theme,
      withTheme: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] & `0`[Theme]]
    ): Theming[Theme] = {
      val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
      __obj.asInstanceOf[Theming[Theme]]
    }
    
    extension [Self <: Theming[?], Theme](x: Self & Theming[Theme]) {
      
      inline def setContext(value: Context[Theme]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setThemeProvider(value: ThemeProviderFactory[Theme]): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
      
      inline def setUseTheme(value: () => Theme): Self = StObject.set(x, "useTheme", js.Any.fromFunction0(value))
      
      inline def setWithTheme(
        value: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] & `0`[Theme]]
      ): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
    }
  }
  
  type UseThemeFactory[Theme] = js.Function0[Theme]
  
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ ComponentType[ThemeNonNullable[Theme]], 
    ComponentType[ThemeNonNullable[Theme] & `0`[Theme]]
  ]
}
