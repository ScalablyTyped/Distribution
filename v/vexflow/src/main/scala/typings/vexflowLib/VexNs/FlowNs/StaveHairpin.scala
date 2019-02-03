package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
class StaveHairpin protected () extends js.Object {
  def this(notes: vexflowLib.Anon_Firstnote, `type`: vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`) = this()
  def draw(): scala.Boolean = js.native
  def renderHairpin(params: vexflowLib.Anon_Firstx): scala.Unit = js.native
  def setContext(context: vexflowLib.VexNs.IRenderContext): StaveHairpin = js.native
  def setNotes(notes: vexflowLib.Anon_Firstnote): StaveHairpin = js.native
  def setPosition(position: vexflowLib.VexNs.FlowNs.ModifierNs.Position): StaveHairpin = js.native
  def setRenderOptions(options: vexflowLib.Anon_HeightLeftshiftpx): StaveHairpin = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: vexflowLib.VexNs.IRenderContext,
    formatter: vexflowLib.VexNs.FlowNs.Formatter,
    notes: vexflowLib.Anon_Firstnote,
    `type`: vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`,
    position: vexflowLib.VexNs.FlowNs.ModifierNs.Position
  ): scala.Unit = js.native
  def FormatByTicksAndDraw(
    ctx: vexflowLib.VexNs.IRenderContext,
    formatter: vexflowLib.VexNs.FlowNs.Formatter,
    notes: vexflowLib.Anon_Firstnote,
    `type`: vexflowLib.VexNs.FlowNs.StaveHairpinNs.`type`,
    position: vexflowLib.VexNs.FlowNs.ModifierNs.Position,
    options: vexflowLib.Anon_HeightLeftshiftticks
  ): scala.Unit = js.native
}

