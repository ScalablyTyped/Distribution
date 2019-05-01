package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIManager extends js.Object {
  def addHotKey(key: java.lang.String, handler: WebixCallback): scala.Unit = js.native
  def addHotKey(key: java.lang.String, handler: WebixCallback, obj: js.Any): scala.Unit = js.native
  def applyChanges(): scala.Unit = js.native
  def canFocus(id: java.lang.String): scala.Boolean = js.native
  def canFocus(id: scala.Double): scala.Boolean = js.native
  def destructor(): scala.Unit = js.native
  def getFocus(): webixLib.webixMod.uiNs.baseview = js.native
  def getNext(view: js.Any): js.Any = js.native
  def getPrev(view: js.Any): js.Any = js.native
  def getState(id: java.lang.String, childs: scala.Boolean): js.Any = js.native
  def getTop(id: java.lang.String): js.Any = js.native
  def getTop(id: scala.Double): js.Any = js.native
  def hasFocus(id: java.lang.String): scala.Boolean = js.native
  def hasFocus(id: scala.Double): scala.Boolean = js.native
  def removeHotKey(key: java.lang.String): scala.Unit = js.native
  def removeHotKey(key: java.lang.String, handler: WebixCallback): scala.Unit = js.native
  def removeHotKey(key: java.lang.String, handler: WebixCallback, obj: js.Any): scala.Unit = js.native
  def setFocus(id: java.lang.String): scala.Unit = js.native
  def setFocus(id: scala.Double): scala.Unit = js.native
  def setState(state: js.Any): scala.Unit = js.native
}

