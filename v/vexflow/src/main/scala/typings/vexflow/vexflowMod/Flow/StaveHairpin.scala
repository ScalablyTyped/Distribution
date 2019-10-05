package typings.vexflow.vexflowMod.Flow

import typings.vexflow.Anon_Firstnote
import typings.vexflow.Anon_HeightLeftshiftticks
import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.Flow.StaveHairpin.`type`
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typings.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Anon_Firstnote, `type`: `type`) = this()
}

/* static members */
@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Anon_Firstnote,
    `type`: typings.vexflow.Vex.Flow.StaveHairpin.`type`,
    position: Position
  ): Unit = js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Anon_Firstnote,
    `type`: typings.vexflow.Vex.Flow.StaveHairpin.`type`,
    position: Position,
    options: Anon_HeightLeftshiftticks
  ): Unit = js.native
  type `type` = typings.vexflow.Vex.Flow.StaveHairpin.`type`
}

