package typings.treat

import typings.treat.typesMod.ClassRef
import typings.treat.typesMod.GlobalStyle
import typings.treat.typesMod.Style
import typings.treat.typesMod.StyleMap
import typings.treat.typesMod.StylesMap
import typings.treat.typesMod.ThemeRef
import typings.treat.typesMod.ThemedStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderMod {
  
  @JSImport("treat/lib/types/builder", "createTheme")
  @js.native
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
  ): ThemeRef = js.native
  @JSImport("treat/lib/types/builder", "createTheme")
  @js.native
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any,
    localDebugName: String
  ): ThemeRef = js.native
  
  @JSImport("treat/lib/types/builder", "globalStyle")
  @js.native
  def globalStyle(
    selector: String,
    style: ThemedStyle[
      GlobalStyle, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ): Unit = js.native
  
  @JSImport("treat/lib/types/builder", "style")
  @js.native
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ): ClassRef = js.native
  @JSImport("treat/lib/types/builder", "style")
  @js.native
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ],
    localDebugName: String
  ): ClassRef = js.native
  
  @JSImport("treat/lib/types/builder", "styleMap")
  @js.native
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = js.native
  @JSImport("treat/lib/types/builder", "styleMap")
  @js.native
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = js.native
  
  @JSImport("treat/lib/types/builder", "styleTree")
  @js.native
  def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = js.native
  
  type MakeStyleTree[ReturnType] = js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ /* theme */ js.Any, 
    /* styleNode */ js.Function2[/* style */ Style, /* localDebugName */ js.UndefOr[String], ClassRef], 
    ReturnType
  ]
  
  type StyleMapParam[StyleName /* <: String | Double */] = ThemedStyle[
    StyleMap[StyleName, Style], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
  ]
}
