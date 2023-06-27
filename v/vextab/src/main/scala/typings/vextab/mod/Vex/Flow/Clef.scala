package typings.vextab.mod.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Clef")
@js.native
open class Clef protected ()
  extends typings.vexflow.mod.Flow.Clef {
  def this(clef: String) = this()
  def this(clef: String, size: String) = this()
  def this(clef: String, size: String, annotation: String) = this()
  def this(clef: String, size: Unit, annotation: String) = this()
}
object Clef {
  
  @JSImport("vextab", "Vex.Flow.Clef")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("vextab", "Vex.Flow.Clef.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
}
