package typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  def total(): js.Promise[Response]
}

object Stats {
  @scala.inline
  def apply(total: () => js.Promise[Response]): Stats = {
    val __obj = js.Dynamic.literal(total = js.Any.fromFunction0(total))
  
    __obj.asInstanceOf[Stats]
  }
}

