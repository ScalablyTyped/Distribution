package typings.typedoc

import typings.typedoc.anon.HideSources
import typings.typedoc.distLibModelsMod.SignatureReflection
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsMemberDotsignatureDotbodyMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/member.signature.body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memberSignatureBody(context: DefaultThemeRenderContext, props: SignatureReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSignatureBody")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  inline def memberSignatureBody(context: DefaultThemeRenderContext, props: SignatureReflection, hasHideSources: HideSources): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSignatureBody")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], hasHideSources.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
