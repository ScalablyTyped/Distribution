package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Path")
@js.native
class Path protected () extends Object {
  def this(vertices: js.Array[Vector], closed: scala.Boolean, curved: scala.Boolean) = this()
  def this(vertices: js.Array[Vector], closed: scala.Boolean, curved: scala.Boolean, manual: scala.Boolean) = this()
  var automatic: scala.Boolean = js.native
  var beginning: scala.Double = js.native
  var cap: java.lang.String = js.native
  var clip: scala.Boolean = js.native
  var closed: scala.Boolean = js.native
  var curved: scala.Boolean = js.native
  var ending: scala.Double = js.native
  var fill: Color = js.native
  var id: scala.Double = js.native
  var join: java.lang.String = js.native
  var linewidth: scala.Double = js.native
  var miter: scala.Double = js.native
  var opacity: scala.Double = js.native
  var parent: Group = js.native
  var rotation: scala.Double = js.native
  var scale: scala.Double = js.native
  var stroke: Color = js.native
  var translation: Vector = js.native
  var vertices: twoDotJsLib.twoDotJsMod.UtilsNs.Collection[Anchor] = js.native
  def addTo(group: Group): this.type = js.native
  def center(): this.type = js.native
  def getBoundingClientRect(): BoundingClientRect = js.native
  def getBoundingClientRect(shallow: scala.Boolean): BoundingClientRect = js.native
  def noFill(): this.type = js.native
  def noStroke(): this.type = js.native
  def plot(): this.type = js.native
  def remove(): this.type = js.native
  def subdivide(): this.type = js.native
}

/* static members */
@JSImport("two.js", "Path")
@js.native
object Path extends js.Object {
  def MakeObservable(obj: js.Any): js.Any = js.native
}

