package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Node
import typings.std.ShadowRoot
import typings.vueRuntimeCore.anon.ElementvnodeVNodeRenderer
import typings.vueRuntimeCore.anon.ShadowRootvnodeVNodeRende
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrationRenderer
  extends StObject
     with Renderer[Element | ShadowRoot] {
  
  def hydrate(vnode: VNode[Node, Element, StringDictionary[Any]], container: ElementvnodeVNodeRenderer): Unit
  def hydrate(vnode: VNode[Node, Element, StringDictionary[Any]], container: ShadowRootvnodeVNodeRende): Unit
  @JSName("hydrate")
  var hydrate_Original: RootHydrateFunction
}
object HydrationRenderer {
  
  inline def apply(
    createApp: (/* rootComponent */ Component[Any, Any, Any, ComputedOptions, MethodOptions], /* rootProps */ js.UndefOr[Data | Null]) => App[Element | ShadowRoot],
    hydrate: (/* vnode */ VNode[Node, Element, StringDictionary[Any]], /* container */ ElementvnodeVNodeRenderer | ShadowRootvnodeVNodeRende) => Unit,
    render: (/* vnode */ (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | Null, Element | ShadowRoot, /* isSVG */ js.UndefOr[Boolean]) => Unit
  ): HydrationRenderer = {
    val __obj = js.Dynamic.literal(createApp = js.Any.fromFunction2(createApp), hydrate = js.Any.fromFunction2(hydrate), render = js.Any.fromFunction3(render))
    __obj.asInstanceOf[HydrationRenderer]
  }
  
  extension [Self <: HydrationRenderer](x: Self) {
    
    inline def setHydrate(
      value: (/* vnode */ VNode[Node, Element, StringDictionary[Any]], /* container */ ElementvnodeVNodeRenderer | ShadowRootvnodeVNodeRende) => Unit
    ): Self = StObject.set(x, "hydrate", js.Any.fromFunction2(value))
  }
}
