package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoBigInt extends js.Object {
  var base10Value: String
  var negative: Boolean
}

object PseudoBigInt {
  @scala.inline
  def apply(base10Value: String, negative: Boolean): PseudoBigInt = {
    val __obj = js.Dynamic.literal(base10Value = base10Value.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PseudoBigInt]
  }
}

