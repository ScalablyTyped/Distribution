package typings.webix.webix

import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIManager extends StObject {
  
  def addHotKey(key: String, handler: WebixCallback): Unit = js.native
  def addHotKey(key: String, handler: WebixCallback, obj: obj): Unit = js.native
  
  def applyChanges(): Unit = js.native
  
  def canFocus(id: String): Boolean = js.native
  def canFocus(id: Double): Boolean = js.native
  
  def destructor(): Unit = js.native
  
  def getFocus(): baseview = js.native
  
  def getNext(view: obj): obj = js.native
  
  def getPrev(view: obj): obj = js.native
  
  def getState(id: String, children: Boolean): obj = js.native
  
  def getTop(id: String): obj = js.native
  def getTop(id: Double): obj = js.native
  
  def hasFocus(id: String): Boolean = js.native
  def hasFocus(id: Double): Boolean = js.native
  
  def removeHotKey(key: String): Unit = js.native
  def removeHotKey(key: String, handler: Unit, obj: obj): Unit = js.native
  def removeHotKey(key: String, handler: WebixCallback): Unit = js.native
  def removeHotKey(key: String, handler: WebixCallback, obj: obj): Unit = js.native
  
  def setFocus(id: String): Unit = js.native
  def setFocus(id: Double): Unit = js.native
  
  def setState(state: obj): Unit = js.native
}
