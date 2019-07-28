package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTextChanges extends js.Object {
  var fileName: String
  var isNewFile: js.UndefOr[Boolean] = js.undefined
  var textChanges: js.Array[TextChange]
}

object FileTextChanges {
  @scala.inline
  def apply(fileName: String, textChanges: js.Array[TextChange], isNewFile: js.UndefOr[Boolean] = js.undefined): FileTextChanges = {
    val __obj = js.Dynamic.literal(fileName = fileName, textChanges = textChanges)
    if (!js.isUndefined(isNewFile)) __obj.updateDynamic("isNewFile")(isNewFile)
    __obj.asInstanceOf[FileTextChanges]
  }
}

