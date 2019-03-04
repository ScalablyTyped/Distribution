package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Array that is only intended to be pushed to, never read. */
trait Push[T] extends js.Object {
  def push(values: T*): scala.Unit
}

object Push {
  @scala.inline
  def apply[T](push: js.Function1[/* repeated */ T, scala.Unit]): Push[T] = {
    val __obj = js.Dynamic.literal(push = push)
  
    __obj.asInstanceOf[Push[T]]
  }
}

