package typings.typedoc

import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibOutputEventsMod.PageEvent
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultTemplatesMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indexTemplate(param0: DefaultThemeRenderContext, props: PageEvent[ProjectReflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("indexTemplate")(param0.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
