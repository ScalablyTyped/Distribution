package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Articulation")
@js.native
class Articulation protected ()
  extends typings.vexflow.Vex.Flow.Articulation {
  def this(`type`: String) = this()
}
/* static members */
@JSGlobal("Vex.Flow.Articulation")
@js.native
object Articulation extends js.Object {
  
  val CATEGORY: String = js.native
  
  var DEBUG: Boolean = js.native
  
  def format(articulations: js.Array[typings.vexflow.Vex.Flow.Articulation], state: Leftshift): Boolean = js.native
}
