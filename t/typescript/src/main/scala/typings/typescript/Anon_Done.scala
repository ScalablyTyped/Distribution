package typings.typescript

import typings.typescript.typescriptNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done[T] extends js.Object {
  var done: `false`
  var value: T
}

object Anon_Done {
  @scala.inline
  def apply[T](done: `false`, value: T): Anon_Done[T] = {
    val __obj = js.Dynamic.literal(done = done, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Done[T]]
  }
}

