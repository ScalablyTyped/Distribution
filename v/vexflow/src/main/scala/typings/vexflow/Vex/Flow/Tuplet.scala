package typings.vexflow.Vex.Flow

import typings.vexflow.AnonBracketed
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Tuplet")
@js.native
class Tuplet protected () extends js.Object {
  def this(notes: js.Array[StaveNote]) = this()
  def this(notes: js.Array[StaveNote], options: AnonBracketed) = this()
  def attach(): Unit = js.native
  def detach(): Unit = js.native
  def draw(): Unit = js.native
  def getBeatsOccupied(): Double = js.native
  def getNoteCount(): Double = js.native
  def getNotes(): js.Array[StaveNote] = js.native
  def resolveGlyphs(): Unit = js.native
  def setBeatsOccupied(beats: Double): Unit = js.native
  def setBracketed(bracketed: Boolean): Tuplet = js.native
  def setContext(context: IRenderContext): Tuplet = js.native
  def setRatioed(ratioed: Boolean): Tuplet = js.native
  def setTupletLocation(location: Double): Tuplet = js.native
}

@JSGlobal("Vex.Flow.Tuplet")
@js.native
object Tuplet extends js.Object {
  val LOCATION_BOTTOM: Double = js.native
  val LOCATION_TOP: Double = js.native
}

