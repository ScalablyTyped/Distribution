package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialsParameterMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/parameter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parameter(context: DefaultThemeRenderContext, props: DeclarationReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("parameter")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
