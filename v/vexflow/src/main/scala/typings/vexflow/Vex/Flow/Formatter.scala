package typings.vexflow.Vex.Flow

import typings.vexflow.AnonAlignrests
import typings.vexflow.AnonAlignrestsContext
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Formatter")
@js.native
class Formatter () extends js.Object {
  def alignRests(voices: js.Array[Voice], align_all_notes: Boolean): Unit = js.native
  def createModifierContexts(voices: js.Array[Voice]): js.Array[ModifierContext] = js.native
  def createTickContexts(voices: js.Array[Voice]): js.Array[TickContext] = js.native
  def format(voices: js.Array[Voice], justifyWidth: Double): Formatter = js.native
  def format(voices: js.Array[Voice], justifyWidth: Double, options: AnonAlignrestsContext): Formatter = js.native
  def formatToStave(voices: js.Array[Voice], stave: Stave): Formatter = js.native
  def formatToStave(voices: js.Array[Voice], stave: Stave, options: AnonAlignrestsContext): Formatter = js.native
  def getMinTotalWidth(): Double = js.native
  def joinVoices(voices: js.Array[Voice]): Formatter = js.native
  def postFormat(): Formatter = js.native
  def preCalculateMinTotalWidth(voices: js.Array[Voice]): Double = js.native
  def preFormat(): Unit = js.native
  def preFormat(justifyWidth: Double): Unit = js.native
  def preFormat(justifyWidth: Double, rendering_context: IRenderContext): Unit = js.native
  def preFormat(justifyWidth: Double, rendering_context: IRenderContext, voices: js.Array[Voice]): Unit = js.native
  def preFormat(justifyWidth: Double, rendering_context: IRenderContext, voices: js.Array[Voice], stave: Stave): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Formatter")
@js.native
object Formatter extends js.Object {
  var DEBUG: Boolean = js.native
  def AlignRestsToNotes(notes: js.Array[Note]): Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[Note], align_all_notes: Boolean): Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[Note], align_all_notes: Boolean, align_tuplets: Boolean): Formatter = js.native
  def FormatAndDraw(ctx: IRenderContext, stave: Stave, notes: js.Array[Note]): BoundingBox = js.native
  def FormatAndDraw(ctx: IRenderContext, stave: Stave, notes: js.Array[Note], params: Boolean): BoundingBox = js.native
  def FormatAndDraw(ctx: IRenderContext, stave: Stave, notes: js.Array[Note], params: AnonAlignrests): BoundingBox = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: TabStave,
    stave: Stave,
    tabnotes: js.Array[TabNote],
    notes: js.Array[Note]
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: TabStave,
    stave: Stave,
    tabnotes: js.Array[TabNote],
    notes: js.Array[Note],
    autobeam: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: TabStave,
    stave: Stave,
    tabnotes: js.Array[TabNote],
    notes: js.Array[Note],
    autobeam: Boolean,
    params: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: TabStave,
    stave: Stave,
    tabnotes: js.Array[TabNote],
    notes: js.Array[Note],
    autobeam: Boolean,
    params: AnonAlignrests
  ): Unit = js.native
}

