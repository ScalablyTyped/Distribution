package typings.stylus.mod.Stylus

import typings.node.eventsMod.EventEmitter
import typings.stylus.mod.Stylus.Nodes.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends EventEmitter {
  
  /**
    * Define function or global var with the given `name`. Optionally
    * the function may accept full expressions, by setting `raw`
    * to `true`.
    */
  def define(name: String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def define(name: String, fn: js.Function1[/* repeated */ js.Any, _], raw: Boolean): this.type = js.native
  def define(name: String, node: Node): this.type = js.native
  def define(name: String, node: Node, raw: Boolean): this.type = js.native
  def define(name: String, `val`: js.Any): this.type = js.native
  def define(name: String, `val`: js.Any, raw: Boolean): this.type = js.native
  
  /**
    * Get dependencies of the compiled file.
    */
  def deps(filename: String): js.Array[String] = js.native
  
  var events: js.Any = js.native
  
  /**
    * Get option `key`.
    */
  def get(key: String): js.Any = js.native
  
  /**
    * Import the given `file`.
    */
  def `import`(file: String): this.type = js.native
  
  /**
    * Include the given `path` to the lookup paths array.
    */
  def include(path: String): this.type = js.native
  
  var options: RenderOptions = js.native
  
  /**
    * Parse and evaluate AST and return the result.
    */
  def render(): String = js.native
  /**
    * Parse and evaluate AST, then callback `fn(err, css, js)`.
    */
  def render(callback: RenderCallback): Unit = js.native
  
  /**
    * Set option `key` to `val`.
    */
  def set(key: String, `val`: js.Any): this.type = js.native
  
  var str: String = js.native
  
  /**
    * Use the given `fn`.
    *
    * This allows for plugins to alter the renderer in
    * any way they wish, exposing paths etc.
    */
  def use(fn: js.Function1[/* renderer */ this.type, _]): this.type = js.native
}
