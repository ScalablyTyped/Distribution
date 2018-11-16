package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer
  extends nodeLib.NodeJSNs.EventEmitter {
  var events: js.Any = js.native
  var options: RenderOptions = js.native
  var str: java.lang.String = js.native
  /**
           * Define function or global var with the given `name`. Optionally
           * the function may accept full expressions, by setting `raw`
           * to `true`.
           */
  def define(name: java.lang.String, fn: js.Function1[/* repeated */js.Any, _]): this.type = js.native
  def define(name: java.lang.String, fn: js.Function1[/* repeated */js.Any, _], raw: scala.Boolean): this.type = js.native
  def define(name: java.lang.String, node: stylusLib.stylusMod.StylusNs.NodesNs.Node): this.type = js.native
  def define(name: java.lang.String, node: stylusLib.stylusMod.StylusNs.NodesNs.Node, raw: scala.Boolean): this.type = js.native
  def define(name: java.lang.String, `val`: js.Any): this.type = js.native
  def define(name: java.lang.String, `val`: js.Any, raw: scala.Boolean): this.type = js.native
  /**
           * Get dependencies of the compiled file.
           */
  def deps(filename: java.lang.String): js.Array[java.lang.String] = js.native
  /**
           * Get option `key`.
           */
  def get(key: java.lang.String): js.Any = js.native
  /**
           * Import the given `file`.
           */
  def `import`(file: java.lang.String): this.type = js.native
  /**
           * Include the given `path` to the lookup paths array.
           */
  def include(path: java.lang.String): this.type = js.native
  /**
           * Parse and evaluate AST and return the result.
           */
  def render(): java.lang.String = js.native
  /**
           * Parse and evaluate AST, then callback `fn(err, css, js)`.
           */
  def render(callback: RenderCallback): scala.Unit = js.native
  /**
           * Set option `key` to `val`.
           */
  def set(key: java.lang.String, `val`: js.Any): this.type = js.native
  /**
           * Use the given `fn`.
           *
           * This allows for plugins to alter the renderer in
           * any way they wish, exposing paths etc.
           */
  def use(fn: js.Function1[/* renderer */ this.type, _]): this.type = js.native
}

