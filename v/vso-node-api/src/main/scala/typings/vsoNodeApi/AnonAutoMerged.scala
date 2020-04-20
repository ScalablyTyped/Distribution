package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoMerged extends js.Object {
  var autoMerged: Double
  var takeSourceContent: Double
  var takeTargetContent: Double
  var undecided: Double
  var userMerged: Double
}

object AnonAutoMerged {
  @scala.inline
  def apply(
    autoMerged: Double,
    takeSourceContent: Double,
    takeTargetContent: Double,
    undecided: Double,
    userMerged: Double
  ): AnonAutoMerged = {
    val __obj = js.Dynamic.literal(autoMerged = autoMerged.asInstanceOf[js.Any], takeSourceContent = takeSourceContent.asInstanceOf[js.Any], takeTargetContent = takeTargetContent.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any], userMerged = userMerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoMerged]
  }
}

