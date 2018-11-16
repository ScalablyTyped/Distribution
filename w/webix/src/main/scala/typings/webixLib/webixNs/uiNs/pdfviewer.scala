package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.pdfviewer")
@js.native
class pdfviewer () extends baseview {
  @JSName("$numPages")
  var $numPages: scala.Double = js.native
  @JSName("$onLoad")
  var $onLoad_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$pageNum")
  var $pageNum: scala.Double = js.native
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_pdfviewer: pdfviewerConfig = js.native
  @JSName("$onLoad")
  def $onLoad(args: js.Any*): js.Any = js.native
  def attachEvent(`type`: pdfviewerEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: pdfviewerEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def download(): scala.Unit = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def load(url: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): stdLib.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.webixNs.WebixCallback): stdLib.Promise[_] = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def nextPage(): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def prevPage(): scala.Unit = js.native
  def renderPage(page: scala.Double): scala.Unit = js.native
  def setScale(scale: java.lang.String, update: scala.Boolean): scala.Unit = js.native
  def setScale(scale: scala.Double, update: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
  def zoomIn(): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
}

