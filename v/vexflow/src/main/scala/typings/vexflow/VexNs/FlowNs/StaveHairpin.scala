package typings.vexflow.VexNs.FlowNs

import typings.vexflow.Anon_Firstnote
import typings.vexflow.Anon_Firstx
import typings.vexflow.Anon_HeightLeftshiftpx
import typings.vexflow.Anon_HeightLeftshiftticks
import typings.vexflow.VexNs.FlowNs.ModifierNs.Position
import typings.vexflow.VexNs.FlowNs.StaveHairpinNs.`type`
import typings.vexflow.VexNs.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
class StaveHairpin protected () extends js.Object {
  def this(notes: Anon_Firstnote, `type`: `type`) = this()
  def draw(): Boolean = js.native
  def renderHairpin(params: Anon_Firstx): Unit = js.native
  def setContext(context: IRenderContext): StaveHairpin = js.native
  def setNotes(notes: Anon_Firstnote): StaveHairpin = js.native
  def setPosition(position: Position): StaveHairpin = js.native
  def setRenderOptions(options: Anon_HeightLeftshiftpx): StaveHairpin = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: Formatter,
    notes: Anon_Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: Formatter,
    notes: Anon_Firstnote,
    `type`: `type`,
    position: Position,
    options: Anon_HeightLeftshiftticks
  ): Unit = js.native
}

