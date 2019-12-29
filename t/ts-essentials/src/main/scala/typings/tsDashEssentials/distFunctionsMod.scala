package typings.tsDashEssentials

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-essentials/dist/functions", JSImport.Namespace)
@js.native
object distFunctionsMod extends js.Object {
  @js.native
  class UnreachableCaseError protected () extends Error {
    def this(value: scala.Nothing) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def literal(): Null = js.native
  def literal(value: String): String = js.native
  def literal(value: Boolean): Boolean = js.native
  def literal(value: Double): Double = js.native
  @JSName("literal")
  def literal_Union(): js.UndefOr[scala.Nothing] = js.native
}

