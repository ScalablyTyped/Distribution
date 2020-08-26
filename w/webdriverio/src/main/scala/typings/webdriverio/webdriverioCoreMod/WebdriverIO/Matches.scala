package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matches extends Request {
  /**
    * body response of actual resource
    */
  var body: js.Any = js.native
}

object Matches {
  @scala.inline
  def apply(
    body: js.Any,
    headers: Record[String, String],
    initialPriority: ResourcePriority,
    method: String,
    referrerPolicy: ReferrerPolicy,
    url: String
  ): Matches = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], initialPriority = initialPriority.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matches]
  }
  @scala.inline
  implicit class MatchesOps[Self <: Matches] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
  }
  
}

