package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var flags: Autokeep
  var id: Double
  var name: java.lang.String
  var raw: String
  var thresh: Double
  var value: Double
  var when_failed: java.lang.String
  var worst: Double
}

object Flags {
  @scala.inline
  def apply(
    flags: Autokeep,
    id: Double,
    name: java.lang.String,
    raw: String,
    thresh: Double,
    value: Double,
    when_failed: java.lang.String,
    worst: Double
  ): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], thresh = thresh.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], when_failed = when_failed.asInstanceOf[js.Any], worst = worst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

