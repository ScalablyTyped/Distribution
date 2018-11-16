package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseview extends js.Object {
  @JSName("$height")
  var $height: scala.Double = js.native
  @JSName("$skin")
  var $skin_Original: webixLib.webixNs.WebixCallback = js.native
  @JSName("$view")
  var $view: stdLib.HTMLElement = js.native
  @JSName("$width")
  var $width: scala.Double = js.native
  var config: baseviewConfig = js.native
  var name: java.lang.String = js.native
  @JSName("$getSize")
  def $getSize(): js.Array[_] = js.native
  @JSName("$setSize")
  def $setSize(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  @JSName("$skin")
  def $skin(args: js.Any*): js.Any = js.native
  def adjust(): scala.Unit = js.native
  def bind(target: js.Any): scala.Unit = js.native
  def bind(target: js.Any, rule: webixLib.webixNs.WebixCallback): scala.Unit = js.native
  def bind(target: js.Any, rule: webixLib.webixNs.WebixCallback, format: java.lang.String): scala.Unit = js.native
  def define(property: java.lang.String, value: js.Any): scala.Unit = js.native
  def destructor(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def getChildViews(): js.Array[_] = js.native
  def getFormView(): baseview = js.native
  def getNode(): js.Any = js.native
  def getParentView(): js.Any = js.native
  def getTopParentView(): baseview = js.native
  def hide(): scala.Unit = js.native
  def isEnabled(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def queryView(config: js.Any): js.Any = js.native
  def queryView(config: js.Any, mode: java.lang.String): js.Any = js.native
  def resize(): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(force: scala.Boolean): scala.Unit = js.native
  def show(force: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
}

