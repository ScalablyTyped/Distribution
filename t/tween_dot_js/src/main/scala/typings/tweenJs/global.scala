package typings.tweenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object TWEEN extends js.Object {
    @js.native
    class Group ()
      extends typings.tweenJs.TWEEN.Group
    
    @js.native
    class Tween ()
      extends typings.tweenJs.TWEEN.Tween {
      def this(`object`: js.Any) = this()
      def this(`object`: js.UndefOr[scala.Nothing], group: typings.tweenJs.TWEEN.Group) = this()
      def this(`object`: js.Any, group: typings.tweenJs.TWEEN.Group) = this()
    }
    
    var Easing: typings.tweenJs.Easing = js.native
    var Interpolation: typings.tweenJs.Interpolation = js.native
    def add(tween: typings.tweenJs.TWEEN.Tween): Unit = js.native
    def getAll(): js.Array[typings.tweenJs.TWEEN.Tween] = js.native
    def now(): Double = js.native
    def remove(tween: typings.tweenJs.TWEEN.Tween): Unit = js.native
    def removeAll(): Unit = js.native
    def update(): Boolean = js.native
    def update(time: js.UndefOr[scala.Nothing], preserve: Boolean): Boolean = js.native
    def update(time: Double): Boolean = js.native
    def update(time: Double, preserve: Boolean): Boolean = js.native
  }
  
}

