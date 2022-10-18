package typings.treat

import typings.treat.distDeclarationsSrcBuilderMod.MakeStyleTree
import typings.treat.distDeclarationsSrcBuilderMod.StyleMapParam
import typings.treat.distDeclarationsSrcTypesMod.ClassRef
import typings.treat.distDeclarationsSrcTypesMod.GlobalStyle
import typings.treat.distDeclarationsSrcTypesMod.Style
import typings.treat.distDeclarationsSrcTypesMod.StylesMap
import typings.treat.distDeclarationsSrcTypesMod.ThemeRef
import typings.treat.distDeclarationsSrcTypesMod.ThemedStyle
import typings.treat.distDeclarationsSrcTypesMod.TreatModuleObject
import typings.treat.distDeclarationsSrcTypesMod.TreatModuleValue
import typings.treat.themeMod.ThemeOrAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreatDotcjsMod {
  
  @JSImport("treat/dist/treat.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("treat/dist/treat.cjs", "createTheme")
  @js.native
  val createTheme: js.Function2[/* tokens */ ThemeOrAny, /* localDebugName */ js.UndefOr[String], ThemeRef] = js.native
  
  @JSImport("treat/dist/treat.cjs", "globalStyle")
  @js.native
  val globalStyle: js.Function2[/* selector */ String, /* style */ ThemedStyle[GlobalStyle, ThemeOrAny], Unit] = js.native
  
  inline def resolveClassName(themeRef: ThemeRef, classRef: ClassRef): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveClassName")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveStyles(themeRef: ThemeRef, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreatModuleValue]]
  inline def resolveStyles(themeRef: ThemeRef, styles: TreatModuleObject): TreatModuleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[TreatModuleObject]
  
  @JSImport("treat/dist/treat.cjs", "style")
  @js.native
  val style: js.Function2[
    /* style */ ThemedStyle[Style, ThemeOrAny], 
    /* localDebugName */ js.UndefOr[String], 
    ClassRef
  ] = js.native
  
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[StylesMap[StyleName]]
  inline def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[StylesMap[StyleName]]
  
  inline def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTree")(makeStyleTree.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
}
