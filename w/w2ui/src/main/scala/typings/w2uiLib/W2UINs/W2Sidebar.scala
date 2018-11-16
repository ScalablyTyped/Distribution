package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Sidebar
  extends W2Common
     with W2OnClickable {
  var bottomHTML: java.lang.String = js.native
  var icon: java.lang.String = js.native
  var img: java.lang.String = js.native
  var keyboard: scala.Boolean = js.native
  var menu: js.Array[js.Object] = js.native
  var nodes: js.Array[js.Object] = js.native
  var parent: W2Common = js.native
  var routeData: java.lang.String = js.native
  var selected: java.lang.String = js.native
  var sidebar: js.Object = js.native
  var topHTML: java.lang.String = js.native
  def add(nodes: js.Array[js.Object]): js.Object = js.native
  def add(nodes: js.Object): js.Object = js.native
  def add(parent: java.lang.String, nodes: js.Array[js.Object]): js.Object = js.native
  def add(parent: java.lang.String, nodes: js.Object): js.Object = js.native
  def click(id: java.lang.String): scala.Unit = js.native
  def click(id: java.lang.String, event: js.Object): scala.Unit = js.native
  def collapse(id: java.lang.String): scala.Unit = js.native
  def collapseAll(): scala.Unit = js.native
  def collapseAll(parent: java.lang.String): scala.Unit = js.native
  def contextMenu(id: java.lang.String): scala.Unit = js.native
  def contextMenu(id: java.lang.String, event: js.Object): scala.Unit = js.native
  def dblClick(id: java.lang.String): scala.Unit = js.native
  def dblClick(id: java.lang.String, event: js.Object): scala.Unit = js.native
  def disable(ids: java.lang.String*): scala.Double = js.native
  def enable(ids: java.lang.String*): scala.Double = js.native
  def expand(id: java.lang.String): scala.Unit = js.native
  def expandAll(): scala.Unit = js.native
  def expandAll(parent: java.lang.String): scala.Unit = js.native
  def expandParents(id: java.lang.String): scala.Unit = js.native
  def find(attrs: js.Object): js.Array[js.Object] = js.native
  def find(parent: java.lang.String, attrs: js.Object): js.Array[js.Object] = js.native
  def get(): js.Object | scala.Double | scala.Unit = js.native
  def get(id: java.lang.String): js.Object | scala.Double | scala.Unit = js.native
  def get(id: java.lang.String, returnIndex: scala.Boolean): js.Object | scala.Double | scala.Unit = js.native
  def get(parent: java.lang.String, id: java.lang.String): js.Object | scala.Double | scala.Unit = js.native
  def get(parent: java.lang.String, id: java.lang.String, returnIndex: scala.Boolean): js.Object | scala.Double | scala.Unit = js.native
  def hide(ids: java.lang.String*): scala.Double = js.native
  def insert(before: java.lang.String, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(before: java.lang.String, nodes: js.Object): js.Object = js.native
  def insert(before: js.Object, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(before: js.Object, nodes: js.Object): js.Object = js.native
  def insert(parent: java.lang.String, before: java.lang.String, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(parent: java.lang.String, before: java.lang.String, nodes: js.Object): js.Object = js.native
  def insert(parent: java.lang.String, before: js.Object, nodes: js.Array[js.Object]): js.Object = js.native
  def insert(parent: java.lang.String, before: js.Object, nodes: js.Object): js.Object = js.native
  def keydown(event: js.Object): scala.Unit = js.native
  def lock(message: java.lang.String): scala.Unit = js.native
  def lock(message: java.lang.String, showSpinner: scala.Boolean): scala.Unit = js.native
  def menuClick(id: java.lang.String, index: scala.Double): scala.Unit = js.native
  def menuClick(id: java.lang.String, index: scala.Double, event: js.Object): scala.Unit = js.native
  def remove(ids: java.lang.String*): scala.Double = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(id: java.lang.String): scala.Unit = js.native
  def select(id: java.lang.String): scala.Unit = js.native
  def set(id: java.lang.String, node: js.Object): scala.Boolean = js.native
  def set(parent: java.lang.String, id: java.lang.String, node: js.Object): scala.Boolean = js.native
  def show(ids: java.lang.String*): scala.Double = js.native
  def toggle(id: java.lang.String): scala.Unit = js.native
  def unlock(): scala.Unit = js.native
  def unselect(id: java.lang.String): scala.Boolean = js.native
}

