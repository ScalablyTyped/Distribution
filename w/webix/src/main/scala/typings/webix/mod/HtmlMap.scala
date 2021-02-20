package typings.webix.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlMap extends StObject {
  
  def addPoly(id: String, points: js.Array[_]): Unit = js.native
  def addPoly(id: String, points: js.Array[_], userdata: String): Unit = js.native
  def addPoly(id: Double, points: js.Array[_]): Unit = js.native
  def addPoly(id: Double, points: js.Array[_], userdata: String): Unit = js.native
  
  def addRect(id: String, points: js.Array[_]): Unit = js.native
  def addRect(id: String, points: js.Array[_], userdata: String): Unit = js.native
  def addRect(id: Double, points: js.Array[_]): Unit = js.native
  def addRect(id: Double, points: js.Array[_], userdata: String): Unit = js.native
  
  def addSector(id: String, aplha0: Double, aplha1: Double, x: Double, y: Double, R: Double, ky: Double): Unit = js.native
  def addSector(
    id: String,
    aplha0: Double,
    aplha1: Double,
    x: Double,
    y: Double,
    R: Double,
    ky: Double,
    userdata: String
  ): Unit = js.native
  def addSector(id: Double, aplha0: Double, aplha1: Double, x: Double, y: Double, R: Double, ky: Double): Unit = js.native
  def addSector(
    id: Double,
    aplha0: Double,
    aplha1: Double,
    x: Double,
    y: Double,
    R: Double,
    ky: Double,
    userdata: String
  ): Unit = js.native
  
  def hide(html: HTMLElement, userdata: String, mode: Boolean): Unit = js.native
  
  def render(html: HTMLElement): Unit = js.native
}
