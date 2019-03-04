package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefStringObject extends DefObject {
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var regex: js.UndefOr[java.lang.String] = js.undefined
  var `type`: webgmeLib.webgmeLibStrings.string
}

object DefStringObject {
  @scala.inline
  def apply(
    `type`: webgmeLib.webgmeLibStrings.string,
    enum: js.Array[java.lang.String] = null,
    regex: java.lang.String = null
  ): DefStringObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[DefStringObject]
  }
}

