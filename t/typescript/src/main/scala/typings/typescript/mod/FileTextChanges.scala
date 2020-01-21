package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTextChanges extends js.Object {
  var fileName: java.lang.String
  var isNewFile: js.UndefOr[Boolean] = js.undefined
  var textChanges: js.Array[TextChange]
}

object FileTextChanges {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    textChanges: js.Array[TextChange],
    isNewFile: js.UndefOr[Boolean] = js.undefined
  ): FileTextChanges = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textChanges = textChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewFile)) __obj.updateDynamic("isNewFile")(isNewFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTextChanges]
  }
}

