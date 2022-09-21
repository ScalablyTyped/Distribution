package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberSignaturesMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/member.signatures", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memberSignatures(context: DefaultThemeRenderContext, props: DeclarationReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSignatures")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
