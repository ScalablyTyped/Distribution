package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachments extends js.Object {
  var attachments: scala.Double = js.native
  var custom: scala.Double = js.native
  var history: scala.Double = js.native
  var links: scala.Double = js.native
}

object Attachments {
  @scala.inline
  def apply(attachments: scala.Double, custom: scala.Double, history: scala.Double, links: scala.Double): Attachments = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
  @scala.inline
  implicit class AttachmentsOps[Self <: Attachments] (val x: Self) extends AnyVal {
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
    def setAttachments(value: scala.Double): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: scala.Double): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: scala.Double): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: scala.Double): Self = this.set("links", value.asInstanceOf[js.Any])
  }
  
}

