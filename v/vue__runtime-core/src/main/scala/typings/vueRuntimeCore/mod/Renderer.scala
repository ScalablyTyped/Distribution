package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer[HostElement] extends StObject {
  
  def createApp(rootComponent: Component[Any, Any, Any, ComputedOptions, MethodOptions]): App[HostElement]
  def createApp(rootComponent: Component[Any, Any, Any, ComputedOptions, MethodOptions], rootProps: Data): App[HostElement]
  @JSName("createApp")
  var createApp_Original: CreateAppFunction[HostElement]
  
  def render(vnode: Null, container: HostElement): Unit
  def render(vnode: Null, container: HostElement, isSVG: Boolean): Unit
  def render(vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]], container: HostElement): Unit
  def render(
    vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]],
    container: HostElement,
    isSVG: Boolean
  ): Unit
  @JSName("render")
  var render_Original: RootRenderFunction[HostElement]
}
object Renderer {
  
  inline def apply[HostElement](
    createApp: (/* rootComponent */ Component[Any, Any, Any, ComputedOptions, MethodOptions], /* rootProps */ js.UndefOr[Data | Null]) => App[HostElement],
    render: (/* vnode */ (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | Null, HostElement, /* isSVG */ js.UndefOr[Boolean]) => Unit
  ): Renderer[HostElement] = {
    val __obj = js.Dynamic.literal(createApp = js.Any.fromFunction2(createApp), render = js.Any.fromFunction3(render))
    __obj.asInstanceOf[Renderer[HostElement]]
  }
  
  extension [Self <: Renderer[?], HostElement](x: Self & Renderer[HostElement]) {
    
    inline def setCreateApp(
      value: (/* rootComponent */ Component[Any, Any, Any, ComputedOptions, MethodOptions], /* rootProps */ js.UndefOr[Data | Null]) => App[HostElement]
    ): Self = StObject.set(x, "createApp", js.Any.fromFunction2(value))
    
    inline def setRender(
      value: (/* vnode */ (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | Null, HostElement, /* isSVG */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
  }
}
