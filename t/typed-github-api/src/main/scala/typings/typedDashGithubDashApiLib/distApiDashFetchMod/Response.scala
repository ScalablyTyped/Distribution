package typings
package typedDashGithubDashApiLib.distApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var data: T
  var nextLink: js.UndefOr[java.lang.String] = js.undefined
}

object Response {
  @scala.inline
  def apply[T](data: T, nextLink: java.lang.String = null): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink)
    __obj.asInstanceOf[Response[T]]
  }
}

