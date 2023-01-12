package typings.vueRouter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route Record defining multiple named components with the `components` option.
  */
trait RouteRecordMultipleViews
  extends StObject
     with RouteRecordBase
     with RouteRecordRaw {
  
  @JSName("children")
  var children_RouteRecordMultipleViews: js.UndefOr[scala.Nothing] = js.undefined
  
  var component: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Components to display when the URL matches this route. Allow using named views.
    */
  var components: Record[String, RawRouteComponent]
  
  /**
    * Allow passing down params as props to the component rendered by
    * `router-view`. Should be an object with the same keys as `components` or a
    * boolean to be applied to every component.
    */
  @JSName("props")
  var props_RouteRecordMultipleViews: js.UndefOr[(Record[String, RouteRecordProps]) | Boolean] = js.undefined
  
  @JSName("redirect")
  var redirect_RouteRecordMultipleViews: js.UndefOr[scala.Nothing] = js.undefined
}
object RouteRecordMultipleViews {
  
  inline def apply(components: Record[String, RawRouteComponent], path: String): RouteRecordMultipleViews = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecordMultipleViews]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteRecordMultipleViews] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: Record[String, RawRouteComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setProps(value: (Record[String, RouteRecordProps]) | Boolean): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
