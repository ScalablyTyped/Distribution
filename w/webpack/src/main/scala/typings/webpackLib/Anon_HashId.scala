package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashId extends js.Object {
  var hash: js.Any
  var id: js.Any
}

object Anon_HashId {
  @scala.inline
  def apply(hash: js.Any, id: js.Any): Anon_HashId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_HashId]
  }
}

