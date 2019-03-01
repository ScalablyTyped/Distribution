package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoMerged extends js.Object {
  var autoMerged: scala.Double
  var takeSourceContent: scala.Double
  var takeTargetContent: scala.Double
  var undecided: scala.Double
  var userMerged: scala.Double
}

object Anon_AutoMerged {
  @scala.inline
  def apply(
    autoMerged: scala.Double,
    takeSourceContent: scala.Double,
    takeTargetContent: scala.Double,
    undecided: scala.Double,
    userMerged: scala.Double
  ): Anon_AutoMerged = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoMerged")(autoMerged)
    __obj.updateDynamic("takeSourceContent")(takeSourceContent)
    __obj.updateDynamic("takeTargetContent")(takeTargetContent)
    __obj.updateDynamic("undecided")(undecided)
    __obj.updateDynamic("userMerged")(userMerged)
    __obj.asInstanceOf[Anon_AutoMerged]
  }
}

