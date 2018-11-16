package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.uploader")
@js.native
class uploader () extends baseview {
  @JSName("$compareValue")
  var $compareValue_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$cssName")
  var $cssName: java.lang.String = js.native
  @JSName("$onUploadComplete")
  var $onUploadComplete_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("$updateProgress")
  var $updateProgress_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("config")
  var config_uploader: uploaderConfig = js.native
  @JSName("on_click")
  var on_click_Original: webixLib.webixNs.WebixCallback = js.native
  var touchable: scala.Boolean = js.native
  @JSName("$compareValue")
  def $compareValue(args: js.Any*): js.Any = js.native
  @JSName("$getValue")
  def $getValue(): java.lang.String = js.native
  @JSName("$onUploadComplete")
  def $onUploadComplete(args: js.Any*): js.Any = js.native
  @JSName("$prepareValue")
  def $prepareValue(args: js.Any*): js.Any = js.native
  @JSName("$renderInput")
  def $renderInput(config: js.Any): stdLib.HTMLElement = js.native
  @JSName("$setValue")
  def $setValue(value: java.lang.String): scala.Unit = js.native
  @JSName("$updateProgress")
  def $updateProgress(args: js.Any*): js.Any = js.native
  def addDropZone(element: stdLib.HTMLElement): scala.Unit = js.native
  def addFile(name: java.lang.String, size: scala.Double): scala.Unit = js.native
  def addFile(name: java.lang.String, size: scala.Double, `type`: java.lang.String): scala.Unit = js.native
  def attachEvent(`type`: uploaderEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: uploaderEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def blur(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def fileDialog(): scala.Unit = js.native
  def fileDialog(content: js.Any): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getInputNode(): stdLib.HTMLElement = js.native
  def getValue(): java.lang.String = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def isUploaded(): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def render(id: java.lang.String, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def render(id: scala.Double, data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def send(id: java.lang.String): scala.Unit = js.native
  def send(id: scala.Double): scala.Unit = js.native
  def send(id: webixLib.webixNs.WebixCallback): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def stopUpload(id: java.lang.String): scala.Unit = js.native
  def stopUpload(id: scala.Double): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.webixNs.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

