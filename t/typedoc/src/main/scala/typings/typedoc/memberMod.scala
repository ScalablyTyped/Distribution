package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/member", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def member(context: DefaultThemeRenderContext, props: DeclarationReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("member")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
