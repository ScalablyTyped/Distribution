package typings.w2ui.W2UI_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Toolbar
  extends W2Common
     with W2OnClickable
     with _W2Object {
  var items: js.Array[W2Item] = js.native
  var right: String = js.native
  var routeData: String = js.native
  def add(items: js.Array[js.Object]): Unit = js.native
  def add(items: js.Object): Unit = js.native
  def check(ids: String*): Double = js.native
  def click(id: String): Unit = js.native
  def click(id: String, event: js.Object): Unit = js.native
  def disable(ids: String*): Double = js.native
  def enable(ids: String*): Double = js.native
  def get(id: String): js.Object | Double | Unit = js.native
  def get(id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  def getItemHTML(item: js.Object): String = js.native
  def hide(ids: String*): Double = js.native
  def insert(before: String, items: js.Array[js.Object]): Unit = js.native
  def insert(before: String, items: js.Object): Unit = js.native
  def menuClick(id: String, menuIndex: Double): Unit = js.native
  def menuClick(id: String, menuIndex: Double, event: js.Object): Unit = js.native
  def remove(ids: String*): Double = js.native
  def set(id: String, item: js.Object): Boolean = js.native
  def show(ids: String*): Double = js.native
  def uncheck(ids: String*): Double = js.native
}

