package typings.webix.webix

import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeDataMove extends StObject {
  
  @JSName("$dropAllow")
  def $dropAllow(args: Any*): Any = js.native
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback = js.native
  
  def copy(sid: String, tindex: Double): Double = js.native
  def copy(sid: String, tindex: Double, tobj: Unit, details: obj): Double = js.native
  def copy(sid: String, tindex: Double, tobj: baseview): Double = js.native
  def copy(sid: String, tindex: Double, tobj: baseview, details: obj): Double = js.native
  def copy(sid: Double, tindex: Double): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: Unit, details: obj): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: baseview): Double = js.native
  def copy(sid: Double, tindex: Double, tobj: baseview, details: obj): Double = js.native
  
  def move(sid: String, tindex: Double): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: obj): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: String, tindex: Double, tobj: baseview, details: obj): String | Double = js.native
  def move(sid: Double, tindex: Double): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: Unit, details: obj): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview): String | Double = js.native
  def move(sid: Double, tindex: Double, tobj: baseview, details: obj): String | Double = js.native
}
