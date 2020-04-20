package typings.webgme

import typings.webgme.GmeCommon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.Array[Path]
}

object AnonFilter {
  @scala.inline
  def apply(filter: js.Array[Path]): AnonFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

