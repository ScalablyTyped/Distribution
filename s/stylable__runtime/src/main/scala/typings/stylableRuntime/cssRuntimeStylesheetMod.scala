package typings.stylableRuntime

import typings.stylableRuntime.anon.Css
import typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import typings.stylableRuntime.typesMod.StylableExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssRuntimeStylesheetMod {
  
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: String): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  inline def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: String,
    renderer: RuntimeRenderer
  ): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  inline def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: Double): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  inline def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: Double,
    renderer: RuntimeRenderer
  ): RuntimeStylesheet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(namespace.asInstanceOf[js.Any], exports.asInstanceOf[js.Any], css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[RuntimeStylesheet]
  
  inline def createRenderable(css: String, depth: String, id: String): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
  inline def createRenderable(css: String, depth: String, id: Double): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
  inline def createRenderable(css: String, depth: Double, id: String): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
  inline def createRenderable(css: String, depth: Double, id: Double): Css = (^.asInstanceOf[js.Dynamic].applyDynamic("createRenderable")(css.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Css]
}
