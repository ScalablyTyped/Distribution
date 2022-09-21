package typings.webix.mod

import typings.webix.mod.^
import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIManager extends StObject {
  
  def addHotKey(key: String, handler: WebixCallback): Unit = js.native
  def addHotKey(key: String, handler: WebixCallback, obj: Any): Unit = js.native
  
  def applyChanges(): Unit = js.native
  
  def canFocus(id: String): Boolean = js.native
  def canFocus(id: Double): Boolean = js.native
  
  def destructor(): Unit = js.native
  
  def getFocus(): baseview = js.native
  
  def getNext(view: Any): Any = js.native
  
  def getPrev(view: Any): Any = js.native
  
  def getState(id: String, children: Boolean): Any = js.native
  
  def getTop(id: String): Any = js.native
  def getTop(id: Double): Any = js.native
  
  def hasFocus(id: String): Boolean = js.native
  def hasFocus(id: Double): Boolean = js.native
  
  def removeHotKey(key: String): Unit = js.native
  def removeHotKey(key: String, handler: Unit, obj: Any): Unit = js.native
  def removeHotKey(key: String, handler: WebixCallback): Unit = js.native
  def removeHotKey(key: String, handler: WebixCallback, obj: Any): Unit = js.native
  
  def setFocus(id: String): Unit = js.native
  def setFocus(id: Double): Unit = js.native
  
  def setState(state: Any): Unit = js.native
}
object UIManager {
  
  inline def apply: UIManager = ^.asInstanceOf[js.Dynamic].selectDynamic("UIManager").asInstanceOf[UIManager]
}
