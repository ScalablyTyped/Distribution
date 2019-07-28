package typings.vueDashSplitpane.vueDashSplitpaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneProps extends js.Object {
   // = ['vertical', 'horizontal']
  var className: String
  var defaultPercent: Double
  var minPercent: Double
  var split: String
}

object SplitpaneProps {
  @scala.inline
  def apply(className: String, defaultPercent: Double, minPercent: Double, split: String): SplitpaneProps = {
    val __obj = js.Dynamic.literal(className = className, defaultPercent = defaultPercent, minPercent = minPercent, split = split)
  
    __obj.asInstanceOf[SplitpaneProps]
  }
}

