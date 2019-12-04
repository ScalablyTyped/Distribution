package typings.webix.webix

import org.scalablytyped.runtime.TopLevel
import typings.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDataMove extends js.Object {
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  def copy(sid: String, tindex: Double): Double = js.native
  def copy(sid: String, tindex: Double, tobj: baseview): Double = js.native
  def copy(sid: String, tindex: Double, tobj: baseview, details: js.Any): Double = js.native
  def copy(sid: Double, tindex: Double): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: baseview): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: baseview, details: js.Any): Double = js.native
  def move(sid: String, tindex: Double): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview, details: js.Any): String | Double = js.native
  def move(sid: Double, tindex: Double): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview, details: js.Any): String | Double = js.native
}

@JSGlobal("webix.TreeDataMove")
@js.native
object TreeDataMove extends TopLevel[TreeDataMove]

