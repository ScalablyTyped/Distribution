package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlMap extends js.Object {
  def addPoly(id: java.lang.String, points: js.Array[_]): scala.Unit = js.native
  def addPoly(id: java.lang.String, points: js.Array[_], userdata: java.lang.String): scala.Unit = js.native
  def addPoly(id: scala.Double, points: js.Array[_]): scala.Unit = js.native
  def addPoly(id: scala.Double, points: js.Array[_], userdata: java.lang.String): scala.Unit = js.native
  def addRect(id: java.lang.String, points: js.Array[_]): scala.Unit = js.native
  def addRect(id: java.lang.String, points: js.Array[_], userdata: java.lang.String): scala.Unit = js.native
  def addRect(id: scala.Double, points: js.Array[_]): scala.Unit = js.native
  def addRect(id: scala.Double, points: js.Array[_], userdata: java.lang.String): scala.Unit = js.native
  def addSector(
    id: java.lang.String,
    aplha0: scala.Double,
    aplha1: scala.Double,
    x: scala.Double,
    y: scala.Double,
    R: scala.Double,
    ky: scala.Double
  ): scala.Unit = js.native
  def addSector(
    id: java.lang.String,
    aplha0: scala.Double,
    aplha1: scala.Double,
    x: scala.Double,
    y: scala.Double,
    R: scala.Double,
    ky: scala.Double,
    userdata: java.lang.String
  ): scala.Unit = js.native
  def addSector(
    id: scala.Double,
    aplha0: scala.Double,
    aplha1: scala.Double,
    x: scala.Double,
    y: scala.Double,
    R: scala.Double,
    ky: scala.Double
  ): scala.Unit = js.native
  def addSector(
    id: scala.Double,
    aplha0: scala.Double,
    aplha1: scala.Double,
    x: scala.Double,
    y: scala.Double,
    R: scala.Double,
    ky: scala.Double,
    userdata: java.lang.String
  ): scala.Unit = js.native
  def hide(html: stdLib.HTMLElement, userdata: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
  def render(html: stdLib.HTMLElement): scala.Unit = js.native
}

