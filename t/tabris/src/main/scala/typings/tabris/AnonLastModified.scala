package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastModified extends js.Object {
  var lastModified: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AnonLastModified {
  @scala.inline
  def apply(lastModified: Int | Double = null, `type`: String = null): AnonLastModified = {
    val __obj = js.Dynamic.literal()
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLastModified]
  }
}

