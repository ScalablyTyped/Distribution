package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRecord extends js.Object {
  var config: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var name: java.lang.String = js.native
  def attachEvent(`type`: java.lang.String, functor: webixLib.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: java.lang.String, functor: webixLib.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def bind(target: js.Any): scala.Unit = js.native
  def bind(target: js.Any, rule: webixLib.WebixCallback): scala.Unit = js.native
  def bind(target: js.Any, rule: webixLib.WebixCallback, format: java.lang.String): scala.Unit = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getValues(): js.Any = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def load(url: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.WebixCallback): js.Promise[_] = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(id: java.lang.String): scala.Unit = js.native
  def refresh(id: scala.Double): scala.Unit = js.native
  def setValues(values: js.Any): scala.Unit = js.native
  def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

