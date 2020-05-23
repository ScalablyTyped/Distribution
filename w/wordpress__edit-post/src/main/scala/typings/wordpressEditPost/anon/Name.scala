package typings.wordpressEditPost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var size: Double
  var slug: String
}

object Name {
  @scala.inline
  def apply(name: String, size: Double, slug: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

