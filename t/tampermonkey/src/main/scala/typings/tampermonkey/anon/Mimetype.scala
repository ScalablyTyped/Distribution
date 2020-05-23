package typings.tampermonkey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mimetype extends js.Object {
  var mimetype: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Mimetype {
  @scala.inline
  def apply(mimetype: String = null, `type`: String = null): Mimetype = {
    val __obj = js.Dynamic.literal()
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mimetype]
  }
}

