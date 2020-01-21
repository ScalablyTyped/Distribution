package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonPagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesObject extends js.Object {
  var meta: AnonPagination
  var pages: js.Array[PostOrPage]
}

object PagesObject {
  @scala.inline
  def apply(meta: AnonPagination, pages: js.Array[PostOrPage]): PagesObject = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PagesObject]
  }
}

