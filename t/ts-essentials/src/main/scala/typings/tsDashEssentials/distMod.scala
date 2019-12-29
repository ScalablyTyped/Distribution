package typings.tsDashEssentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-essentials/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  @js.native
  class UnreachableCaseError protected ()
    extends typings.tsDashEssentials.distFunctionsMod.UnreachableCaseError {
    def this(value: scala.Nothing) = this()
  }
  
  def literal(): Null = js.native
  def literal(value: String): String = js.native
  def literal(value: Boolean): Boolean = js.native
  def literal(value: Double): Double = js.native
  @JSName("literal")
  def literal_Union(): js.UndefOr[scala.Nothing] = js.native
}

