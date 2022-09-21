package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeAndParentMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/typeAndParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def typeAndParent(context: DefaultThemeRenderContext, props: Type): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("typeAndParent")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
