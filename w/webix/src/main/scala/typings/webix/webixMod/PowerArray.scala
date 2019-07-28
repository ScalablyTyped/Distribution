package typings.webix.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PowerArray extends js.Object {
  def each(functor: WebixCallback): Unit = js.native
  def each(functor: WebixCallback, master: js.Any): Unit = js.native
  def filter(functor: WebixCallback, master: js.Any): js.Array[_] = js.native
  def find(data: js.Any): Double = js.native
  def insertAt(data: js.Any, pos: Double): Unit = js.native
  def map(functor: WebixCallback, master: js.Any): js.Array[_] = js.native
  def remove(value: js.Any): Unit = js.native
  def removeAt(pos: Double, len: Double): Unit = js.native
}

