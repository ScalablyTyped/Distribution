package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", "Anchor")
@js.native
class Anchor protected ()
  extends twoDotJsLib.twoDotJsMod.TwoNs.Anchor {
  def this(x: scala.Double, y: scala.Double, lx: scala.Double, ly: scala.Double, rx: scala.Double, ry: scala.Double, command: java.lang.String) = this()
  def this(x: scala.Double, y: scala.Double, lx: scala.Double, ly: scala.Double, rx: scala.Double, ry: scala.Double, command: twoDotJsLib.twoDotJsMod.TwoNs.Commands) = this()
  /* CompleteClass */
  override var command: java.lang.String = js.native
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
  /* CompleteClass */
  override def add(v1: twoDotJsLib.twoDotJsMod.TwoNs.Vector, v2: twoDotJsLib.twoDotJsMod.TwoNs.Vector): this.type = js.native
  /* CompleteClass */
  override def addSelf(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): this.type = js.native
  /* CompleteClass */
  override def clear(): this.type = js.native
  /* CompleteClass */
  override def copy(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): this.type = js.native
  /* CompleteClass */
  override def distanceSquared(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): scala.Double = js.native
  /* CompleteClass */
  override def distanceTo(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): scala.Double = js.native
  /* CompleteClass */
  override def divideScalar(value: scala.Double): this.type = js.native
  /* CompleteClass */
  override def dot(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): scala.Double = js.native
  /* CompleteClass */
  override def equals(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): scala.Boolean = js.native
  /* CompleteClass */
  override def ignore(): this.type = js.native
  /* CompleteClass */
  override def isZero(): scala.Boolean = js.native
  /* CompleteClass */
  override def length(): scala.Double = js.native
  /* CompleteClass */
  override def lengthSquared(): scala.Double = js.native
  /* CompleteClass */
  override def lerp(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector, t: scala.Double): this.type = js.native
  /* CompleteClass */
  override def listen(): this.type = js.native
  /* CompleteClass */
  override def multiplyScalar(value: scala.Double): this.type = js.native
  /* CompleteClass */
  override def multiplySelf(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): this.type = js.native
  /* CompleteClass */
  override def negate(): this.type = js.native
  /* CompleteClass */
  override def normalize(): this.type = js.native
  /* CompleteClass */
  override def set(x: scala.Double, y: scala.Double): this.type = js.native
  /* CompleteClass */
  override def setLength(length: scala.Double): this.type = js.native
  /* CompleteClass */
  override def sub(v1: twoDotJsLib.twoDotJsMod.TwoNs.Vector, v2: twoDotJsLib.twoDotJsMod.TwoNs.Vector): this.type = js.native
  /* CompleteClass */
  override def subSelf(v: twoDotJsLib.twoDotJsMod.TwoNs.Vector): this.type = js.native
}

/* static members */
@JSImport("two.js", "Anchor")
@js.native
object Anchor extends js.Object {
  def AppendCurveProperties(): scala.Unit = js.native
}

