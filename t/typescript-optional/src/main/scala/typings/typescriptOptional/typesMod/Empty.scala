package typings.typescriptOptional.typesMod

import typings.typescriptOptional.typescriptOptionalStrings.empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Empty[T] extends Option[T] {
  var kind: empty
}

object Empty {
  @scala.inline
  def apply[T](kind: empty): Empty[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Empty[T]]
  }
}

