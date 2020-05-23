package typings.tryghostContentApi.anon

import typings.tryghostContentApi.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: Nullable[String]
}

object Id {
  @scala.inline
  def apply(id: Nullable[String] = null): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

