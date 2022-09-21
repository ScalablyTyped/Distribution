package typings.vueRouter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueRouter.mod.RouteRecordSingleView
  - typings.vueRouter.mod.RouteRecordSingleViewWithChildren
  - typings.vueRouter.mod.RouteRecordMultipleViews
  - typings.vueRouter.mod.RouteRecordMultipleViewsWithChildren
  - typings.vueRouter.mod.RouteRecordRedirect
*/
trait RouteRecordRaw extends StObject
object RouteRecordRaw {
  
  inline def RouteRecordMultipleViews(components: Record[String, RawRouteComponent], path: String): typings.vueRouter.mod.RouteRecordMultipleViews = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.RouteRecordMultipleViews]
  }
  
  inline def RouteRecordMultipleViewsWithChildren(children: js.Array[RouteRecordRaw], path: String): typings.vueRouter.mod.RouteRecordMultipleViewsWithChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.RouteRecordMultipleViewsWithChildren]
  }
  
  inline def RouteRecordRedirect(path: String, redirect: RouteRecordRedirectOption): typings.vueRouter.mod.RouteRecordRedirect = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.RouteRecordRedirect]
  }
  
  inline def RouteRecordSingleView(component: RawRouteComponent, path: String): typings.vueRouter.mod.RouteRecordSingleView = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.RouteRecordSingleView]
  }
  
  inline def RouteRecordSingleViewWithChildren(children: js.Array[RouteRecordRaw], path: String): typings.vueRouter.mod.RouteRecordSingleViewWithChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vueRouter.mod.RouteRecordSingleViewWithChildren]
  }
}
