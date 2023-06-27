package typings.vextab.mod.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.Flow.StaveHairpin.`type`
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Firstnote
import typings.vexflow.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.StaveHairpin")
@js.native
open class StaveHairpin protected ()
  extends typings.vexflow.mod.Flow.StaveHairpin {
  def this(notes: Firstnote, `type`: typings.vexflow.Vex.Flow.StaveHairpin.`type`) = this()
}
object StaveHairpin {
  
  @JSImport("vextab", "Vex.Flow.StaveHairpin")
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
  
  @JSImport("vextab", "Vex.Flow.StaveHairpin.type")
  @js.native
  object `type` extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.StaveHairpin.`type` & Double] = js.native
    
    /* 1 */ val CRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.CRESC & Double = js.native
    
    /* 0 */ val DECRESC: typings.vexflow.Vex.Flow.StaveHairpin.`type`.DECRESC & Double = js.native
  }
}
