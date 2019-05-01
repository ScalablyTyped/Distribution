package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProcessor extends js.Object {
  var config: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var name: java.lang.String = js.native
  def attachEvent(`type`: java.lang.String, functor: WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: java.lang.String, functor: WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def attachProgress(start: WebixCallback, end: WebixCallback, error: WebixCallback): scala.Unit = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clearValidation(): scala.Unit = js.native
  def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def escape(value: java.lang.String): java.lang.String = js.native
  def getItemState(itemId: java.lang.String): js.Any = js.native
  def getItemState(itemId: scala.Double): js.Any = js.native
  def getState(): java.lang.String | scala.Boolean = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def ignore(code: WebixCallback, master: js.Any): scala.Unit = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def on(): scala.Unit = js.native
  def processResult(data: js.Any): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def save(id: java.lang.String, operation: java.lang.String): scala.Unit = js.native
  def save(id: scala.Double, operation: java.lang.String): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def setItemState(itemId: java.lang.String, state: scala.Boolean): scala.Unit = js.native
  def setItemState(itemId: scala.Double, state: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def validate(): scala.Boolean = js.native
  def validate(mode: js.Any): scala.Boolean = js.native
}

