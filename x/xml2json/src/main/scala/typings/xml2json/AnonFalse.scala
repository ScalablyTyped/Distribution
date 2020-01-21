package typings.xml2json

import typings.xml2json.xml2jsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var `object`: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(`object`: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

