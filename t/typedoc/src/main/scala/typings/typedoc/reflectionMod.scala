package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.eventsMod.PageEvent
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.ContainerReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/templates/reflection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reflectionTemplate(context: DefaultThemeRenderContext, props: PageEvent[ContainerReflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectionTemplate")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
