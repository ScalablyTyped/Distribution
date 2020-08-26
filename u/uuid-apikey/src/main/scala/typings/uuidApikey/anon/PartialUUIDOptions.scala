package typings.uuidApikey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<uuid-apikey.uuid-apikey.UUIDOptions> */
@js.native
trait PartialUUIDOptions extends js.Object {
  var noDashes: js.UndefOr[Boolean] = js.native
}

object PartialUUIDOptions {
  @scala.inline
  def apply(): PartialUUIDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUUIDOptions]
  }
  @scala.inline
  implicit class PartialUUIDOptionsOps[Self <: PartialUUIDOptions] (val x: Self) extends AnyVal {
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
    def setNoDashes(value: Boolean): Self = this.set("noDashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDashes: Self = this.set("noDashes", js.undefined)
  }
  
}

