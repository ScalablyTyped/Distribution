package typings.stylableRuntime

import typings.stylableRuntime.anon.Css
import typings.stylableRuntime.cssRuntimeRendererMod.RuntimeRenderer
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import typings.stylableRuntime.typesMod.StylableExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssRuntimeStylesheetMod {
  
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "create")
  @js.native
  def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: String): RuntimeStylesheet = js.native
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "create")
  @js.native
  def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: String,
    renderer: RuntimeRenderer
  ): RuntimeStylesheet = js.native
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "create")
  @js.native
  def create(namespace: String, exports: StylableExports, css: String, depth: Double, id: Double): RuntimeStylesheet = js.native
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "create")
  @js.native
  def create(
    namespace: String,
    exports: StylableExports,
    css: String,
    depth: Double,
    id: Double,
    renderer: RuntimeRenderer
  ): RuntimeStylesheet = js.native
  
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "createRenderable")
  @js.native
  def createRenderable(css: String, depth: String, id: String): Css = js.native
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "createRenderable")
  @js.native
  def createRenderable(css: String, depth: String, id: Double): Css = js.native
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "createRenderable")
  @js.native
  def createRenderable(css: String, depth: Double, id: String): Css = js.native
  @JSImport("@stylable/runtime/cjs/css-runtime-stylesheet", "createRenderable")
  @js.native
  def createRenderable(css: String, depth: Double, id: Double): Css = js.native
}
