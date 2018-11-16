package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRenderStack extends js.Object {
  @JSName("$setSize")
  def $setSize(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def getItemNode(id: java.lang.String): stdLib.HTMLElement = js.native
  def getItemNode(id: scala.Double): stdLib.HTMLElement = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def showItem(id: java.lang.String): scala.Unit = js.native
  def showItem(id: scala.Double): scala.Unit = js.native
}

