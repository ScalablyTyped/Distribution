package typings.vexflow.mod.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Alignrests
import typings.vexflow.anon.MaxIterations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Formatter")
@js.native
class Formatter ()
  extends typings.vexflow.Vex.Flow.Formatter {
  def this(options: MaxIterations) = this()
}
/* static members */
@JSImport("vexflow", "Flow.Formatter")
@js.native
object Formatter extends js.Object {
  
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    align_all_notes: js.UndefOr[scala.Nothing],
    align_tuplets: Boolean
  ): typings.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note], align_all_notes: Boolean): typings.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note], align_all_notes: Boolean, align_tuplets: Boolean): typings.vexflow.Vex.Flow.Formatter = js.native
  
  var DEBUG: Boolean = js.native
  
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
    params: Alignrests
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
    autobeam: js.UndefOr[scala.Nothing],
    params: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: js.UndefOr[scala.Nothing],
    params: Alignrests
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
    params: Alignrests
  ): Unit = js.native
}
