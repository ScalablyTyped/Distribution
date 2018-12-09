package typings
package w3cDashScreenDashOrientationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenOrientation
  extends stdLib.EventTarget {
  val angle: scala.Double = js.native
  val `type`: OrientationType = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: w3cDashScreenDashOrientationLib.w3cDashScreenDashOrientationLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: w3cDashScreenDashOrientationLib.w3cDashScreenDashOrientationLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def lock(orientation: ScreenOrientationLockType): js.Promise[scala.Unit] = js.native
  def unlock(): scala.Unit = js.native
}

