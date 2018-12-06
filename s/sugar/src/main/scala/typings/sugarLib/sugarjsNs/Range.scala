package typings
package sugarLib.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  def clamp[T](el: T): T = js.native
  def contains[T](el: T): scala.Boolean = js.native
  def days(): scala.Double = js.native
  def every[T](amount: java.lang.String): js.Array[T] = js.native
  def every[T](
    amount: java.lang.String,
    everyFn: js.Function3[/* el */ T, /* i */ scala.Double, /* r */ this.type, scala.Unit]
  ): js.Array[T] = js.native
  def every[T](amount: scala.Double): js.Array[T] = js.native
  def every[T](
    amount: scala.Double,
    everyFn: js.Function3[/* el */ T, /* i */ scala.Double, /* r */ this.type, scala.Unit]
  ): js.Array[T] = js.native
  def hours(): scala.Double = js.native
  def intersect(range: Range): Range = js.native
  def isValid(): scala.Boolean = js.native
  def milliseconds(): scala.Double = js.native
  def minutes(): scala.Double = js.native
  def months(): scala.Double = js.native
  def seconds(): scala.Double = js.native
  def span(): scala.Double = js.native
  def toArray[T](): js.Array[T] = js.native
  def union(range: Range): Range = js.native
  def weeks(): scala.Double = js.native
  def years(): scala.Double = js.native
}

