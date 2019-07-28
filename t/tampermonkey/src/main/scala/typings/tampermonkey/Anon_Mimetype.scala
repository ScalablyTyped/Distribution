package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mimetype extends js.Object {
  var mimetype: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Mimetype {
  @scala.inline
  def apply(mimetype: String = null, `type`: String = null): Anon_Mimetype = {
    val __obj = js.Dynamic.literal()
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Mimetype]
  }
}

