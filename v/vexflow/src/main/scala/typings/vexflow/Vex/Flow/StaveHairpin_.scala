package typings.vexflow.Vex.Flow

import typings.vexflow.AnonFirstnote
import typings.vexflow.AnonFirstx
import typings.vexflow.AnonLeftshiftpx
import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.Flow.StaveHairpin.`type`
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveHairpin")
@js.native
class StaveHairpin_ protected () extends js.Object {
  def this(notes: AnonFirstnote, `type`: `type`) = this()
  def draw(): Boolean = js.native
  def renderHairpin(params: AnonFirstx): Unit = js.native
  def setContext(context: IRenderContext): StaveHairpin = js.native
  def setNotes(notes: AnonFirstnote): StaveHairpin = js.native
  def setPosition(position: Position): StaveHairpin = js.native
  def setRenderOptions(options: AnonLeftshiftpx): StaveHairpin = js.native
}

