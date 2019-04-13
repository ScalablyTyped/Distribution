package typings
package yarLib.yarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerYar extends js.Object {
  def revoke(id: catboxLib.catboxMod.Id): js.Promise[scala.Unit]
}

object ServerYar {
  @scala.inline
  def apply(revoke: catboxLib.catboxMod.Id => js.Promise[scala.Unit]): ServerYar = {
    val __obj = js.Dynamic.literal(revoke = js.Any.fromFunction1(revoke))
  
    __obj.asInstanceOf[ServerYar]
  }
}

