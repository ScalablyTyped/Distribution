package typings.vexflow.vexflowMod.Flow

import typings.vexflow.Anon_Alignrests
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Formatter")
@js.native
class Formatter ()
  extends typings.vexflow.Vex.Flow.Formatter

/* static members */
@JSImport("vexflow", "Flow.Formatter")
@js.native
object Formatter extends js.Object {
  var DEBUG: Boolean = js.native
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note], align_all_notes: Boolean): typings.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note], align_all_notes: Boolean, align_tuplets: Boolean): typings.vexflow.Vex.Flow.Formatter = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typings.vexflow.Vex.Flow.Stave,
    notes: js.Array[typings.vexflow.Vex.Flow.Note]
  ): typings.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typings.vexflow.Vex.Flow.Stave,
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    params: Boolean
  ): typings.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typings.vexflow.Vex.Flow.Stave,
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    params: Anon_Alignrests
  ): typings.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note]
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Anon_Alignrests
  ): Unit = js.native
}

