package typings
package typescriptDashOptionalLib.typescriptDashOptionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-optional", "Optional")
@js.native
abstract class Optional[T] ()
  extends typescriptDashOptionalLib.distOptionalMod.Optional[T]

@JSImport("typescript-optional", "Optional")
@js.native
object Optional extends js.Object {
  def empty[T](): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def from[T](option: typescriptDashOptionalLib.distTypesMod.Option[T]): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def of[T](value: T): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def ofNonNull[T](value: T): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def ofNullable[T](): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
  def ofNullable[T](nullable: T): typescriptDashOptionalLib.distOptionalMod.Optional[T] = js.native
}

