package typings.typescript.typescriptMod

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
    val __obj = js.Dynamic.literal(classification = classification, length = length)
  
    __obj.asInstanceOf[ClassificationInfo]
  }
}

