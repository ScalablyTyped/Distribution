package typings.vextab.mod.Vex.Flow

import typings.vexflow.Vex.Flow.Stroke.Type
import typings.vexflow.anon.Allvoices
import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Stroke")
@js.native
open class Stroke protected ()
  extends typings.vexflow.mod.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Allvoices) = this()
}
object Stroke {
  
  @JSImport("vextab", "Vex.Flow.Stroke")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Stroke.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  @JSImport("vextab", "Vex.Flow.Stroke.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Stroke.Type & Double] = js.native
    
    /* 5 */ val ARPEGGIO_DIRECTIONLESS: typings.vexflow.Vex.Flow.Stroke.Type.ARPEGGIO_DIRECTIONLESS & Double = js.native
    
    /* 1 */ val BRUSH_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.BRUSH_DOWN & Double = js.native
    
    /* 0 */ val BRUSH_UP: typings.vexflow.Vex.Flow.Stroke.Type.BRUSH_UP & Double = js.native
    
    /* 3 */ val RASQUEDO_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_DOWN & Double = js.native
    
    /* 4 */ val RASQUEDO_UP: typings.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_UP & Double = js.native
    
    /* 1 */ val ROLL_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.ROLL_DOWN & Double = js.native
    
    /* 2 */ val ROLL_UP: typings.vexflow.Vex.Flow.Stroke.Type.ROLL_UP & Double = js.native
  }
  
  /* static member */
  inline def format(strokes: js.Array[typings.vexflow.Vex.Flow.Stroke], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(strokes.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
