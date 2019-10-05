package typings.typescriptDashCompare.typescriptDashCompareMod.Compare.Options

import typings.typescriptDashCompare.typescriptDashCompareStrings.broaderLeft
import typings.typescriptDashCompare.typescriptDashCompareStrings.broaderRight
import typings.typescriptDashCompare.typescriptDashCompareStrings.equal
import typings.typescriptDashCompare.typescriptDashCompareStrings.mismatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default
  extends typings.typescriptDashCompare.typescriptDashCompareMod.Compare.Options {
  @JSName("broaderLeft")
  var broaderLeft_Default: broaderLeft
  @JSName("broaderRight")
  var broaderRight_Default: broaderRight
  @JSName("equal")
  var equal_Default: equal
  @JSName("mismatch")
  var mismatch_Default: mismatch
}

object Default {
  @scala.inline
  def apply(broaderLeft: broaderLeft, broaderRight: broaderRight, equal: equal, mismatch: mismatch): Default = {
    val __obj = js.Dynamic.literal(broaderLeft = broaderLeft, broaderRight = broaderRight, equal = equal, mismatch = mismatch)
  
    __obj.asInstanceOf[Default]
  }
}

