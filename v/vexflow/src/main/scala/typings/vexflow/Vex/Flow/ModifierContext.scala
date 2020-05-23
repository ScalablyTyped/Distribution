package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Extraleftpx
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierContext extends js.Object {
  def addModifier(modifier: Modifier): ModifierContext
  def getExtraLeftPx(): Double
  def getExtraRightPx(): Double
  def getMetrics(): Extraleftpx
  def getModifiers(`type`: String): js.Array[Modifier]
  def getState(): Leftshift
  def getWidth(): Double
  def postFormat(): Unit
  def preFormat(): Unit
}

object ModifierContext {
  @scala.inline
  def apply(
    addModifier: Modifier => ModifierContext,
    getExtraLeftPx: () => Double,
    getExtraRightPx: () => Double,
    getMetrics: () => Extraleftpx,
    getModifiers: String => js.Array[Modifier],
    getState: () => Leftshift,
    getWidth: () => Double,
    postFormat: () => Unit,
    preFormat: () => Unit
  ): ModifierContext = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), getExtraLeftPx = js.Any.fromFunction0(getExtraLeftPx), getExtraRightPx = js.Any.fromFunction0(getExtraRightPx), getMetrics = js.Any.fromFunction0(getMetrics), getModifiers = js.Any.fromFunction1(getModifiers), getState = js.Any.fromFunction0(getState), getWidth = js.Any.fromFunction0(getWidth), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat))
    __obj.asInstanceOf[ModifierContext]
  }
}

