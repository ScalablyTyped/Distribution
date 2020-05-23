package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.End
import typings.vexflow.anon.FillStyle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beam extends js.Object {
  def applyStemExtensions(): Unit
  def breakSecondaryAt(indices: js.Array[Double]): Beam
  def calculateSlope(): Unit
  def calculateStemDirection(notes: Note): Double
  def draw(): Boolean
  def drawBeamLines(): Unit
  def drawStems(): Unit
  def getBeamCount(): Double
  def getBeamLines(duration: String): js.Array[End]
  def getNotes(): js.Array[StemmableNote]
  def getSlopeY(): Double
  def postFormat(): Beam
  def preFormat(): Beam
  def setContext(context: IRenderContext): Beam
  def setStyle(style: FillStyle_): Beam
}

object Beam {
  @scala.inline
  def apply(
    applyStemExtensions: () => Unit,
    breakSecondaryAt: js.Array[Double] => Beam,
    calculateSlope: () => Unit,
    calculateStemDirection: Note => Double,
    draw: () => Boolean,
    drawBeamLines: () => Unit,
    drawStems: () => Unit,
    getBeamCount: () => Double,
    getBeamLines: String => js.Array[End],
    getNotes: () => js.Array[StemmableNote],
    getSlopeY: () => Double,
    postFormat: () => Beam,
    preFormat: () => Beam,
    setContext: IRenderContext => Beam,
    setStyle: FillStyle_ => Beam
  ): Beam = {
    val __obj = js.Dynamic.literal(applyStemExtensions = js.Any.fromFunction0(applyStemExtensions), breakSecondaryAt = js.Any.fromFunction1(breakSecondaryAt), calculateSlope = js.Any.fromFunction0(calculateSlope), calculateStemDirection = js.Any.fromFunction1(calculateStemDirection), draw = js.Any.fromFunction0(draw), drawBeamLines = js.Any.fromFunction0(drawBeamLines), drawStems = js.Any.fromFunction0(drawStems), getBeamCount = js.Any.fromFunction0(getBeamCount), getBeamLines = js.Any.fromFunction1(getBeamLines), getNotes = js.Any.fromFunction0(getNotes), getSlopeY = js.Any.fromFunction0(getSlopeY), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat), setContext = js.Any.fromFunction1(setContext), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[Beam]
  }
}

