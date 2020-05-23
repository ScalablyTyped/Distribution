package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassificationInfo extends js.Object {
  var classification: TokenClass
  var length: Double
}

object ClassificationInfo {
  @scala.inline
  def apply(classification: TokenClass, length: Double): ClassificationInfo = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationInfo]
  }
}

