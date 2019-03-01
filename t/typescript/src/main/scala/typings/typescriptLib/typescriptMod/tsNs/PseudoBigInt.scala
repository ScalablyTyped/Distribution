package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a bigint literal value without requiring bigint support */
trait PseudoBigInt extends js.Object {
  var base10Value: java.lang.String
  var negative: scala.Boolean
}

object PseudoBigInt {
  @scala.inline
  def apply(base10Value: java.lang.String, negative: scala.Boolean): PseudoBigInt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base10Value")(base10Value)
    __obj.updateDynamic("negative")(negative)
    __obj.asInstanceOf[PseudoBigInt]
  }
}

