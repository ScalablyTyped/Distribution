package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifiedSpan extends js.Object {
  var classificationType: ClassificationTypeNames
  var textSpan: TextSpan
}

object ClassifiedSpan {
  @scala.inline
  def apply(classificationType: ClassificationTypeNames, textSpan: TextSpan): ClassifiedSpan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classificationType")(classificationType)
    __obj.updateDynamic("textSpan")(textSpan)
    __obj.asInstanceOf[ClassifiedSpan]
  }
}

