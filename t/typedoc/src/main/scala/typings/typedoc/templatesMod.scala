package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.eventsMod.PageEvent
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.ProjectReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indexTemplate(hasMarkdown: DefaultThemeRenderContext, props: PageEvent[ProjectReflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("indexTemplate")(hasMarkdown.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
