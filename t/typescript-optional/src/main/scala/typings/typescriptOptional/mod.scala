package typings.typescriptOptional

import typings.typescriptOptional.typesMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-optional", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class Optional[T] ()
    extends typings.typescriptOptional.optionalMod.Optional[T]
  
  /* static members */
  @js.native
  object Optional extends js.Object {
    def empty[T](): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    def from[T](option: Option[T]): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    def of[T](value: T): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    def ofNonNull[T](value: T): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    def ofNullable[T](): typings.typescriptOptional.optionalMod.Optional[T] = js.native
    def ofNullable[T](nullable: T): typings.typescriptOptional.optionalMod.Optional[T] = js.native
  }
  
}

