package typings.webix.mod.ui

import typings.std.HTMLElement
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.daterangesuggest")
@js.native
open class daterangesuggest ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$dragCreate")
  def $dragCreate(args: Any*): Any = js.native
  @JSName("$dragCreate")
  var $dragCreate_Original: WebixCallback = js.native
  
  @JSName("$dragDestroy")
  def $dragDestroy(args: Any*): Any = js.native
  @JSName("$dragDestroy")
  var $dragDestroy_Original: WebixCallback = js.native
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
  @JSName("$enterKey")
  def $enterKey(args: Any*): Any = js.native
  @JSName("$enterKey")
  var $enterKey_Original: WebixCallback = js.native
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_daterangesuggest: WebixCallback = js.native
  
  def attachEvent(`type`: daterangesuggestEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: daterangesuggestEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_daterangesuggest: daterangesuggestConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getBody(): Any = js.native
  
  def getButton(): typings.webix.webix.ui.baseview = js.native
  
  def getHead(): Any = js.native
  
  def getItemId(text: String): String | Double = js.native
  
  def getItemText(id: String): String = js.native
  def getItemText(id: Double): String = js.native
  
  def getList(): typings.webix.webix.ui.baseview = js.native
  
  def getMasterValue(): Any = js.native
  
  def getRange(): typings.webix.webix.ui.baseview = js.native
  
  def getSuggestion(): String = js.native
  
  def getValue(): String | Double = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def linkInput(input: HTMLElement): Unit = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def resizeChildren(): Unit = js.native
  
  def setMasterValue(value: Any, refresh: Boolean): Unit = js.native
  
  def setPosition(x: Double, y: Double): Unit = js.native
  
  def setValue(value: String): Unit = js.native
  def setValue(value: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
