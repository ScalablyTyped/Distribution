package typings.tryghostContentApi.mod

import typings.tryghostContentApi.AnonPagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorsObject extends js.Object {
  var authors: js.Array[Author]
  var meta: AnonPagination
}

object AuthorsObject {
  @scala.inline
  def apply(authors: js.Array[Author], meta: AnonPagination): AuthorsObject = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthorsObject]
  }
}

