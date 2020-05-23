package typings.terser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  var flags: String
  var source: String
}

object Flags {
  @scala.inline
  def apply(flags: String, source: String): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

