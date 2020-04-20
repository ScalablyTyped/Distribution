package typings.typescriptOptional.typesMod

import typings.typescriptOptional.typescriptOptionalStrings.empty
import typings.typescriptOptional.typescriptOptionalStrings.present
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescriptOptional.typesMod.Present[T]
  - typings.typescriptOptional.typesMod.Empty[T]
*/
trait Option[T] extends js.Object

object Option {
  @scala.inline
  def Present[T](kind: present, value: T): Option[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[T]]
  }
  @scala.inline
  def Empty[T](kind: empty): Option[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[T]]
  }
}

