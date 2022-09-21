package typings.typedoc

import typings.typedoc.declarationMod.DeclarationHierarchy
import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hierarchyMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/hierarchy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hierarchy(context: DefaultThemeRenderContext): js.UndefOr[JsxElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("hierarchy")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JsxElement]]
  inline def hierarchy(context: DefaultThemeRenderContext, props: DeclarationHierarchy): js.UndefOr[JsxElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("hierarchy")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[JsxElement]]
}
