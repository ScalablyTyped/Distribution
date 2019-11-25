package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_Pagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagesObject extends js.Object {
  var meta: Anon_Pagination
  var pages: js.Array[PostOrPage]
}

object PagesObject {
  @scala.inline
  def apply(meta: Anon_Pagination, pages: js.Array[PostOrPage]): PagesObject = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PagesObject]
  }
}

