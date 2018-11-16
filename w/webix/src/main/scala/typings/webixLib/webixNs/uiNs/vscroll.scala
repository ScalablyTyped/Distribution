package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait vscroll extends js.Object {
  var config: vscrollConfig = js.native
  var name: java.lang.String = js.native
  def activeArea(node: stdLib.HTMLElement): scala.Unit = js.native
  def attachEvent(`type`: vscrollEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: vscrollEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getScroll(): scala.Double = js.native
  def getSize(): scala.Double = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def scrollTo(pos: scala.Double): scala.Unit = js.native
  def sizeTo(size: scala.Double): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

