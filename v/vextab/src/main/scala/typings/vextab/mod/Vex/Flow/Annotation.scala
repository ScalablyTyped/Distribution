package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Annotation")
@js.native
open class Annotation protected ()
  extends typings.vexflow.mod.Flow.Annotation {
  def this(text: String) = this()
}
object Annotation {
  
  @JSImport("vextab", "Vex.Flow.Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.Annotation.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Annotation.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("vextab", "Vex.Flow.Annotation.Justify")
  @js.native
  object Justify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Annotation.Justify & Double] = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.Annotation.Justify.CENTER & Double = js.native
    
    /* 2 */ val CENTER_STEM: typings.vexflow.Vex.Flow.Annotation.Justify.CENTER_STEM & Double = js.native
    
    /* 1 */ val LEFT: typings.vexflow.Vex.Flow.Annotation.Justify.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typings.vexflow.Vex.Flow.Annotation.Justify.RIGHT & Double = js.native
  }
  
  @JSImport("vextab", "Vex.Flow.Annotation.VerticalJustify")
  @js.native
  object VerticalJustify extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Annotation.VerticalJustify & Double] = js.native
    
    /* 1 */ val BOTTOM: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.BOTTOM & Double = js.native
    
    /* 0 */ val CENTER: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER & Double = js.native
    
    /* 2 */ val CENTER_STEM: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.CENTER_STEM & Double = js.native
    
    /* 1 */ val TOP: typings.vexflow.Vex.Flow.Annotation.VerticalJustify.TOP & Double = js.native
  }
  
  /* static member */
  inline def format(annotations: js.Array[typings.vexflow.Vex.Flow.Annotation], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(annotations.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
