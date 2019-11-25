package typings.atTryghostContentDashApi.atTryghostContentDashApiMod

import typings.atTryghostContentDashApi.Anon_Pagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorsObject extends js.Object {
  var authors: js.Array[Author]
  var meta: Anon_Pagination
}

object AuthorsObject {
  @scala.inline
  def apply(authors: js.Array[Author], meta: Anon_Pagination): AuthorsObject = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthorsObject]
  }
}

