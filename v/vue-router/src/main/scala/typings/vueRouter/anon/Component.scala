package typings.vueRouter.anon

import org.scalablytyped.runtime.StringDictionary
import typings.vueRouter.mod.RouteLocationNormalizedLoaded
import typings.vueRuntimeCore.mod.RendererElement
import typings.vueRuntimeCore.mod.RendererNode
import typings.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var Component: VNode[RendererNode, RendererElement, StringDictionary[Any]]
  
  var route: RouteLocationNormalizedLoaded
}
object Component {
  
  inline def apply(
    Component: VNode[RendererNode, RendererElement, StringDictionary[Any]],
    route: RouteLocationNormalizedLoaded
  ): Component = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: RouteLocationNormalizedLoaded): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
