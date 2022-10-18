package typings.themeUiMdx

import typings.react.mod.FC
import typings.themeUiMdx.distDeclarationsSrcMod.MdxProviderProps
import typings.themeUiMdx.distDeclarationsSrcMod.ThemedComponentName
import typings.themeUiMdx.distDeclarationsSrcMod.ThemedComponentsDict
import typings.themeUiMdx.distDeclarationsSrcMod.ThemedDiv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeUiMdxDotcjsMod {
  
  @JSImport("@theme-ui/mdx/dist/theme-ui-mdx.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/mdx/dist/theme-ui-mdx.cjs", "MDXProvider")
  @js.native
  val MDXProvider: FC[MdxProviderProps] = js.native
  
  @JSImport("@theme-ui/mdx/dist/theme-ui-mdx.cjs", "Themed")
  @js.native
  val Themed_ : ThemedDiv & ThemedComponentsDict = js.native
  
  @JSImport("@theme-ui/mdx/dist/theme-ui-mdx.cjs", "components")
  @js.native
  val components: ThemedComponentsDict = js.native
  
  inline def themed(key: String | ThemedComponentName): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("themed")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ]]
}
