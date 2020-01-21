package typings.twoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Group")
@js.native
class Group () extends Object {
  var cap: String = js.native
  var children: js.Array[_Object] = js.native
  var fill: Color = js.native
  var id: String = js.native
  var join: String = js.native
  var linewidth: Double = js.native
  var mask: Path = js.native
  var miter: Double = js.native
  var opacity: Double = js.native
  var parent: Group = js.native
  var rotation: Double = js.native
  var scale: Double = js.native
  var stroke: Color = js.native
  var translation: Vector = js.native
  def add(objects: _Object*): this.type = js.native
  def add(objects: js.Array[_Object]): this.type = js.native
  def addTo(group: Group): this.type = js.native
  def center(): this.type = js.native
  def getBoundingClientRect(): BoundingClientRect = js.native
  def getBoundingClientRect(shallow: Boolean): BoundingClientRect = js.native
  def noFill(): this.type = js.native
  def noStroke(): this.type = js.native
  def remove(objects: _Object*): this.type = js.native
  def remove(objects: js.Array[_Object]): this.type = js.native
}

/* static members */
@JSImport("two.js", "Group")
@js.native
object Group extends js.Object {
  def MakeObservable(obj: js.Any): js.Any = js.native
}

