package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.htmlform")
@js.native
class htmlform () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_htmlform: htmlformConfig = js.native
  def attachEvent(`type`: htmlformEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: htmlformEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def clear(all: scala.Boolean): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def focus(item: java.lang.String): scala.Unit = js.native
  def getCleanValues(): js.Any = js.native
  def getDirtyValues(): js.Any = js.native
  def getScrollState(): js.Any = js.native
  def getValues(): js.Any = js.native
  def getValues(details: js.Any): js.Any = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def isDirty(): scala.Boolean = js.native
  def load(url: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): stdLib.Promise[_] = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def markInvalid(name: java.lang.String): scala.Unit = js.native
  def markInvalid(name: java.lang.String, state: java.lang.String): scala.Unit = js.native
  def markInvalid(name: java.lang.String, state: scala.Boolean): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setContent(node: js.Any): scala.Unit = js.native
  def setDirty(): scala.Unit = js.native
  def setDirty(mark: scala.Boolean): scala.Unit = js.native
  def setHTML(html: java.lang.String): scala.Unit = js.native
  def setValues(values: js.Any): scala.Unit = js.native
  def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.webixNs.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

