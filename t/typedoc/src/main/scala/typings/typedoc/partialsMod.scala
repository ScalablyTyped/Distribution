package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.ContainerReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialsMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def index(context: DefaultThemeRenderContext, props: ContainerReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
