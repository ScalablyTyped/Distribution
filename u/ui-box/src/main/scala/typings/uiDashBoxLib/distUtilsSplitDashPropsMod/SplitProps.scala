package typings
package uiDashBoxLib.distUtilsSplitDashPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitProps[P, K /* <: java.lang.String */] extends js.Object {
  var matchedProps: stdLib.Pick[P, K]
  var remainingProps: Omit[P, K]
}

object SplitProps {
  @scala.inline
  def apply[P, K /* <: java.lang.String */](matchedProps: stdLib.Pick[P, K], remainingProps: Omit[P, K]): SplitProps[P, K] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps, remainingProps = remainingProps)
  
    __obj.asInstanceOf[SplitProps[P, K]]
  }
}

