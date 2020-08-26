package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseLinkDestination extends js.Object {
  var parseLinkDestination: js.Any = js.native
  var parseLinkLabel: js.Any = js.native
  var parseLinkTitle: js.Any = js.native
}

object ParseLinkDestination {
  @scala.inline
  def apply(parseLinkDestination: js.Any, parseLinkLabel: js.Any, parseLinkTitle: js.Any): ParseLinkDestination = {
    val __obj = js.Dynamic.literal(parseLinkDestination = parseLinkDestination.asInstanceOf[js.Any], parseLinkLabel = parseLinkLabel.asInstanceOf[js.Any], parseLinkTitle = parseLinkTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseLinkDestination]
  }
  @scala.inline
  implicit class ParseLinkDestinationOps[Self <: ParseLinkDestination] (val x: Self) extends AnyVal {
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
    def setParseLinkDestination(value: js.Any): Self = this.set("parseLinkDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseLinkLabel(value: js.Any): Self = this.set("parseLinkLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseLinkTitle(value: js.Any): Self = this.set("parseLinkTitle", value.asInstanceOf[js.Any])
  }
  
}

