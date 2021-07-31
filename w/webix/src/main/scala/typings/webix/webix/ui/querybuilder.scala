package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait querybuilder
  extends StObject
     with baseview {
  
  def attachEvent(`type`: querybuilderEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: querybuilderEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  @JSName("config")
  var config_querybuilder: querybuilderConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def eachLine(callback: WebixCallback): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getFilterHelper(): WebixCallback = js.native
  
  def getSortingElements(): js.Array[js.Any] = js.native
  
  def getSortingHelper(): WebixCallback = js.native
  
  def getValue(): js.Any = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: js.Any): Unit = js.native
  
  def setValue(value: js.Any): Unit = js.native
  
  var sqlOperators: js.Any = js.native
  
  def toSQL(): js.Any = js.native
  def toSQL(config: js.Any): js.Any = js.native
  def toSQL(config: js.Any, rules: js.Any): js.Any = js.native
  def toSQL(config: Unit, rules: js.Any): js.Any = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Unit = js.native
}
