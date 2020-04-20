package typings.typedGithubApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: AnonFrom
  var title: AnonFrom
}

object AnonBody {
  @scala.inline
  def apply(body: AnonFrom, title: AnonFrom): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

