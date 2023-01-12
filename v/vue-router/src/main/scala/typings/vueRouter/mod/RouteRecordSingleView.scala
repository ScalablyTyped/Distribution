package typings.vueRouter.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Route Record defining one single component with the `component` option.
  */
trait RouteRecordSingleView
  extends StObject
     with RouteRecordBase
     with RouteRecordRaw {
  
  @JSName("children")
  var children_RouteRecordSingleView: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Component to display when the URL matches this route.
    */
  var component: RawRouteComponent
  
  var components: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Allow passing down params as props to the component rendered by `router-view`.
    */
  @JSName("props")
  var props_RouteRecordSingleView: js.UndefOr[RouteRecordProps] = js.undefined
  
  @JSName("redirect")
  var redirect_RouteRecordSingleView: js.UndefOr[scala.Nothing] = js.undefined
}
object RouteRecordSingleView {
  
  inline def apply(component: RawRouteComponent, path: String): RouteRecordSingleView = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteRecordSingleView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteRecordSingleView] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: RawRouteComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentFunction0(value: () => js.Promise[RouteComponent]): Self = StObject.set(x, "component", js.Any.fromFunction0(value))
    
    inline def setProps(value: RouteRecordProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsFunction1(value: /* to */ RouteLocationNormalized => Record[String, Any]): Self = StObject.set(x, "props", js.Any.fromFunction1(value))
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
