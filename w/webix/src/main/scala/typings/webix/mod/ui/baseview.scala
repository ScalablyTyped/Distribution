package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait baseview extends StObject {
  
  @JSName("$getSize")
  def $getSize(): js.Array[Any] = js.native
  
  @JSName("$height")
  var $height: Double = js.native
  
  @JSName("$setNode")
  var $setNode: Any = js.native
  
  @JSName("$setSize")
  def $setSize(x: Double, y: Double): Boolean = js.native
  
  @JSName("$skin")
  def $skin(args: Any*): Any = js.native
  @JSName("$skin")
  var $skin_Original: WebixCallback = js.native
  
  @JSName("$view")
  var $view: HTMLElement = js.native
  
  @JSName("$width")
  var $width: Double = js.native
  
  def adjust(): Unit = js.native
  
  def bind(target: Any): Unit = js.native
  def bind(target: Any, rule: Unit, format: String): Unit = js.native
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  var config: baseviewConfig = js.native
  
  def define(property: String, value: Any): Unit = js.native
  
  def destructor(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def getChildViews(): js.Array[Any] = js.native
  
  def getFormView(): typings.webix.webix.ui.baseview = js.native
  
  def getNode(): Any = js.native
  
  def getParentView(): Any = js.native
  
  def getTopParentView(): typings.webix.webix.ui.baseview = js.native
  
  def hide(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  var name: String = js.native
  
  def queryView(config: Any): Any = js.native
  def queryView(config: Any, mode: String): Any = js.native
  
  def resize(): Unit = js.native
  
  def show(): Unit = js.native
  def show(force: Boolean): Unit = js.native
  def show(force: Boolean, animation: Boolean): Unit = js.native
  def show(force: Unit, animation: Boolean): Unit = js.native
  
  def unbind(): Unit = js.native
}
