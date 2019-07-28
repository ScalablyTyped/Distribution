package typings.typescriptDashOptional.typescriptDashOptionalMod

import typings.typescriptDashOptional.distTypesMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-optional", "Optional")
@js.native
abstract class Optional[T] ()
  extends typings.typescriptDashOptional.distOptionalMod.Optional[T]

/* static members */
@JSImport("typescript-optional", "Optional")
@js.native
object Optional extends js.Object {
  def empty[T](): typings.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
  def from[T](option: Option[T]): typings.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
  def of[T](value: T): typings.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
  def ofNonNull[T](value: T): typings.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
  def ofNullable[T](): typings.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
  def ofNullable[T](nullable: T): typings.typescriptDashOptional.distOptionalMod.Optional[T] = js.native
}

