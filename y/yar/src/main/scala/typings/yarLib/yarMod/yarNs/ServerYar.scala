package typings
package yarLib.yarMod.yarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerYar extends js.Object {
  def revoke(id: catboxLib.catboxMod.Id): js.Promise[scala.Unit]
}

object ServerYar {
  @scala.inline
  def apply(revoke: js.Function1[catboxLib.catboxMod.Id, js.Promise[scala.Unit]]): ServerYar = {
    val __obj = js.Dynamic.literal(revoke = revoke)
  
    __obj.asInstanceOf[ServerYar]
  }
}

