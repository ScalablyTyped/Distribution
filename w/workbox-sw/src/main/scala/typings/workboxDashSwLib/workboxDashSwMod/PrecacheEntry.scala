package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecacheEntry extends js.Object {
  var revision: java.lang.String
  var url: java.lang.String
}

object PrecacheEntry {
  @scala.inline
  def apply(revision: java.lang.String, url: java.lang.String): PrecacheEntry = {
    val __obj = js.Dynamic.literal(revision = revision, url = url)
  
    __obj.asInstanceOf[PrecacheEntry]
  }
}

