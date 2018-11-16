package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  def build(): Model = js.native
  def data(): vegaLib.vegaMod.vgNs.RuntimeNs.DataSets = js.native
  def data(data: vegaLib.vegaMod.vgNs.RuntimeNs.DataSets): Model = js.native
  def defs(): Defs = js.native
  def defs(defs: Defs): Model = js.native
  def dependencies(name: java.lang.String, tx: js.Any): scala.Unit = js.native
  def encode(): Model = js.native
  def encode(trans: js.Any): Model = js.native
  def encode(trans: js.Any, request: java.lang.String): Model = js.native
  def encode(trans: js.Any, request: java.lang.String, item: js.Any): Model = js.native
  def height(h: scala.Double): Model = js.native
  def ingest(name: java.lang.String, tx: js.Any, input: js.Any): scala.Unit = js.native
  def reset(): Model = js.native
  def scene(): Node = js.native
  def scene(node: Node): Model = js.native
  def width(w: scala.Double): Model = js.native
}

