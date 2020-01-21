package typings.yar.mod

import typings.catbox.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerYar extends js.Object {
  def revoke(id: Id): js.Promise[Unit]
}

object ServerYar {
  @scala.inline
  def apply(revoke: Id => js.Promise[Unit]): ServerYar = {
    val __obj = js.Dynamic.literal(revoke = js.Any.fromFunction1(revoke))
  
    __obj.asInstanceOf[ServerYar]
  }
}

