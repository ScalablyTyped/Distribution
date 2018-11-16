package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Toolbar
  extends W2Common
     with W2OnClickable {
  var items: js.Array[W2Item] = js.native
  var right: java.lang.String = js.native
  var routeData: java.lang.String = js.native
  def add(items: js.Array[js.Object]): scala.Unit = js.native
  def add(items: js.Object): scala.Unit = js.native
  def check(ids: java.lang.String*): scala.Double = js.native
  def click(id: java.lang.String): scala.Unit = js.native
  def click(id: java.lang.String, event: js.Object): scala.Unit = js.native
  def disable(ids: java.lang.String*): scala.Double = js.native
  def enable(ids: java.lang.String*): scala.Double = js.native
  def get(id: java.lang.String): js.Object | scala.Double | scala.Unit = js.native
  def get(id: java.lang.String, returnIndex: scala.Boolean): js.Object | scala.Double | scala.Unit = js.native
  def getItemHTML(item: js.Object): java.lang.String = js.native
  def hide(ids: java.lang.String*): scala.Double = js.native
  def insert(before: java.lang.String, items: js.Array[js.Object]): scala.Unit = js.native
  def insert(before: java.lang.String, items: js.Object): scala.Unit = js.native
  def menuClick(id: java.lang.String, menuIndex: scala.Double): scala.Unit = js.native
  def menuClick(id: java.lang.String, menuIndex: scala.Double, event: js.Object): scala.Unit = js.native
  def remove(ids: java.lang.String*): scala.Double = js.native
  def set(id: java.lang.String, item: js.Object): scala.Boolean = js.native
  def show(ids: java.lang.String*): scala.Double = js.native
  def uncheck(ids: java.lang.String*): scala.Double = js.native
}

