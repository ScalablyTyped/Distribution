package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_Pagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsObject extends js.Object {
  var meta: Anon_Pagination
  var tags: js.Array[Tag]
}

object TagsObject {
  @scala.inline
  def apply(meta: Anon_Pagination, tags: js.Array[Tag]): TagsObject = {
    val __obj = js.Dynamic.literal(meta = meta, tags = tags)
  
    __obj.asInstanceOf[TagsObject]
  }
}

