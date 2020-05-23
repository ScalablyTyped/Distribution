package typings.wordpressEditPost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slug extends js.Object {
  var name: String
  var slug: String
}

object Slug {
  @scala.inline
  def apply(name: String, slug: String): Slug = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slug]
  }
}

