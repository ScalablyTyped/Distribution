package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.ReferenceReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberReferenceMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/member.reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def memberReference(hasUrlTo: DefaultThemeRenderContext, props: ReferenceReflection): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("memberReference")(hasUrlTo.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
