package typings.treat

import typings.treat.builderMod.MakeStyleTree
import typings.treat.builderMod.StyleMapParam
import typings.treat.typesMod.ClassRef
import typings.treat.typesMod.GlobalStyle
import typings.treat.typesMod.Style
import typings.treat.typesMod.StylesMap
import typings.treat.typesMod.ThemeRef
import typings.treat.typesMod.ThemedStyle
import typings.treat.typesMod.TreatModuleObject
import typings.treat.typesMod.TreatModuleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("treat", "createTheme")
  @js.native
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
  ): ThemeRef = js.native
  @JSImport("treat", "createTheme")
  @js.native
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any,
    localDebugName: String
  ): ThemeRef = js.native
  
  @JSImport("treat", "globalStyle")
  @js.native
  def globalStyle(
    selector: String,
    style: ThemedStyle[
      GlobalStyle, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ): Unit = js.native
  
  @JSImport("treat", "resolveClassName")
  @js.native
  def resolveClassName(themeRef: String, classRef: String): String = js.native
  
  @JSImport("treat", "resolveStyles")
  @js.native
  def resolveStyles(themeRef: String, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = js.native
  @JSImport("treat", "resolveStyles")
  @js.native
  def resolveStyles(themeRef: String, styles: TreatModuleObject): TreatModuleObject = js.native
  
  @JSImport("treat", "style")
  @js.native
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ): ClassRef = js.native
  @JSImport("treat", "style")
  @js.native
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ],
    localDebugName: String
  ): ClassRef = js.native
  
  @JSImport("treat", "styleMap")
  @js.native
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = js.native
  @JSImport("treat", "styleMap")
  @js.native
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = js.native
  
  @JSImport("treat", "styleTree")
  @js.native
  def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = js.native
}
