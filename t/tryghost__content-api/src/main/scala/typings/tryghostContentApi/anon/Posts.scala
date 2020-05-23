package typings.tryghostContentApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Posts extends js.Object {
  var posts: Double
}

object Posts {
  @scala.inline
  def apply(posts: Double): Posts = {
    val __obj = js.Dynamic.literal(posts = posts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Posts]
  }
}

