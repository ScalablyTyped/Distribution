package typings.webgme.GmeCommon

import typings.webgme.webgmeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefStringObject extends DefObject {
  var enum: js.UndefOr[js.Array[String]] = js.undefined
  var regex: js.UndefOr[String] = js.undefined
  var `type`: string
}

object DefStringObject {
  @scala.inline
  def apply(`type`: string, enum: js.Array[String] = null, regex: String = null): DefStringObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefStringObject]
  }
}

