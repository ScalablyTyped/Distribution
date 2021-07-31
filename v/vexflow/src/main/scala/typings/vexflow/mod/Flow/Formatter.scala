package typings.vexflow.mod.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Alignrests
import typings.vexflow.anon.MaxIterations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Formatter")
@js.native
class Formatter ()
  extends StObject
     with typings.vexflow.Vex.Flow.Formatter {
  def this(options: MaxIterations) = this()
}
object Formatter {
  
  @JSImport("vexflow", "Flow.Formatter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note]): typings.vexflow.Vex.Flow.Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any]).asInstanceOf[typings.vexflow.Vex.Flow.Formatter]
  @scala.inline
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note], align_all_notes: Boolean): typings.vexflow.Vex.Flow.Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any], align_all_notes.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Formatter]
  @scala.inline
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note], align_all_notes: Boolean, align_tuplets: Boolean): typings.vexflow.Vex.Flow.Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any], align_all_notes.asInstanceOf[js.Any], align_tuplets.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Formatter]
  @scala.inline
  def AlignRestsToNotes(notes: js.Array[typings.vexflow.Vex.Flow.Note], align_all_notes: Unit, align_tuplets: Boolean): typings.vexflow.Vex.Flow.Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("AlignRestsToNotes")(notes.asInstanceOf[js.Any], align_all_notes.asInstanceOf[js.Any], align_tuplets.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.Formatter]
  
  /* static member */
  @JSImport("vexflow", "Flow.Formatter.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typings.vexflow.Vex.Flow.Stave,
    notes: js.Array[typings.vexflow.Vex.Flow.Note]
  ): typings.vexflow.Vex.Flow.BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDraw")(ctx.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], notes.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.BoundingBox]
  @scala.inline
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typings.vexflow.Vex.Flow.Stave,
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    params: Boolean
  ): typings.vexflow.Vex.Flow.BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDraw")(ctx.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.BoundingBox]
  @scala.inline
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typings.vexflow.Vex.Flow.Stave,
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    params: Alignrests
  ): typings.vexflow.Vex.Flow.BoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDraw")(ctx.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.vexflow.Vex.Flow.BoundingBox]
  
  /* static member */
  @scala.inline
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Alignrests
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Unit,
    params: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typings.vexflow.Vex.Flow.TabStave,
    stave: typings.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typings.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typings.vexflow.Vex.Flow.Note],
    autobeam: Unit,
    params: Alignrests
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatAndDrawTab")(ctx.asInstanceOf[js.Any], tabstave.asInstanceOf[js.Any], stave.asInstanceOf[js.Any], tabnotes.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], autobeam.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
