package typings.uiDashBox.distUtilsSplitDashBoxDashPropsMod

import typings.std.Exclude
import typings.std.Pick
import typings.uiDashBox.distTypesEnhancersMod.EnhancerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitBoxProps[P /* <: EnhancerProps */] extends js.Object {
  var matchedProps: Pick[P, String]
  var remainingProps: Pick[P, Exclude[String, String]]
}

object SplitBoxProps {
  @scala.inline
  def apply[P /* <: EnhancerProps */](matchedProps: Pick[P, String], remainingProps: Pick[P, Exclude[String, String]]): SplitBoxProps[P] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps, remainingProps = remainingProps)
  
    __obj.asInstanceOf[SplitBoxProps[P]]
  }
}

