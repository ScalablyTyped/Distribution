package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done[T] extends js.Object {
  var done: typescriptLib.typescriptLibNumbers.`false`
  var value: T
}

object Anon_Done {
  @scala.inline
  def apply[T](done: typescriptLib.typescriptLibNumbers.`false`, value: T): Anon_Done[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Done[T]]
  }
}

