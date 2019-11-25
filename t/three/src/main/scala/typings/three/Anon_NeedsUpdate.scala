package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NeedsUpdate extends js.Object {
  var needsUpdate: Boolean
  var value: js.Any
}

object Anon_NeedsUpdate {
  @scala.inline
  def apply(needsUpdate: Boolean, value: js.Any): Anon_NeedsUpdate = {
    val __obj = js.Dynamic.literal(needsUpdate = needsUpdate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NeedsUpdate]
  }
}

