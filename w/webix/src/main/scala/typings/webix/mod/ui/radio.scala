package typings.webix.mod.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.radio")
@js.native
open class radio ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$allowsClear")
  var $allowsClear: Boolean = js.native
  
  @JSName("$compareValue")
  def $compareValue(args: Any*): Any = js.native
  @JSName("$compareValue")
  var $compareValue_Original: WebixCallback = js.native
  
  @JSName("$getValue")
  def $getValue(): String = js.native
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$render")
  def $render(args: Any*): Any = js.native
  
  @JSName("$renderIcon")
  def $renderIcon(args: Any*): Any = js.native
  @JSName("$renderIcon")
  var $renderIcon_Original: WebixCallback = js.native
  
  @JSName("$renderInput")
  def $renderInput(obj: obj, html: String, id: String): String = js.native
  @JSName("$renderInput")
  def $renderInput(obj: obj, html: String, id: Double): String = js.native
  
  @JSName("$renderLabel")
  def $renderLabel(config: obj, id: String): String = js.native
  @JSName("$renderLabel")
  def $renderLabel(config: obj, id: Double): String = js.native
  
  @JSName("$render")
  var $render_Original: WebixCallback = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$setValue")
  def $setValue(value: String): Unit = js.native
  
  @JSName("$skin")
  var $skin_Original_radio: WebixCallback = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def addOption(id: String, value: Any): Unit = js.native
  def addOption(id: String, value: Any, show: Boolean): Unit = js.native
  def addOption(id: String, value: Any, show: Boolean, index: Double): Unit = js.native
  def addOption(id: String, value: Any, show: Unit, index: Double): Unit = js.native
  def addOption(id: Double, value: Any): Unit = js.native
  def addOption(id: Double, value: Any, show: Boolean): Unit = js.native
  def addOption(id: Double, value: Any, show: Boolean, index: Double): Unit = js.native
  def addOption(id: Double, value: Any, show: Unit, index: Double): Unit = js.native
  
  def attachEvent(`type`: radioEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: radioEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def blur(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_radio: radioConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def disableOption(id: String): Unit = js.native
  def disableOption(id: Double): Unit = js.native
  
  def enableOption(id: String): Unit = js.native
  def enableOption(id: Double): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getInputNode(): HTMLElement = js.native
  
  def getOption(id: String): obj = js.native
  def getOption(id: Double): obj = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def hideOption(id: String): Unit = js.native
  def hideOption(id: Double): Unit = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def on_click(args: Any*): Any = js.native
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  
  def optionIndex(ID: String): Double = js.native
  def optionIndex(ID: Double): Double = js.native
  
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  
  def refresh(): Unit = js.native
  
  def removeOption(id: String): Unit = js.native
  def removeOption(id: Double): Unit = js.native
  
  def render(): Unit = js.native
  def render(id: String): Unit = js.native
  def render(id: String, data: Unit, `type`: String): Unit = js.native
  def render(id: String, data: obj): Unit = js.native
  def render(id: String, data: obj, `type`: String): Unit = js.native
  def render(id: Double): Unit = js.native
  def render(id: Double, data: Unit, `type`: String): Unit = js.native
  def render(id: Double, data: obj): Unit = js.native
  def render(id: Double, data: obj, `type`: String): Unit = js.native
  def render(id: Unit, data: Unit, `type`: String): Unit = js.native
  def render(id: Unit, data: obj): Unit = js.native
  def render(id: Unit, data: obj, `type`: String): Unit = js.native
  
  def setBottomText(text: String): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: String, config: Any): Unit = js.native
  def setValue(value: Double): Unit = js.native
  def setValue(value: Double, config: Any): Unit = js.native
  
  def setValueHere(value: String): Unit = js.native
  def setValueHere(value: Double): Unit = js.native
  
  def showOption(id: String): Unit = js.native
  def showOption(id: Double): Unit = js.native
  
  def sync(source: obj): Unit = js.native
  def sync(source: obj, filter: Unit, silent: Boolean): Unit = js.native
  def sync(source: obj, filter: WebixCallback): Unit = js.native
  def sync(source: obj, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  var touchable: Boolean = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
}
