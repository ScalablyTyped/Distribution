package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Tuplet")
@js.native
class Tuplet protected () extends js.Object {
  def this(notes: js.Array[StaveNote]) = this()
  def this(notes: js.Array[StaveNote], options: vexflowLib.Anon_Numnotes) = this()
  def attach(): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def draw(): scala.Unit = js.native
  def getBeatsOccupied(): scala.Double = js.native
  def getNoteCount(): scala.Double = js.native
  def getNotes(): js.Array[StaveNote] = js.native
  def resolveGlyphs(): scala.Unit = js.native
  def setBeatsOccupied(beats: scala.Double): scala.Unit = js.native
  def setBracketed(bracketed: scala.Boolean): Tuplet = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): Tuplet = js.native
  def setRatioed(ratioed: scala.Boolean): Tuplet = js.native
  def setTupletLocation(location: scala.Double): Tuplet = js.native
}

