package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValue extends js.Object {
  var name: String = js.native
  def attachEvent(`type`: String, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: String, functor: WebixCallback, id: String): String | Double = js.native
  def bind(target: js.Any): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getValue(): String = js.native
  def hasEvent(name: String): Boolean = js.native
  def isVisible(): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def refresh(): Unit = js.native
  def setValue(value: String): Unit = js.native
  def unbind(): Unit = js.native
  def unblockEvent(): Unit = js.native
}

@JSImport("webix", "DataValue")
@js.native
object DataValue extends TopLevel[DataValueFactory]

