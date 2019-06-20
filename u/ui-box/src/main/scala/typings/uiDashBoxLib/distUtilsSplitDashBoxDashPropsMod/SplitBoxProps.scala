package typings
package uiDashBoxLib.distUtilsSplitDashBoxDashPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitBoxProps[P /* <: uiDashBoxLib.distTypesEnhancersMod.EnhancerProps */] extends js.Object {
  var matchedProps: stdLib.Pick[P, java.lang.String]
  var remainingProps: stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]
}

object SplitBoxProps {
  @scala.inline
  def apply[P /* <: uiDashBoxLib.distTypesEnhancersMod.EnhancerProps */](
    matchedProps: stdLib.Pick[P, java.lang.String],
    remainingProps: stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]]
  ): SplitBoxProps[P] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps, remainingProps = remainingProps)
  
    __obj.asInstanceOf[SplitBoxProps[P]]
  }
}

