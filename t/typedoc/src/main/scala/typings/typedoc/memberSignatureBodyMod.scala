package typings.typedoc

import typings.typedoc.anon.HideSources
import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.SignatureReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberSignatureBodyMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/member.signature.body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memberSignatureBody(context: DefaultThemeRenderContext, props: SignatureReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSignatureBody")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  inline def memberSignatureBody(context: DefaultThemeRenderContext, props: SignatureReflection, hasHideSources: HideSources): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSignatureBody")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], hasHideSources.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
