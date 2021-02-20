package typings.theming

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.NonNullable
import typings.theming.anon.ThemeNonNullable
import typings.theming.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theming", "ThemeContext")
  @js.native
  val ThemeContext: Context[DefaultTheme] = js.native
  
  @JSImport("theming", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderFactory[DefaultTheme] = js.native
  
  @JSImport("theming", "createTheming")
  @js.native
  def createTheming[Theme](context: Context[Theme]): Theming[Theme] = js.native
  
  @JSImport("theming", "useTheme")
  @js.native
  val useTheme: UseThemeFactory[DefaultTheme] = js.native
  
  @JSImport("theming", "withTheme")
  @js.native
  val withTheme: WithThemeFactory[DefaultTheme] = js.native
  
  type DefaultTheme = js.Object | Null
  
  type ThemeProviderFactory[Theme] = ComponentType[ThemeProviderProps[Theme]]
  
  @js.native
  trait ThemeProviderProps[Theme] extends StObject {
    
    var children: ReactNode = js.native
    
    var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]]) = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply[Theme](theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): ThemeProviderProps[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps[Theme]]
    }
    
    @scala.inline
    implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps[_], Theme] (val x: Self with ThemeProviderProps[Theme]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTheme(value: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* outerTheme */ Theme => NonNullable[Theme]): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Theming[Theme] extends StObject {
    
    var ThemeProvider: ThemeProviderFactory[Theme] = js.native
    
    var context: Context[Theme] = js.native
    
    var useTheme: UseThemeFactory[Theme] = js.native
    
    var withTheme: WithThemeFactory[Theme] = js.native
  }
  object Theming {
    
    @scala.inline
    def apply[Theme](
      ThemeProvider: ThemeProviderFactory[Theme],
      context: Context[Theme],
      useTheme: () => Theme,
      withTheme: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] with `0`[Theme]]
    ): Theming[Theme] = {
      val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], useTheme = js.Any.fromFunction0(useTheme), withTheme = js.Any.fromFunction1(withTheme))
      __obj.asInstanceOf[Theming[Theme]]
    }
    
    @scala.inline
    implicit class ThemingMutableBuilder[Self <: Theming[_], Theme] (val x: Self with Theming[Theme]) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context[Theme]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeProvider(value: ThemeProviderFactory[Theme]): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTheme(value: () => Theme): Self = StObject.set(x, "useTheme", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWithTheme(
        value: /* comp */ ComponentType[ThemeNonNullable[Theme]] => ComponentType[ThemeNonNullable[Theme] with `0`[Theme]]
      ): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
    }
  }
  
  type UseThemeFactory[Theme] = js.Function0[Theme]
  
  type WithThemeFactory[Theme] = js.Function1[
    /* comp */ ComponentType[ThemeNonNullable[Theme]], 
    ComponentType[ThemeNonNullable[Theme] with `0`[Theme]]
  ]
}
