package typings.typedoc

import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationHierarchy
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsHierarchyMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/hierarchy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hierarchy(context: DefaultThemeRenderContext): js.UndefOr[JsxElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("hierarchy")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JsxElement]]
  inline def hierarchy(context: DefaultThemeRenderContext, props: DeclarationHierarchy): js.UndefOr[JsxElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("hierarchy")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[JsxElement]]
}
