package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultType extends js.Object {
  var default: js.UndefOr[String] = js.native
  var `type`: string = js.native
}

object DefaultType {
  @scala.inline
  def apply(`type`: string): DefaultType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultType]
  }
  @scala.inline
  implicit class DefaultTypeOps[Self <: DefaultType] (val x: Self) extends AnyVal {
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
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

