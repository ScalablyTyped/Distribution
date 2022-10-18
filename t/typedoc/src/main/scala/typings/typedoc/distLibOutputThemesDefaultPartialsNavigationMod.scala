package typings.typedoc

import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibOutputEventsMod.PageEvent
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsNavigationMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/navigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def navigation(context: DefaultThemeRenderContext, props: PageEvent[Reflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("navigation")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  
  inline def primaryNavigation(context: DefaultThemeRenderContext, props: PageEvent[Reflection]): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("primaryNavigation")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
  
  inline def secondaryNavigation(context: DefaultThemeRenderContext, props: PageEvent[Reflection]): js.UndefOr[JsxElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("secondaryNavigation")(context.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[JsxElement]]
  
  inline def settings(context: DefaultThemeRenderContext): JsxElement = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(context.asInstanceOf[js.Any]).asInstanceOf[JsxElement]
  
  inline def sidebarLinks(context: DefaultThemeRenderContext): JsxElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sidebarLinks")(context.asInstanceOf[js.Any]).asInstanceOf[JsxElement | Null]
}
