package typings.swiz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwizOptions extends js.Object {
  var `for`: js.UndefOr[String] = js.native
  var stripNulls: js.UndefOr[Boolean] = js.native
  var stripSerializerType: js.UndefOr[Boolean] = js.native
}

object ISwizOptions {
  @scala.inline
  def apply(): ISwizOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwizOptions]
  }
  @scala.inline
  implicit class ISwizOptionsOps[Self <: ISwizOptions] (val x: Self) extends AnyVal {
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
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    @scala.inline
    def setStripNulls(value: Boolean): Self = this.set("stripNulls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripNulls: Self = this.set("stripNulls", js.undefined)
    @scala.inline
    def setStripSerializerType(value: Boolean): Self = this.set("stripSerializerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripSerializerType: Self = this.set("stripSerializerType", js.undefined)
  }
  
}

