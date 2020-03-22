package typings.uiBox.splitPropsMod

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitProps[P, K /* <: String */] extends js.Object {
  var matchedProps: Pick[P, K]
  var remainingProps: Omit[P, K]
}

object SplitProps {
  @scala.inline
  def apply[P, K /* <: String */](matchedProps: Pick[P, K], remainingProps: Omit[P, K]): SplitProps[P, K] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SplitProps[P, K]]
  }
}

