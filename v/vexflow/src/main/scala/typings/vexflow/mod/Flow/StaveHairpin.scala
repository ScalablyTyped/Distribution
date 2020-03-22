package typings.vexflow.mod.Flow

import typings.vexflow.AnonFirstnote
import typings.vexflow.AnonLeftshiftticks
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
  def this(notes: AnonFirstnote, `type`: `type`) = this()
}

/* static members */
@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
object StaveHairpin extends js.Object {
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: AnonFirstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: AnonFirstnote,
    `type`: `type`,
    position: Position,
    options: AnonLeftshiftticks
  ): Unit = js.native
}

