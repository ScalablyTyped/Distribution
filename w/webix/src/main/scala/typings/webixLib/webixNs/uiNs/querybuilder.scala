package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.querybuilder")
@js.native
class querybuilder () extends baseview {
  @JSName("config")
  var config_querybuilder: querybuilderConfig = js.native
  var sqlOperators: js.Any = js.native
  def attachEvent(`type`: querybuilderEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: querybuilderEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getFilterHelper(): webixLib.webixNs.WebixCallback = js.native
  def getFilters(): js.Array[_] = js.native
  def getSortingElements(): js.Array[_] = js.native
  def getSortingHelper(): webixLib.webixNs.WebixCallback = js.native
  def getValue(): js.Array[_] = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def setFilters(filters: js.Array[_]): scala.Unit = js.native
  def setValue(rules: js.Any, fields: js.Array[_]): scala.Unit = js.native
  def toSQL(): js.Any = js.native
  def toSQL(config: js.Any): js.Any = js.native
  def toSQL(config: js.Any, rules: js.Any): js.Any = js.native
  def unblockEvent(): scala.Unit = js.native
  def validate(): scala.Unit = js.native
}

