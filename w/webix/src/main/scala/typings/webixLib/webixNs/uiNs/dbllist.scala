package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.dbllist")
@js.native
class dbllist () extends baseview {
  @JSName("$$")
  var $$: js.Any = js.native
  @JSName("$onLoad")
  var $onLoad_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("config")
  var config_dbllist: dbllistConfig = js.native
  @JSName("$onLoad")
  def $onLoad(args: js.Any*): js.Any = js.native
  def attachEvent(`type`: dbllistEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: dbllistEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getValue(): java.lang.String = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
  def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
  def load(url: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): stdLib.Promise[_] = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def select(id: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
  def select(id: js.Array[_], mode: scala.Boolean): scala.Unit = js.native
  def setValue(ids: java.lang.String): scala.Unit = js.native
  def setValue(ids: js.Array[_]): scala.Unit = js.native
  def ui(view: js.Any): baseview = js.native
  def unblockEvent(): scala.Unit = js.native
}

