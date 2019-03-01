package typings
package uiDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MatchedProps extends js.Object {
  var matchedProps: js.Object
  var remainingProps: js.Object
}

object Anon_MatchedProps {
  @scala.inline
  def apply(matchedProps: js.Object, remainingProps: js.Object): Anon_MatchedProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("matchedProps")(matchedProps)
    __obj.updateDynamic("remainingProps")(remainingProps)
    __obj.asInstanceOf[Anon_MatchedProps]
  }
}

