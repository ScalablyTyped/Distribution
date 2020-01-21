package typings.workboxPrecaching.precacheEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecacheEntry extends js.Object {
  // integrity?: string;
  var revision: js.UndefOr[String] = js.undefined
  var url: String
}

object PrecacheEntry {
  @scala.inline
  def apply(url: String, revision: String = null): PrecacheEntry = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecacheEntry]
  }
}

