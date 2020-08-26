package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelOffsetSupport extends js.Object {
  /**
    * The client supports processing label offsets instead of a
    * simple label string.
    *
    * @since 3.14.0
    */
  var labelOffsetSupport: js.UndefOr[Boolean] = js.native
}

object LabelOffsetSupport {
  @scala.inline
  def apply(): LabelOffsetSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOffsetSupport]
  }
  @scala.inline
  implicit class LabelOffsetSupportOps[Self <: LabelOffsetSupport] (val x: Self) extends AnyVal {
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
    def setLabelOffsetSupport(value: Boolean): Self = this.set("labelOffsetSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOffsetSupport: Self = this.set("labelOffsetSupport", js.undefined)
  }
  
}

