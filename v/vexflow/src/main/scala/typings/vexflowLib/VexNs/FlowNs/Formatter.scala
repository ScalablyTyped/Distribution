package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Formatter")
@js.native
class Formatter () extends js.Object {
  def alignRests(voices: js.Array[Voice], align_all_notes: scala.Boolean): scala.Unit = js.native
  def createModifierContexts(voices: js.Array[Voice]): js.Array[ModifierContext] = js.native
  def createTickContexts(voices: js.Array[Voice]): js.Array[TickContext] = js.native
  def format(voices: js.Array[Voice], justifyWidth: scala.Double): Formatter = js.native
  def format(voices: js.Array[Voice], justifyWidth: scala.Double, options: vexflowLib.Anon_AlignrestsContext): Formatter = js.native
  def formatToStave(voices: js.Array[Voice], stave: Stave): Formatter = js.native
  def formatToStave(voices: js.Array[Voice], stave: Stave, options: vexflowLib.Anon_AlignrestsContext): Formatter = js.native
  def getMinTotalWidth(): scala.Double = js.native
  def joinVoices(voices: js.Array[Voice]): Formatter = js.native
  def postFormat(): Formatter = js.native
  def preCalculateMinTotalWidth(voices: js.Array[Voice]): scala.Double = js.native
  def preFormat(): scala.Unit = js.native
  def preFormat(justifyWidth: scala.Double): scala.Unit = js.native
  def preFormat(justifyWidth: scala.Double, rendering_context: vexflowLib.VexNs.IRenderContext): scala.Unit = js.native
  def preFormat(
    justifyWidth: scala.Double,
    rendering_context: vexflowLib.VexNs.IRenderContext,
    voices: js.Array[Voice]
  ): scala.Unit = js.native
  def preFormat(
    justifyWidth: scala.Double,
    rendering_context: vexflowLib.VexNs.IRenderContext,
    voices: js.Array[Voice],
    stave: Stave
  ): scala.Unit = js.native
}

@JSGlobal("Vex.Flow.Formatter")
@js.native
object Formatter extends js.Object {
  var DEBUG: scala.Boolean = js.native
  def AlignRestsToNotes(notes: js.Array[vexflowLib.VexNs.FlowNs.Note]): vexflowLib.VexNs.FlowNs.Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[vexflowLib.VexNs.FlowNs.Note], align_all_notes: scala.Boolean): vexflowLib.VexNs.FlowNs.Formatter = js.native
  def AlignRestsToNotes(
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
    align_all_notes: scala.Boolean,
    align_tuplets: scala.Boolean
  ): vexflowLib.VexNs.FlowNs.Formatter = js.native
  def FormatAndDraw(
    ctx: vexflowLib.VexNs.IRenderContext,
    stave: vexflowLib.VexNs.FlowNs.Stave,
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note]
  ): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
  def FormatAndDraw(
    ctx: vexflowLib.VexNs.IRenderContext,
    stave: vexflowLib.VexNs.FlowNs.Stave,
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
    params: scala.Boolean
  ): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
  def FormatAndDraw(
    ctx: vexflowLib.VexNs.IRenderContext,
    stave: vexflowLib.VexNs.FlowNs.Stave,
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
    params: vexflowLib.Anon_Alignrests
  ): vexflowLib.VexNs.FlowNs.BoundingBox = js.native
  def FormatAndDrawTab(
    ctx: vexflowLib.VexNs.IRenderContext,
    tabstave: vexflowLib.VexNs.FlowNs.TabStave,
    stave: vexflowLib.VexNs.FlowNs.Stave,
    tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note]
  ): scala.Unit = js.native
  def FormatAndDrawTab(
    ctx: vexflowLib.VexNs.IRenderContext,
    tabstave: vexflowLib.VexNs.FlowNs.TabStave,
    stave: vexflowLib.VexNs.FlowNs.Stave,
    tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
    autobeam: scala.Boolean
  ): scala.Unit = js.native
  def FormatAndDrawTab(
    ctx: vexflowLib.VexNs.IRenderContext,
    tabstave: vexflowLib.VexNs.FlowNs.TabStave,
    stave: vexflowLib.VexNs.FlowNs.Stave,
    tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
    autobeam: scala.Boolean,
    params: scala.Boolean
  ): scala.Unit = js.native
  def FormatAndDrawTab(
    ctx: vexflowLib.VexNs.IRenderContext,
    tabstave: vexflowLib.VexNs.FlowNs.TabStave,
    stave: vexflowLib.VexNs.FlowNs.Stave,
    tabnotes: js.Array[vexflowLib.VexNs.FlowNs.TabNote],
    notes: js.Array[vexflowLib.VexNs.FlowNs.Note],
    autobeam: scala.Boolean,
    params: vexflowLib.Anon_Alignrests
  ): scala.Unit = js.native
}

