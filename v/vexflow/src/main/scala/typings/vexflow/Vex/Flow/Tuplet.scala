package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tuplet extends js.Object {
  def attach(): Unit
  def detach(): Unit
  def draw(): Unit
  def getBeatsOccupied(): Double
  def getNoteCount(): Double
  def getNotes(): js.Array[StaveNote]
  def resolveGlyphs(): Unit
  def setBeatsOccupied(beats: Double): Unit
  def setBracketed(bracketed: Boolean): Tuplet
  def setContext(context: IRenderContext): Tuplet
  def setRatioed(ratioed: Boolean): Tuplet
  def setTupletLocation(location: Double): Tuplet
}

object Tuplet {
  @scala.inline
  def apply(
    attach: () => Unit,
    detach: () => Unit,
    draw: () => Unit,
    getBeatsOccupied: () => Double,
    getNoteCount: () => Double,
    getNotes: () => js.Array[StaveNote],
    resolveGlyphs: () => Unit,
    setBeatsOccupied: Double => Unit,
    setBracketed: Boolean => Tuplet,
    setContext: IRenderContext => Tuplet,
    setRatioed: Boolean => Tuplet,
    setTupletLocation: Double => Tuplet
  ): Tuplet = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), detach = js.Any.fromFunction0(detach), draw = js.Any.fromFunction0(draw), getBeatsOccupied = js.Any.fromFunction0(getBeatsOccupied), getNoteCount = js.Any.fromFunction0(getNoteCount), getNotes = js.Any.fromFunction0(getNotes), resolveGlyphs = js.Any.fromFunction0(resolveGlyphs), setBeatsOccupied = js.Any.fromFunction1(setBeatsOccupied), setBracketed = js.Any.fromFunction1(setBracketed), setContext = js.Any.fromFunction1(setContext), setRatioed = js.Any.fromFunction1(setRatioed), setTupletLocation = js.Any.fromFunction1(setTupletLocation))
    __obj.asInstanceOf[Tuplet]
  }
}

