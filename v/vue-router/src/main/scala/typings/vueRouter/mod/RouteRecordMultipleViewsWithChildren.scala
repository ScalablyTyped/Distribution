package typings.vueRouter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route Record defining multiple named components with the `components` option and children.
  */
trait RouteRecordMultipleViewsWithChildren
  extends StObject
     with RouteRecordBase
     with RouteRecordRaw {
  
  @JSName("children")
  var children_RouteRecordMultipleViewsWithChildren: js.Array[RouteRecordRaw]
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Components to display when the URL matches this route. Allow using named views.
    */
  var components: js.UndefOr[(Record[String, RawRouteComponent]) | Null] = js.undefined
  
  /**
    * Allow passing down params as props to the component rendered by
    * `router-view`. Should be an object with the same keys as `components` or a
    * boolean to be applied to every component.
    */
  @JSName("props")
  var props_RouteRecordMultipleViewsWithChildren: js.UndefOr[(Record[String, RouteRecordProps]) | Boolean] = js.undefined
}
object RouteRecordMultipleViewsWithChildren {
  
  inline def apply(children: js.Array[RouteRecordRaw], path: String): RouteRecordMultipleViewsWithChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecordMultipleViewsWithChildren]
  }
  
  extension [Self <: RouteRecordMultipleViewsWithChildren](x: Self) {
    
    inline def setChildren(value: js.Array[RouteRecordRaw]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: RouteRecordRaw*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setComponents(value: Record[String, RawRouteComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsNull: Self = StObject.set(x, "components", null)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setProps(value: (Record[String, RouteRecordProps]) | Boolean): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
