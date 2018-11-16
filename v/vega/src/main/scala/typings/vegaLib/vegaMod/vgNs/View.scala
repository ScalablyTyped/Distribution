package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  def data(): vegaLib.vegaMod.vgNs.RuntimeNs.DataSets = js.native
  def data(d: js.Any): this.type = js.native
  def defs(): Defs = js.native
  def defs(defs: Defs): this.type = js.native
  def height(): scala.Double = js.native
  def height(h: scala.Double): this.type = js.native
  def initialize(node: stdLib.Element): this.type = js.native
  def initialize(selector: java.lang.String): this.type = js.native
  def model(): Model = js.native
  def padding(): Padding = js.native
  def padding(p: Padding): this.type = js.native
  def render(): this.type = js.native
  def render(r: js.Array[_]): this.type = js.native
  def renderer(r: java.lang.String): this.type = js.native
  def update(): this.type = js.native
  def update(options: UpdateOptions): this.type = js.native
  def viewport(): js.Array[scala.Double] = js.native
  def viewport(v: js.Array[scala.Double]): this.type = js.native
  // TODO docs
  def width(): scala.Double = js.native
  def width(w: scala.Double): this.type = js.native
}

