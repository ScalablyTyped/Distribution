package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  def total(): js.Promise[stdLib.Response]
}

object Stats {
  @scala.inline
  def apply(total: js.Function0[js.Promise[stdLib.Response]]): Stats = {
    val __obj = js.Dynamic.literal(total = total)
  
    __obj.asInstanceOf[Stats]
  }
}

