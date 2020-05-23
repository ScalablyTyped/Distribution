package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Bpm
import typings.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaveTempo extends StaveModifier {
  def draw(stave: Stave, shift_x: Double): StaveTempo
  def setShiftX(x: Double): StaveTempo
  def setShiftY(y: Double): StaveTempo
  def setTempo(tempo: Bpm): StaveTempo
}

object StaveTempo {
  @scala.inline
  def apply(
    addEndModifier: () => Unit,
    addModifier: () => Unit,
    addToStave: (Stave, Boolean) => StaveModifier,
    addToStaveEnd: (Stave, Boolean) => StaveModifier,
    draw: (Stave, Double) => StaveTempo,
    getCategory: () => String,
    getPadding: Double => Double,
    getPosition: () => Double,
    getWidth: () => Double,
    makeSpacer: Double => GetContext,
    placeGlyphOnLine: (Glyph, Stave, Double) => Unit,
    setPadding: Double => Unit,
    setShiftX: Double => StaveTempo,
    setShiftY: Double => StaveTempo,
    setTempo: Bpm => StaveTempo
  ): StaveTempo = {
    val __obj = js.Dynamic.literal(addEndModifier = js.Any.fromFunction0(addEndModifier), addModifier = js.Any.fromFunction0(addModifier), addToStave = js.Any.fromFunction2(addToStave), addToStaveEnd = js.Any.fromFunction2(addToStaveEnd), draw = js.Any.fromFunction2(draw), getCategory = js.Any.fromFunction0(getCategory), getPadding = js.Any.fromFunction1(getPadding), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), makeSpacer = js.Any.fromFunction1(makeSpacer), placeGlyphOnLine = js.Any.fromFunction3(placeGlyphOnLine), setPadding = js.Any.fromFunction1(setPadding), setShiftX = js.Any.fromFunction1(setShiftX), setShiftY = js.Any.fromFunction1(setShiftY), setTempo = js.Any.fromFunction1(setTempo))
    __obj.asInstanceOf[StaveTempo]
  }
}

