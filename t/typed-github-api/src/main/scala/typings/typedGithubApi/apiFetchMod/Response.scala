package typings.typedGithubApi.apiFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var data: T
  var nextLink: js.UndefOr[String] = js.undefined
}

object Response {
  @scala.inline
  def apply[T](data: T, nextLink: String = null): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
}

