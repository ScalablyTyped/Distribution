package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDataMove extends js.Object {
  @JSName("$dropAllow")
  var $dropAllow_Original: webixLib.WebixCallback = js.native
  @JSName("$dropAllow")
  def $dropAllow(args: js.Any*): js.Any = js.native
  def copy(sid: java.lang.String, tindex: scala.Double): scala.Double = js.native
  def copy(sid: java.lang.String, tindex: scala.Double, tobj: webixLib.webixMod.uiNs.baseview): scala.Double = js.native
  def copy(
    sid: java.lang.String,
    tindex: scala.Double,
    tobj: webixLib.webixMod.uiNs.baseview,
    details: js.Any
  ): scala.Double = js.native
  def copy(sid: scala.Double, tindex: scala.Double): scala.Double = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: webixLib.webixMod.uiNs.baseview): scala.Double = js.native
  def copy(sid: scala.Double, tindex: scala.Double, tobj: webixLib.webixMod.uiNs.baseview, details: js.Any): scala.Double = js.native
  def move(sid: java.lang.String, tindex: scala.Double): java.lang.String | scala.Double = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: webixLib.webixMod.uiNs.baseview): java.lang.String | scala.Double = js.native
  def move(
    sid: java.lang.String,
    tindex: scala.Double,
    tobj: webixLib.webixMod.uiNs.baseview,
    details: js.Any
  ): java.lang.String | scala.Double = js.native
  def move(sid: scala.Double, tindex: scala.Double): java.lang.String | scala.Double = js.native
  def move(sid: scala.Double, tindex: scala.Double, tobj: webixLib.webixMod.uiNs.baseview): java.lang.String | scala.Double = js.native
  def move(sid: scala.Double, tindex: scala.Double, tobj: webixLib.webixMod.uiNs.baseview, details: js.Any): java.lang.String | scala.Double = js.native
}

