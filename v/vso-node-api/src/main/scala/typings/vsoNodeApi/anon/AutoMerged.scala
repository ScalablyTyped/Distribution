package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoMerged extends js.Object {
  var autoMerged: scala.Double
  var takeSourceContent: scala.Double
  var takeTargetContent: scala.Double
  var undecided: scala.Double
  var userMerged: scala.Double
}

object AutoMerged {
  @scala.inline
  def apply(
    autoMerged: scala.Double,
    takeSourceContent: scala.Double,
    takeTargetContent: scala.Double,
    undecided: scala.Double,
    userMerged: scala.Double
  ): AutoMerged = {
    val __obj = js.Dynamic.literal(autoMerged = autoMerged.asInstanceOf[js.Any], takeSourceContent = takeSourceContent.asInstanceOf[js.Any], takeTargetContent = takeTargetContent.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any], userMerged = userMerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMerged]
  }
}

