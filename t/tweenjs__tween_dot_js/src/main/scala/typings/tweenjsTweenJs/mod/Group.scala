package typings.tweenjsTweenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controlling groups of tweens
  *
  * Using the TWEEN singleton to manage your tweens can cause issues in large apps with many components.
  * In these cases, you may want to create your own smaller groups of tween
  */
@JSImport("@tweenjs/tween.js", "Group")
@js.native
class Group () extends js.Object {
  
  var _tweens: js.Any = js.native
  
  var _tweensAddedDuringUpdate: js.Any = js.native
  
  def add(tween: Tween[UnknownProps]): Unit = js.native
  
  def getAll(): js.Array[Tween[UnknownProps]] = js.native
  
  def remove(tween: Tween[UnknownProps]): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def update(): Boolean = js.native
  def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
  def update(time: Double): Boolean = js.native
  def update(time: Double, preserve: Boolean): Boolean = js.native
}
