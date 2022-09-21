package typings.styledComponents

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistModelsThemeProviderMod {
  
  @JSImport("styled-components/primitives/dist/models/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("styled-components/primitives/dist/models/ThemeProvider", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/primitives/dist/models/ThemeProvider", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  type DefaultTheme = StringDictionary[Any]
  
  trait Props extends StObject {
    
    var children: js.UndefOr[ReactChild] = js.undefined
    
    var theme: ThemeArgument
  }
  object Props {
    
    inline def apply(theme: ThemeArgument): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(value: ThemeArgument): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(value: /* outerTheme */ js.UndefOr[DefaultTheme] => DefaultTheme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  type ThemeArgument = DefaultTheme | ThemeFn
  
  type ThemeFn = js.Function1[/* outerTheme */ js.UndefOr[DefaultTheme], DefaultTheme]
}
