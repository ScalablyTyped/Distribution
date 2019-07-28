package typings.workboxDashSw.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecacheEntry extends js.Object {
  var revision: String
  var url: String
}

object PrecacheEntry {
  @scala.inline
  def apply(revision: String, url: String): PrecacheEntry = {
    val __obj = js.Dynamic.literal(revision = revision, url = url)
  
    __obj.asInstanceOf[PrecacheEntry]
  }
}

