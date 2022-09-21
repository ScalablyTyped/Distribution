package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialsCommentMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/comment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def comment(hasMarkdown: DefaultThemeRenderContext, props: Reflection): js.UndefOr[JsxElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("comment")(hasMarkdown.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[JsxElement]]
}
