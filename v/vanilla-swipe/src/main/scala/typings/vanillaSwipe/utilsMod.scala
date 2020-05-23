package typings.vanillaSwipe

import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.vanillaSwipe.anon.Delta
import typings.vanillaSwipe.anon.IsSwiping
import typings.vanillaSwipe.anon.Passive
import typings.vanillaSwipe.anon.PassiveUndefined
import typings.vanillaSwipe.anon.X
import typings.vanillaSwipe.anon.Y
import typings.vanillaSwipe.calculateMovingPositionMod.E
import typings.vanillaSwipe.calculatePositionMod.Value
import typings.vanillaSwipe.calculatePositionMod.nextPosition
import typings.vanillaSwipe.calculatePositionMod.prevPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-swipe/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def calculateDuration(): Double = js.native
  def calculateDuration(prevTime: Double): Double = js.native
  def calculateDuration(prevTime: Double, nextTime: Double): Double = js.native
  def calculateMovingPosition[T /* <: E */](e: T): X = js.native
  def calculateMovingPosition[T /* <: E */](e: MouseEvent): X = js.native
  def calculateMovingPosition[T /* <: E */](e: TouchEvent): X = js.native
  def calculatePosition(prevPos: prevPosition, nextPos: nextPosition): Value = js.native
  def calculateVelocity(x: Double, y: Double, time: Double): Double = js.native
  def checkIsMoreThanSingleTouches(e: js.Any): Boolean = js.native
  def checkIsPassiveSupported(): Boolean = js.native
  def checkIsPassiveSupported(isPassiveSupported: Boolean): Boolean = js.native
  def createOptions(): js.Object = js.native
  def createOptions(proxy: js.Object): js.Object = js.native
  def getInitialProps(): Delta = js.native
  def getInitialProps(props: js.Object): Delta = js.native
  def getInitialState(): IsSwiping = js.native
  def getOptions(): Passive | PassiveUndefined = js.native
  def getOptions(isPassiveSupported: Boolean): Passive | PassiveUndefined = js.native
  def noop(): Unit = js.native
  def rotateByAngle(position: Y): typings.vanillaSwipe.rotateByAngleMod.Value = js.native
  def rotateByAngle(position: Y, angle: Double): typings.vanillaSwipe.rotateByAngleMod.Value = js.native
}

