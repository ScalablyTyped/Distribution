package typings.w3cDashScreenDashOrientation

import typings.std.Event
import typings.std.EventTarget
import typings.w3cDashScreenDashOrientation.w3cDashScreenDashOrientationStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenOrientation extends EventTarget {
  val angle: Double = js.native
  val `type`: OrientationType = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  def lock(orientation: ScreenOrientationLockType): js.Promise[Unit] = js.native
  def unlock(): Unit = js.native
}

