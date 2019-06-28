package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValue extends js.Object {
  var name: java.lang.String = js.native
  def attachEvent(`type`: java.lang.String, functor: WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: java.lang.String, functor: WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def bind(target: js.Any): scala.Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): scala.Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: java.lang.String): scala.Unit = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getValue(): java.lang.String = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

@JSImport("webix", "DataValue")
@js.native
class DataValueCls () extends DataValue {
  def this(config: DataValueConfig) = this()
}

