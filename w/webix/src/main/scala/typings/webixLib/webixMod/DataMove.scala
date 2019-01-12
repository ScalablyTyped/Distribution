package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataMove extends js.Object {
  def copy(sid: java.lang.String, tindex: scala.Double): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any): scala.Unit = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: js.Any, details: js.Any): scala.Unit = js.native
  def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
  def moveBottom(id: java.lang.String): scala.Unit = js.native
  def moveBottom(id: scala.Double): scala.Unit = js.native
  def moveDown(id: java.lang.String, step: scala.Double): scala.Unit = js.native
  def moveDown(id: scala.Double, step: scala.Double): scala.Unit = js.native
  def moveTop(id: java.lang.String): scala.Unit = js.native
  def moveTop(id: scala.Double): scala.Unit = js.native
  def moveUp(id: java.lang.String, step: scala.Double): scala.Unit = js.native
  def moveUp(id: scala.Double, step: scala.Double): scala.Unit = js.native
}

