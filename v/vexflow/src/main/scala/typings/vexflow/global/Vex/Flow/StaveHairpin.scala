package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.Flow.StaveHairpin.`type`
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Firstnote
import typings.vexflow.anon.Firstx
import typings.vexflow.anon.Height
import typings.vexflow.anon.Leftshiftpx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Firstnote, `type`: typings.vexflow.Vex.Flow.StaveHairpin.`type`) = this()
  
  /* CompleteClass */
  override def draw(): Boolean = js.native
  
  /* CompleteClass */
  override def renderHairpin(params: Firstx): Unit = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.StaveHairpin = js.native
  
  /* CompleteClass */
  override def setNotes(notes: Firstnote): typings.vexflow.Vex.Flow.StaveHairpin = js.native
  
  /* CompleteClass */
  override def setPosition(position: Position): typings.vexflow.Vex.Flow.StaveHairpin = js.native
  
  /* CompleteClass */
  override def setRenderOptions(options: Leftshiftpx): typings.vexflow.Vex.Flow.StaveHairpin = js.native
}
object StaveHairpin {
  
  @JSGlobal("Vex.Flow.StaveHairpin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatByTicksAndDraw")(ctx.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position,
    options: Height
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatByTicksAndDraw")(ctx.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any], notes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], position.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("Vex.Flow.StaveHairpin.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveHairpin.`type` & Double] = js.native
    
    /* 1 */ val CRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.CRESC & Double = js.native
    
    /* 0 */ val DECRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.DECRESC & Double = js.native
  }
}
