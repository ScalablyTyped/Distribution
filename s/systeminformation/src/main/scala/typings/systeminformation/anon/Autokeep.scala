package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autokeep extends js.Object {
  var auto_keep: Boolean
  var error_rate: Boolean
  var event_count: Boolean
  var performance: Boolean
  var prefailure: Boolean
  var string: java.lang.String
  var updated_online: Boolean
  var value: Double
}

object Autokeep {
  @scala.inline
  def apply(
    auto_keep: Boolean,
    error_rate: Boolean,
    event_count: Boolean,
    performance: Boolean,
    prefailure: Boolean,
    string: java.lang.String,
    updated_online: Boolean,
    value: Double
  ): Autokeep = {
    val __obj = js.Dynamic.literal(auto_keep = auto_keep.asInstanceOf[js.Any], error_rate = error_rate.asInstanceOf[js.Any], event_count = event_count.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], prefailure = prefailure.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], updated_online = updated_online.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autokeep]
  }
}

