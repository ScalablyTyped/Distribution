package typings.webix.webixMod.ui

import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait resizearea extends js.Object {
  var config: resizeareaConfig = js.native
  var name: String = js.native
  def attachEvent(`type`: resizeareaEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: resizeareaEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def define(property: String, value: js.Any): Unit = js.native
  def detachEvent(id: String): Unit = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def unblockEvent(): Unit = js.native
}

