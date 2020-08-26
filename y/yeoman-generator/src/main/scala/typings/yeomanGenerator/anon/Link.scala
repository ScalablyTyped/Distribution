package typings.yeomanGenerator.anon

import typings.yeomanGenerator.yeomanGeneratorStrings.strong
import typings.yeomanGenerator.yeomanGeneratorStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends js.Object {
  var link: weak | strong = js.native
  var local: String = js.native
}

object Link {
  @scala.inline
  def apply(link: weak | strong, local: String): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
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
    def setLink(value: weak | strong): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
  }
  
}

