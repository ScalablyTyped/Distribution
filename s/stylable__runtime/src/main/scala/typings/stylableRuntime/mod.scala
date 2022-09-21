package typings.stylableRuntime

import typings.std.Element
import typings.stylableRuntime.anon.Css
import typings.stylableRuntime.anon.RequiredPickHoststcsts
import typings.stylableRuntime.keyedListRendererMod.DOMListRenderer
import typings.stylableRuntime.typesMod.Host
import typings.stylableRuntime.typesMod.NodeRenderer
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import typings.stylableRuntime.typesMod.StateMap
import typings.stylableRuntime.typesMod.StylableExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/runtime/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/runtime/dist", "RuntimeRenderer")
  @js.native
  open class RuntimeRenderer ()
    extends typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
  
  @JSImport("@stylable/runtime/dist", "$")
  @js.native
  val _empty: typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer = js.native
  
  inline def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: String): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  inline def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: String,
    renderer: typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
  ): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  inline def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: Double): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  inline def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: Double,
    renderer: typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
  ): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  
  inline def createDOMListRenderer[I, O /* <: Element */, C /* <: Element */](nodeRenderer: NodeRenderer[I, O]): DOMListRenderer[I, O, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDOMListRenderer")(nodeRenderer.asInstanceOf[js.Any]).asInstanceOf[DOMListRenderer[I, O, C]]
  
  inline def createRenderable(css: String, depth: String, id: String): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
  inline def createRenderable(css: String, depth: String, id: Double): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
  inline def createRenderable(css: String, depth: Double, id: String): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
  inline def createRenderable(css: String, depth: Double, id: Double): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
  
  @JSImport("@stylable/runtime/dist", "injectCSS")
  @js.native
  val injectCSS: js.UndefOr[
    js.Function4[
      /* namespace */ String, 
      /* css */ String, 
      /* depth */ Double, 
      /* runtimeId */ String, 
      Unit
    ]
  ] = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(sts) */ inline def statesRuntime(namespace: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("statesRuntime")(namespace.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def statesRuntime(namespace: String, stateMapping: StateMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("statesRuntime")(namespace.asInstanceOf[js.Any], stateMapping.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stylesheet(): RequiredPickHoststcsts = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheet")().asInstanceOf[RequiredPickHoststcsts]
  inline def stylesheet(host: Host): RequiredPickHoststcsts = ^.asInstanceOf[js.Dynamic].applyDynamic("stylesheet")(host.asInstanceOf[js.Any]).asInstanceOf[RequiredPickHoststcsts]
}
