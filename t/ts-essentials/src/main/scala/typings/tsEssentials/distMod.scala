package typings.tsEssentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-essentials/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  @js.native
  class UnreachableCaseError protected ()
    extends typings.tsEssentials.functionsMod.UnreachableCaseError {
    def this(value: scala.Nothing) = this()
  }
  
  def literal(value: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
  def literal(value: String): String = js.native
  def literal(value: Boolean): Boolean = js.native
  def literal(value: Double): Double = js.native
  def literal(value: Null): Null = js.native
}

