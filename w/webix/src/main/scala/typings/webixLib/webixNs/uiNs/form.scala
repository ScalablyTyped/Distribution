package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.form")
@js.native
class form () extends baseview {
  @JSName("config")
  var config_form: formConfig = js.native
  var elements: js.Any = js.native
  def addView(view: js.Any): java.lang.String | scala.Double = js.native
  def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: formEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: formEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def clearValidation(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def focus(item: java.lang.String): scala.Unit = js.native
  def getCleanValues(): js.Any = js.native
  def getDirtyValues(): js.Any = js.native
  def getScrollState(): js.Any = js.native
  def getValues(): js.Any = js.native
  def getValues(details: js.Any): js.Any = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def index(obj: js.Any): scala.Double = js.native
  def isDirty(): scala.Boolean = js.native
  def load(url: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): stdLib.Promise[_] = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def markInvalid(name: java.lang.String): scala.Unit = js.native
  def markInvalid(name: java.lang.String, state: java.lang.String): scala.Unit = js.native
  def markInvalid(name: java.lang.String, state: scala.Boolean): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def reconstruct(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def removeView(id: js.Any): scala.Unit = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def resizeChildren(): scala.Unit = js.native
  def restore(state: js.Any): scala.Unit = js.native
  def restore(state: js.Any, factory: webixLib.webixNs.WebixCallback): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def serialize(): js.Any = js.native
  def serialize(serializer: webixLib.webixNs.WebixCallback): js.Any = js.native
  def setDirty(): scala.Unit = js.native
  def setDirty(mark: scala.Boolean): scala.Unit = js.native
  def setValues(values: js.Any): scala.Unit = js.native
  def setValues(values: js.Any, update: scala.Boolean): scala.Unit = js.native
  def showBatch(name: java.lang.String): scala.Unit = js.native
  def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def validate(): scala.Boolean = js.native
  def validate(mode: js.Any): scala.Boolean = js.native
}

