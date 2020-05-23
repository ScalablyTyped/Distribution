package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeedsUpdate extends js.Object {
  var needsUpdate: Boolean
  var value: js.Any
}

object NeedsUpdate {
  @scala.inline
  def apply(needsUpdate: Boolean, value: js.Any): NeedsUpdate = {
    val __obj = js.Dynamic.literal(needsUpdate = needsUpdate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedsUpdate]
  }
}

