package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identification extends js.Object {
  var id: String
  var slug: String
}

object Identification {
  @scala.inline
  def apply(id: String, slug: String): Identification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Identification]
  }
}

