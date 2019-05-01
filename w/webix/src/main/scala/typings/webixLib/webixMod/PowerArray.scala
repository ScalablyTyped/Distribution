package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PowerArray extends js.Object {
  def each(functor: WebixCallback): scala.Unit = js.native
  def each(functor: WebixCallback, master: js.Any): scala.Unit = js.native
  def filter(functor: WebixCallback, master: js.Any): js.Array[_] = js.native
  def find(data: js.Any): scala.Double = js.native
  def insertAt(data: js.Any, pos: scala.Double): scala.Unit = js.native
  def map(functor: WebixCallback, master: js.Any): js.Array[_] = js.native
  def remove(value: js.Any): scala.Unit = js.native
  def removeAt(pos: scala.Double, len: scala.Double): scala.Unit = js.native
}

