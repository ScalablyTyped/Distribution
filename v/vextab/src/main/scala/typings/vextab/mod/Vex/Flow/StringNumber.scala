package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.StringNumber")
@js.native
open class StringNumber protected ()
  extends typings.vexflow.mod.Flow.StringNumber {
  def this(number: String) = this()
  // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
  // like it is a string. But from the use of it it might be a number ?!
  def this(number: Double) = this()
}
object StringNumber {
  
  @JSImport("vextab", "Vex.Flow.StringNumber")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vextab", "Vex.Flow.StringNumber.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  inline def format(nums: js.Array[typings.vexflow.Vex.Flow.StringNumber], state: Leftshift): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(nums.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
