package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Tabs
  extends W2Common
     with W2OnClickable
     with W2Object {
  var active: java.lang.String = js.native
  var right: java.lang.String = js.native
  var routeData: java.lang.String = js.native
  var tabs: js.Array[W2Tab] = js.native
  def add(tabs: js.Array[js.Object]): scala.Unit = js.native
  def add(tabs: js.Object): scala.Unit = js.native
  def animateClose(id: java.lang.String): scala.Unit = js.native
  def animateClose(id: java.lang.String, event: js.Array[js.Object]): scala.Unit = js.native
  def animateClose(id: java.lang.String, event: js.Object): scala.Unit = js.native
  def animateInsert(before: java.lang.String, tabs: js.Array[js.Object]): scala.Unit = js.native
  def animateInsert(before: java.lang.String, tabs: js.Object): scala.Unit = js.native
  def click(id: java.lang.String): scala.Unit = js.native
  def click(id: java.lang.String, event: js.Object): scala.Unit = js.native
  def disable(ids: java.lang.String*): scala.Double = js.native
  def enable(ids: java.lang.String*): scala.Double = js.native
  def get(id: java.lang.String): js.Object | scala.Double | scala.Unit = js.native
  def get(id: java.lang.String, returnIndex: scala.Boolean): js.Object | scala.Double | scala.Unit = js.native
  def hide(ids: java.lang.String*): scala.Double = js.native
  def insert(before: java.lang.String, tabs: js.Array[js.Object]): scala.Unit = js.native
  def insert(before: java.lang.String, tabs: js.Object): scala.Unit = js.native
  def remove(ids: java.lang.String*): scala.Double = js.native
  def select(id: java.lang.String): scala.Boolean = js.native
  def set(id: java.lang.String, tab: js.Object): scala.Boolean = js.native
  def show(ids: java.lang.String*): scala.Double = js.native
}

