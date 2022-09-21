package typings.vueRouter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route Record defining one single component with a nested view.
  */
trait RouteRecordSingleViewWithChildren
  extends StObject
     with RouteRecordBase
     with RouteRecordRaw {
  
  @JSName("children")
  var children_RouteRecordSingleViewWithChildren: js.Array[RouteRecordRaw]
  
  /**
    * Component to display when the URL matches this route.
    */
  var component: js.UndefOr[RawRouteComponent | Null] = js.undefined
  
  var components: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Allow passing down params as props to the component rendered by `router-view`.
    */
  @JSName("props")
  var props_RouteRecordSingleViewWithChildren: js.UndefOr[RouteRecordProps] = js.undefined
}
object RouteRecordSingleViewWithChildren {
  
  inline def apply(children: js.Array[RouteRecordRaw], path: String): RouteRecordSingleViewWithChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecordSingleViewWithChildren]
  }
  
  extension [Self <: RouteRecordSingleViewWithChildren](x: Self) {
    
    inline def setChildren(value: js.Array[RouteRecordRaw]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: RouteRecordRaw*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setComponent(value: RawRouteComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentFunction0(value: () => js.Promise[RouteComponent]): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setProps(value: RouteRecordProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsFunction1(value: /* to */ RouteLocationNormalized => Record[String, Any]): Self = StObject.set(x, "props", js.Any.fromFunction1(value))
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
