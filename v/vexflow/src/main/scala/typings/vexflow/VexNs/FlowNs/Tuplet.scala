package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Bracketed
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Tuplet")
@js.native
class Tuplet protected () extends js.Object {
  def this(notes: js.Array[StaveNote]) = this()
  def this(notes: js.Array[StaveNote], options: Anon_Bracketed) = this()
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

