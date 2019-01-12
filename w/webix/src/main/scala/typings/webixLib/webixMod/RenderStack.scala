package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderStack extends js.Object {
  var `type`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var types: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def customize(obj: js.Any): scala.Unit = js.native
  def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
  def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
  def locate(e: stdLib.Event): java.lang.String | scala.Double = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def showItem(id: java.lang.String): scala.Unit = js.native
  def showItem(id: scala.Double): scala.Unit = js.native
}

