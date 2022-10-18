package typings.typedoc

import typings.typedoc.anon.ArrowStyle
import typings.typedoc.distLibModelsMod.SignatureReflection
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsMemberDotsignatureDottitleMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/member.signature.title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memberSignatureTitle(context: DefaultThemeRenderContext, props: SignatureReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSignatureTitle")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  inline def memberSignatureTitle(context: DefaultThemeRenderContext, props: SignatureReflection, hasHideNameArrowStyle: ArrowStyle): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSignatureTitle")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any], hasHideNameArrowStyle.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
