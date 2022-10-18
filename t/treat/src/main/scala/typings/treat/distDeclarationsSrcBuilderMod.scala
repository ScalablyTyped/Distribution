package typings.treat

import typings.treat.distDeclarationsSrcTypesMod.ClassRef
import typings.treat.distDeclarationsSrcTypesMod.GlobalStyle
import typings.treat.distDeclarationsSrcTypesMod.Style
import typings.treat.distDeclarationsSrcTypesMod.StyleMap
import typings.treat.distDeclarationsSrcTypesMod.StylesMap
import typings.treat.distDeclarationsSrcTypesMod.ThemeRef
import typings.treat.distDeclarationsSrcTypesMod.ThemedStyle
import typings.treat.themeMod.ThemeOrAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcBuilderMod {
  
  @JSImport("treat/dist/declarations/src/builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheme(tokens: ThemeOrAny): ThemeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any]).asInstanceOf[ThemeRef]
  inline def createTheme(tokens: ThemeOrAny, localDebugName: String): ThemeRef = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[ThemeRef]
  
  inline def globalStyle(selector: String, style: ThemedStyle[GlobalStyle, ThemeOrAny]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("globalStyle")(selector.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def style(style: ThemedStyle[Style, ThemeOrAny]): ClassRef = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(style.asInstanceOf[js.Any]).asInstanceOf[ClassRef]
  inline def style(style: ThemedStyle[Style, ThemeOrAny], localDebugName: String): ClassRef = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(style.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[ClassRef]
  
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[StylesMap[StyleName]]
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[StylesMap[StyleName]]
  
  inline def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTree")(makeStyleTree.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
  
  type MakeStyleTree[ReturnType] = js.Function2[
    /* theme */ ThemeOrAny, 
    /* styleNode */ js.Function2[/* style */ Style, /* localDebugName */ js.UndefOr[String], ClassRef], 
    ReturnType
  ]
  
  type StyleMapParam[StyleName /* <: String | Double */] = ThemedStyle[StyleMap[StyleName, Style], ThemeOrAny]
}
