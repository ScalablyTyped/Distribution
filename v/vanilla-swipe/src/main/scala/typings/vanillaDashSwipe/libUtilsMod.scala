package typings.vanillaDashSwipe

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vanillaDashSwipe.libUtilsCalculateMovingPositionMod.E
import typings.vanillaDashSwipe.libUtilsCalculatePositionMod.Value
import typings.vanillaDashSwipe.libUtilsCalculatePositionMod.nextPosition
import typings.vanillaDashSwipe.libUtilsCalculatePositionMod.prevPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-swipe/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  def calculateMovingPosition[T /* <: E */](e: T): Anon_X = js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): Anon_X = js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): Anon_X = js.native
  def calculatePosition(prevPos: prevPosition, nextPos: nextPosition): Value = js.native
  def checkIsMoreThanSingleTouches(e: js.Any): Boolean = js.native
  def checkIsPassiveSupported(): Boolean = js.native
  def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = js.native
  def getInitialProps(): Anon_Delta = js.native
  def getInitialProps(props: js.Object): Anon_Delta = js.native
  def getInitialState(): Anon_IsSwiping = js.native
  def rotateByAngle(position: Anon_X): typings.vanillaDashSwipe.libUtilsRotateByAngleMod.Value = js.native
  def rotateByAngle(position: Anon_X, angle: Double): typings.vanillaDashSwipe.libUtilsRotateByAngleMod.Value = js.native
}

