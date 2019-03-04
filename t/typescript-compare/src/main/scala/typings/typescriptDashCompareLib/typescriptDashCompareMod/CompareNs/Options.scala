package typings
package typescriptDashCompareLib.typescriptDashCompareMod.CompareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var broaderLeft: js.Any
  var broaderRight: js.Any
  var equal: js.Any
  var mismatch: js.Any
}

object Options {
  @scala.inline
  def apply(broaderLeft: js.Any, broaderRight: js.Any, equal: js.Any, mismatch: js.Any): Options = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft, broaderRight = broaderRight, equal = equal, mismatch = mismatch)
  
    __obj.asInstanceOf[Options]
  }
}

