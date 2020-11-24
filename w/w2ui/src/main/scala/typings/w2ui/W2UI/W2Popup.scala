package typings.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait W2Popup
  extends W2Common
     with _W2Object {
  
  def clear(): Unit = js.native
  
  def close(): Unit = js.native
  
  var defaults: js.Object = js.native
  
  def get(): js.Object = js.native
  
  def keydown(event: js.Object): Unit = js.native
  
  def load(options: js.Object): Unit = js.native
  
  def lock(message: String): Unit = js.native
  def lock(message: String, showSpinner: Boolean): Unit = js.native
  
  def lockScreen(): Unit = js.native
  def lockScreen(options: js.Object): Unit = js.native
  
  def max(): Unit = js.native
  
  def message(msgOptions: js.Object): Unit = js.native
  
  def min(): Unit = js.native
  
  def open(options: js.Object): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resize(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], callback: js.Function): Double = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: Double): Double = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: Double, callback: js.Function): Double = js.native
  def resize(width: Double): Double = js.native
  def resize(width: Double, height: js.UndefOr[scala.Nothing], callback: js.Function): Double = js.native
  def resize(width: Double, height: Double): Double = js.native
  def resize(width: Double, height: Double, callback: js.Function): Double = js.native
  @JSName("resize")
  def resize_Unit(): Unit = js.native
  
  def set(options: js.Object): Unit = js.native
  
  var status: String = js.native
  
  def toggle(): Unit = js.native
  
  def unlock(): Unit = js.native
  
  def unlockScreen(): Unit = js.native
}
