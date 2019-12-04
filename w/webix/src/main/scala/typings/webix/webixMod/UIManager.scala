package typings.webix.webixMod

import org.scalablytyped.runtime.TopLevel
import typings.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIManager extends js.Object {
  def addHotKey(key: String, handler: WebixCallback): Unit = js.native
  def addHotKey(key: String, handler: WebixCallback, obj: js.Any): Unit = js.native
  def applyChanges(): Unit = js.native
  def canFocus(id: String): Boolean = js.native
  def canFocus(id: Double): Boolean = js.native
  def destructor(): Unit = js.native
  def getFocus(): baseview = js.native
  def getNext(view: js.Any): js.Any = js.native
  def getPrev(view: js.Any): js.Any = js.native
  def getState(id: String, children: Boolean): js.Any = js.native
  def getTop(id: String): js.Any = js.native
  def getTop(id: Double): js.Any = js.native
  def hasFocus(id: String): Boolean = js.native
  def hasFocus(id: Double): Boolean = js.native
  def removeHotKey(key: String): Unit = js.native
  def removeHotKey(key: String, handler: WebixCallback): Unit = js.native
  def removeHotKey(key: String, handler: WebixCallback, obj: js.Any): Unit = js.native
  def setFocus(id: String): Unit = js.native
  def setFocus(id: Double): Unit = js.native
  def setState(state: js.Any): Unit = js.native
}

@JSImport("webix", "UIManager")
@js.native
object UIManager extends TopLevel[UIManager]

