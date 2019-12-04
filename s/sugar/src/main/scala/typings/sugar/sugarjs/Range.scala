package typings.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  def clamp[T](el: T): T = js.native
  def contains[T](el: T): Boolean = js.native
  def days(): Double = js.native
  def every[T](amount: java.lang.String): typings.sugar.Array[T] = js.native
  def every[T](
    amount: java.lang.String,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ this.type, Unit]
  ): typings.sugar.Array[T] = js.native
  def every[T](amount: Double): typings.sugar.Array[T] = js.native
  def every[T](amount: Double, everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ this.type, Unit]): typings.sugar.Array[T] = js.native
  def hours(): Double = js.native
  def intersect(range: Range): Range = js.native
  def isValid(): Boolean = js.native
  def milliseconds(): Double = js.native
  def minutes(): Double = js.native
  def months(): Double = js.native
  def seconds(): Double = js.native
  def span(): Double = js.native
  def toArray[T](): typings.sugar.Array[T] = js.native
  def union(range: Range): Range = js.native
  def weeks(): Double = js.native
  def years(): Double = js.native
}

