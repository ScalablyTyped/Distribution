package typings
package typescriptDashCompareLib.typescriptDashCompareMod.CompareNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default
  extends typescriptDashCompareLib.typescriptDashCompareMod.CompareNs.Options {
  @JSName("broaderLeft")
  var broaderLeft_Default: typescriptDashCompareLib.typescriptDashCompareLibStrings.broaderLeft
  @JSName("broaderRight")
  var broaderRight_Default: typescriptDashCompareLib.typescriptDashCompareLibStrings.broaderRight
  @JSName("equal")
  var equal_Default: typescriptDashCompareLib.typescriptDashCompareLibStrings.equal
  @JSName("mismatch")
  var mismatch_Default: typescriptDashCompareLib.typescriptDashCompareLibStrings.mismatch
}

object Default {
  @scala.inline
  def apply(
    broaderLeft: typescriptDashCompareLib.typescriptDashCompareLibStrings.broaderLeft,
    broaderRight: typescriptDashCompareLib.typescriptDashCompareLibStrings.broaderRight,
    equal: typescriptDashCompareLib.typescriptDashCompareLibStrings.equal,
    mismatch: typescriptDashCompareLib.typescriptDashCompareLibStrings.mismatch
  ): Default = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("broaderLeft")(broaderLeft)
    __obj.updateDynamic("broaderRight")(broaderRight)
    __obj.updateDynamic("equal")(equal)
    __obj.updateDynamic("mismatch")(mismatch)
    __obj.asInstanceOf[Default]
  }
}

