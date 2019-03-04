package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrecacheEntry extends js.Object {
  var revision: java.lang.String
  var url: java.lang.String
}

object IPrecacheEntry {
  @scala.inline
  def apply(revision: java.lang.String, url: java.lang.String): IPrecacheEntry = {
    val __obj = js.Dynamic.literal(revision = revision, url = url)
  
    __obj.asInstanceOf[IPrecacheEntry]
  }
}

