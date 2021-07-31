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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("treat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
  ): ThemeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any]).asInstanceOf[ThemeRef]
  @scala.inline
  def createTheme(
    tokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any,
    localDebugName: String
  ): ThemeRef = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[ThemeRef]
  
  @scala.inline
  def globalStyle(
    selector: String,
    style: ThemedStyle[
      GlobalStyle, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("globalStyle")(selector.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveClassName(themeRef: String, classRef: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveClassName")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def resolveStyles(themeRef: String, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreatModuleValue]]
  @scala.inline
  def resolveStyles(themeRef: String, styles: TreatModuleObject): TreatModuleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[TreatModuleObject]
  
  @scala.inline
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ]
  ): ClassRef = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(style.asInstanceOf[js.Any]).asInstanceOf[ClassRef]
  @scala.inline
  def style(
    style: ThemedStyle[
      Style, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ],
    localDebugName: String
  ): ClassRef = (^.asInstanceOf[js.Dynamic].applyDynamic("style")(style.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[ClassRef]
  
  @scala.inline
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName]): StylesMap[StyleName] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any]).asInstanceOf[StylesMap[StyleName]]
  @scala.inline
  def styleMap[StyleName /* <: String | Double */](stylesheet: StyleMapParam[StyleName], localDebugName: String): StylesMap[StyleName] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(stylesheet.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[StylesMap[StyleName]]
  
  @scala.inline
  def styleTree[ReturnType](makeStyleTree: MakeStyleTree[ReturnType]): ReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTree")(makeStyleTree.asInstanceOf[js.Any]).asInstanceOf[ReturnType]
}
