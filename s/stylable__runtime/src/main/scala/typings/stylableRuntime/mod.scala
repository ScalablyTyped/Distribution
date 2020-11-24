package typings.stylableRuntime

import typings.stylableRuntime.anon.Css
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import typings.stylableRuntime.typesMod.StylableExports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/runtime", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("$")
  val _empty: typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer = js.native
  
  def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: String): RuntimeStylesheet = js.native
  def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: String,
    renderer: typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
  ): RuntimeStylesheet = js.native
  def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: Double): RuntimeStylesheet = js.native
  def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: Double,
    renderer: typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
  ): RuntimeStylesheet = js.native
  
  def createRenderable(css: String, depth: String, id: String): Css = js.native
  def createRenderable(css: String, depth: String, id: Double): Css = js.native
  def createRenderable(css: String, depth: Double, id: String): Css = js.native
  def createRenderable(css: String, depth: Double, id: Double): Css = js.native
  
  @js.native
  class RuntimeRenderer ()
    extends typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
}
