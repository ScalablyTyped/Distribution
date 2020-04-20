package typings.typescript.mod

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
    val __obj = js.Dynamic.literal(classificationType = classificationType.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedSpan]
  }
}

