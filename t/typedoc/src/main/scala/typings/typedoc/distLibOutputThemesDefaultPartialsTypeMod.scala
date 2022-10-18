package typings.typedoc

import typings.typedoc.distLibModelsMod.Type
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsTypeMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `type`(context: DefaultThemeRenderContext): JsxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(context.asInstanceOf[js.Any]).asInstanceOf[JsxElement]
  inline def `type`(context: DefaultThemeRenderContext, `type`: Type): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  
  inline def validateStateIsClean(page: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateStateIsClean")(page.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
