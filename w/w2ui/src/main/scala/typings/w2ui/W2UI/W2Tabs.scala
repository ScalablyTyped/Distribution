package typings.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait W2Tabs
  extends W2Common
     with W2OnClickable
     with _W2Object {
  
  var active: String = js.native
  
  def add(tabs: js.Array[js.Object]): Unit = js.native
  def add(tabs: js.Object): Unit = js.native
  
  def animateClose(id: String): Unit = js.native
  def animateClose(id: String, event: js.Array[js.Object]): Unit = js.native
  def animateClose(id: String, event: js.Object): Unit = js.native
  
  def animateInsert(before: String, tabs: js.Array[js.Object]): Unit = js.native
  def animateInsert(before: String, tabs: js.Object): Unit = js.native
  
  def click(id: String): Unit = js.native
  def click(id: String, event: js.Object): Unit = js.native
  
  def disable(ids: String*): Double = js.native
  
  def enable(ids: String*): Double = js.native
  
  def get(id: String): js.Object | Double | Unit = js.native
  def get(id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  
  def hide(ids: String*): Double = js.native
  
  def insert(before: String, tabs: js.Array[js.Object]): Unit = js.native
  def insert(before: String, tabs: js.Object): Unit = js.native
  
  def remove(ids: String*): Double = js.native
  
  var right: String = js.native
  
  var routeData: String = js.native
  
  def select(id: String): Boolean = js.native
  
  def set(id: String, tab: js.Object): Boolean = js.native
  
  def show(ids: String*): Double = js.native
  
  var tabs: js.Array[W2Tab] = js.native
}
