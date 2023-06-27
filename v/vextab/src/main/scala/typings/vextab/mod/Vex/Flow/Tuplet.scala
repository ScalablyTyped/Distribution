package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Bracketed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Tuplet")
@js.native
open class Tuplet protected ()
  extends typings.vexflow.mod.Flow.Tuplet {
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote]) = this()
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], options: Bracketed) = this()
}
object Tuplet {
  
  @JSImport("vextab", "Vex.Flow.Tuplet.LOCATION_BOTTOM")
  @js.native
  val LOCATION_BOTTOM: Double = js.native
  
  @JSImport("vextab", "Vex.Flow.Tuplet.LOCATION_TOP")
  @js.native
  val LOCATION_TOP: Double = js.native
}
