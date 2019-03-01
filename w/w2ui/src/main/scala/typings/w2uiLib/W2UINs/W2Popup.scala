package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Popup
  extends W2Common
     with W2Object {
  var defaults: js.Object = js.native
  var status: java.lang.String = js.native
  def clear(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def get(): js.Object = js.native
  def keydown(event: js.Object): scala.Unit = js.native
  def load(options: js.Object): scala.Unit = js.native
  def lock(message: java.lang.String): scala.Unit = js.native
  def lock(message: java.lang.String, showSpinner: scala.Boolean): scala.Unit = js.native
  def lockScreen(): scala.Unit = js.native
  def lockScreen(options: js.Object): scala.Unit = js.native
  def max(): scala.Unit = js.native
  def message(msgOptions: js.Object): scala.Unit = js.native
  def min(): scala.Unit = js.native
  def open(options: js.Object): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resize(width: scala.Double): scala.Double = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Double = js.native
  def resize(width: scala.Double, height: scala.Double, callback: js.Function): scala.Double = js.native
  @JSName("resize")
  def resize_Unit(): scala.Unit = js.native
  def set(options: js.Object): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
  def unlock(): scala.Unit = js.native
  def unlockScreen(): scala.Unit = js.native
}

