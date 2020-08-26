package typings.workboxPrecaching.precacheEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrecacheEntry extends js.Object {
  // integrity?: string;
  var revision: js.UndefOr[String] = js.native
  var url: String = js.native
}

object PrecacheEntry {
  @scala.inline
  def apply(url: String): PrecacheEntry = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecacheEntry]
  }
  @scala.inline
  implicit class PrecacheEntryOps[Self <: PrecacheEntry] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
  }
  
}

