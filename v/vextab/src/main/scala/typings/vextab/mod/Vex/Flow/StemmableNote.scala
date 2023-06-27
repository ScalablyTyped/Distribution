package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.StemmableNote")
@js.native
open class StemmableNote protected ()
  extends typings.vexflow.mod.Flow.StemmableNote {
  def this(note_struct: Type) = this()
}
object StemmableNote {
  
  @JSImport("vextab", "Vex.Flow.StemmableNote")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.StemmableNote.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
}
