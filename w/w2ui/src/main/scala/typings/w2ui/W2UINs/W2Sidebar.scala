package typings.w2ui.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Sidebar
  extends W2Common
     with W2OnClickable
     with W2Object {
  var bottomHTML: String = js.native
  var icon: String = js.native
  var img: String = js.native
  var keyboard: Boolean = js.native
  var menu: js.Array[js.Object] = js.native
  var nodes: js.Array[js.Object] = js.native
  var parent: W2Common = js.native
  var routeData: String = js.native
  var selected: String = js.native
  var sidebar: js.Object = js.native
  var topHTML: String = js.native
  def add(nodes: js.Array[js.Object]): js.Object = js.native
  def add(nodes: js.Object): js.Object = js.native
  def add(parent: String, nodes: js.Array[js.Object]): js.Object = js.native
  def add(parent: String, nodes: js.Object): js.Object = js.native
  def click(id: String): Unit = js.native
  def click(id: String, event: js.Object): Unit = js.native
  def collapse(id: String): Unit = js.native
  def collapseAll(): Unit = js.native
  def collapseAll(parent: String): Unit = js.native
  def contextMenu(id: String): Unit = js.native
  def contextMenu(id: String, event: js.Object): Unit = js.native
  def dblClick(id: String): Unit = js.native
  def dblClick(id: String, event: js.Object): Unit = js.native
  def disable(ids: String*): Double = js.native
  def enable(ids: String*): Double = js.native
  def expand(id: String): Unit = js.native
  def expandAll(): Unit = js.native
  def expandAll(parent: String): Unit = js.native
  def expandParents(id: String): Unit = js.native
  def find(attrs: js.Object): js.Array[js.Object] = js.native
  def find(parent: String, attrs: js.Object): js.Array[js.Object] = js.native
  def get(): js.Object | Double | Unit = js.native
  def get(id: String): js.Object | Double | Unit = js.native
  def get(id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  def get(parent: String, id: String): js.Object | Double | Unit = js.native
  def get(parent: String, id: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  def hide(ids: String*): Double = js.native
  def insert(before: String, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(before: String, nodes: js.Object): js.Object = js.native
  def insert(before: js.Object, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(before: js.Object, nodes: js.Object): js.Object = js.native
  def insert(parent: String, before: String, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(parent: String, before: String, nodes: js.Object): js.Object = js.native
  def insert(parent: String, before: js.Object, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(parent: String, before: js.Object, nodes: js.Object): js.Object = js.native
  def keydown(event: js.Object): Unit = js.native
  def lock(message: String): Unit = js.native
  def lock(message: String, showSpinner: Boolean): Unit = js.native
  def menuClick(id: String, index: Double): Unit = js.native
  def menuClick(id: String, index: Double, event: js.Object): Unit = js.native
  def remove(ids: String*): Double = js.native
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(id: String): Unit = js.native
  def select(id: String): Unit = js.native
  def set(id: String, node: js.Object): Boolean = js.native
  def set(parent: String, id: String, node: js.Object): Boolean = js.native
  def show(ids: String*): Double = js.native
  def toggle(id: String): Unit = js.native
  def unlock(): Unit = js.native
  def unselect(id: String): Boolean = js.native
}

