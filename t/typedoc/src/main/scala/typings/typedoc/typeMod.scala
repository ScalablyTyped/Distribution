package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `type`(context: DefaultThemeRenderContext): JsxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(context.asInstanceOf[js.Any]).asInstanceOf[JsxElement]
  inline def `type`(context: DefaultThemeRenderContext, `type`: Type): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
