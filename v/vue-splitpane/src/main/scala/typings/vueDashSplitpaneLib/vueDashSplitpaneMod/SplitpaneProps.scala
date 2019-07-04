package typings
package vueDashSplitpaneLib.vueDashSplitpaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneProps extends js.Object {
   // = ['vertical', 'horizontal']
  var className: java.lang.String
  var defaultPercent: scala.Double
  var minPercent: scala.Double
  var split: java.lang.String
}

object SplitpaneProps {
  @scala.inline
  def apply(
    className: java.lang.String,
    defaultPercent: scala.Double,
    minPercent: scala.Double,
    split: java.lang.String
  ): SplitpaneProps = {
    val __obj = js.Dynamic.literal(className = className, defaultPercent = defaultPercent, minPercent = minPercent, split = split)
  
    __obj.asInstanceOf[SplitpaneProps]
  }
}

