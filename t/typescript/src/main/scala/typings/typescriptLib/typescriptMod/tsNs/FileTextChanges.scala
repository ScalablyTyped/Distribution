package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTextChanges extends js.Object {
  var fileName: java.lang.String
  var isNewFile: js.UndefOr[scala.Boolean] = js.undefined
  var textChanges: js.Array[TextChange]
}

object FileTextChanges {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    textChanges: js.Array[TextChange],
    isNewFile: js.UndefOr[scala.Boolean] = js.undefined
  ): FileTextChanges = {
    val __obj = js.Dynamic.literal(fileName = fileName, textChanges = textChanges)
    if (!js.isUndefined(isNewFile)) __obj.updateDynamic("isNewFile")(isNewFile)
    __obj.asInstanceOf[FileTextChanges]
  }
}

