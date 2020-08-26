package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** RSS or ATOM feed found on the webpage. */
@js.native
trait Feed extends js.Object {
  /** URL of the RSS or ATOM feed. */
  var link: js.UndefOr[String] = js.native
}

object Feed {
  @scala.inline
  def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  @scala.inline
  implicit class FeedOps[Self <: Feed] (val x: Self) extends AnyVal {
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
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
  
}

