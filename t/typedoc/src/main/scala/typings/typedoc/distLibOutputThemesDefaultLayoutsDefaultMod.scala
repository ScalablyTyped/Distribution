package typings.typedoc

import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibOutputEventsMod.PageEvent
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultLayoutsDefaultMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/layouts/default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultLayout(context: DefaultThemeRenderContext, props: PageEvent[Reflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultLayout")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
