package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def footer(context: DefaultThemeRenderContext): js.UndefOr[JsxElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("footer")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JsxElement]]
}
