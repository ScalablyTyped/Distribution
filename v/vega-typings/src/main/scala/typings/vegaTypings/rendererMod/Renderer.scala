package typings.vegaTypings.rendererMod

import typings.std.HTMLElement
import typings.vegaTypings.runtimeMod.Loader_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vega-typings/types/runtime/renderer", "Renderer")
@js.native
class Renderer protected () extends js.Object {
  def this(loader: Loader_) = this()
  
  def initialize(el: HTMLElement, width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
  
  def resize(width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
}
