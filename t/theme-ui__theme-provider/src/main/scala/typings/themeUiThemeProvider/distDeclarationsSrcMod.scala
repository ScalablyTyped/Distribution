package typings.themeUiThemeProvider

import typings.react.mod.FC
import typings.react.mod.JSX.Element
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@theme-ui/theme-provider/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/theme-provider/dist/declarations/src", "ThemeProvider")
  @js.native
  val ThemeProvider: FC[ThemeProviderProps] = js.native
  
  inline def ThemeUIProvider(param0: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeUIProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent std.Pick<@theme-ui/core.@theme-ui/core.ThemeProviderProps, 'theme'> */
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var theme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ])
  }
  object ThemeProviderProps {
    
    inline def apply(
      theme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
        ])
    ): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTheme(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
            ])
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
}
