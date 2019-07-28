package typings.vegaDashTypings.typesRuntimeRendererMod

import typings.std.HTMLElement
import typings.vegaDashTypings.typesRuntimeMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime/renderer", "Renderer")
@js.native
class Renderer protected () extends js.Object {
  def this(loader: Loader) = this()
  def initialize(el: HTMLElement, width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
  def resize(width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
}

