package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.eventsMod.PageEvent
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/toolbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toolbar(context: DefaultThemeRenderContext, props: PageEvent[Reflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("toolbar")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
