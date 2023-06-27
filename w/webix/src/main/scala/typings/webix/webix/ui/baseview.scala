package typings.webix.webix.ui

import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait baseview extends StObject {
  
  @JSName("$getSize")
  def $getSize(): js.Array[Any] = js.native
  @JSName("$getSize")
  def $getSize(dx: Double): js.Array[Any] = js.native
  @JSName("$getSize")
  def $getSize(dx: Double, dy: Double): js.Array[Any] = js.native
  @JSName("$getSize")
  def $getSize(dx: Unit, dy: Double): js.Array[Any] = js.native
  
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
  
  def bind(target: obj): Unit = js.native
  def bind(target: obj, rule: Unit, format: String): Unit = js.native
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  var config: baseviewConfig = js.native
  
  def define(property: String): Unit = js.native
  def define(property: String, value: Any): Unit = js.native
  def define(property: obj): Unit = js.native
  def define(property: obj, value: Any): Unit = js.native
  
  def destructor(): Unit = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def getChildViews(): js.Array[Any] = js.native
  
  def getFormView(): baseview = js.native
  
  def getNode(): obj = js.native
  
  def getParentView(): baseview = js.native
  
  def getTopParentView(): baseview = js.native
  
  def hide(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  var name: String = js.native
  
  def queryView(config: String): Any = js.native
  def queryView(config: String, mode: String): Any = js.native
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  def queryView(config: obj): Any = js.native
  def queryView(config: obj, mode: String): Any = js.native
  
  def resize(): Unit = js.native
  
  def show(): Unit = js.native
  def show(force: Boolean): Unit = js.native
  def show(force: Boolean, animation: Boolean): Unit = js.native
  def show(force: Unit, animation: Boolean): Unit = js.native
  
  def unbind(): Unit = js.native
}
