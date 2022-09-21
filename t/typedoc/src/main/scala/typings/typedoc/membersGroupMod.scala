package typings.typedoc

import typings.typedoc.defaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.jsxElementsMod.JsxElement
import typings.typedoc.modelsMod.ReflectionGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object membersGroupMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/members.group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def membersGroup(context: DefaultThemeRenderContext, group: ReflectionGroup): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("membersGroup")(context.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[JsxElement]
}
