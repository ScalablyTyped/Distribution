package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorIconMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/anchor-icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def anchorIcon(context: DefaultThemeRenderContext): JsxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("anchorIcon")(context.asInstanceOf[js.Any]).asInstanceOf[JsxElement]
  inline def anchorIcon(context: DefaultThemeRenderContext, anchor: String): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("anchorIcon")(context.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
