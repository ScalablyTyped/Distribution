package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.Flow.StaveHairpin.`type`
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Firstnote
import typings.vexflow.anon.Firstx
import typings.vexflow.anon.Height
import typings.vexflow.anon.Leftshiftpx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typings.vexflow.Vex.Flow.StaveHairpin {
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

/* static members */
@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position,
    options: Height
  ): Unit = js.native
  @js.native
  object `type` extends js.Object {
    /* 1 */ val CRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.CRESC with Double = js.native
    /* 0 */ val DECRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.DECRESC with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveHairpin.`type` with Double] = js.native
  }
  
}

