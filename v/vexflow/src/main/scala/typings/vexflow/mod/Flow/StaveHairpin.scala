package typings.vexflow.mod.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.Flow.StaveHairpin.`type`
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Firstnote
import typings.vexflow.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveHairpin")
@js.native
class StaveHairpin protected ()
  extends typings.vexflow.Vex.Flow.StaveHairpin {
  def this(notes: Firstnote, `type`: typings.vexflow.Vex.Flow.StaveHairpin.`type`) = this()
}
object StaveHairpin {
  
  /* static member */
  @JSImport("vexflow", "Flow.StaveHairpin.FormatByTicksAndDraw")
  @js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position
  ): Unit = js.native
  @JSImport("vexflow", "Flow.StaveHairpin.FormatByTicksAndDraw")
  @js.native
  def FormatByTicksAndDraw(
    ctx: IRenderContext,
    formatter: typings.vexflow.Vex.Flow.Formatter,
    notes: Firstnote,
    `type`: `type`,
    position: Position,
    options: Height
  ): Unit = js.native
  
  @JSImport("vexflow", "Flow.StaveHairpin.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveHairpin.`type` with Double] = js.native
    
    /* 1 */ val CRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.CRESC with Double = js.native
    
    /* 0 */ val DECRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.DECRESC with Double = js.native
  }
}
