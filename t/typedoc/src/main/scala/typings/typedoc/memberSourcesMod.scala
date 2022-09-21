package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.DeclarationReflection
import typings.typedoc.modelsMod.SignatureReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberSourcesMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/member.sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memberSources(context: DefaultThemeRenderContext, props: DeclarationReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSources")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  inline def memberSources(context: DefaultThemeRenderContext, props: SignatureReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberSources")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
