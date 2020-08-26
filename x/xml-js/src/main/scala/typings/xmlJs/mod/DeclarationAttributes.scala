package typings.xmlJs.mod

import typings.xmlJs.xmlJsStrings.`utf-8`
import typings.xmlJs.xmlJsStrings.no
import typings.xmlJs.xmlJsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationAttributes extends js.Object {
  var encoding: js.UndefOr[`utf-8` | String] = js.native
  var standalone: js.UndefOr[yes | no] = js.native
  var version: js.UndefOr[String | Double] = js.native
}

object DeclarationAttributes {
  @scala.inline
  def apply(): DeclarationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationAttributes]
  }
  @scala.inline
  implicit class DeclarationAttributesOps[Self <: DeclarationAttributes] (val x: Self) extends AnyVal {
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
    def setEncoding(value: `utf-8` | String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setStandalone(value: yes | no): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
    @scala.inline
    def setVersion(value: String | Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

