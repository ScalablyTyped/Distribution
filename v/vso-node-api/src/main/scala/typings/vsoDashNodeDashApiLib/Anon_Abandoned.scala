package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abandoned extends js.Object {
  var abandoned: scala.Double
  var canceled: scala.Double
  var failed: scala.Double
  var skipped: scala.Double
  var succeeded: scala.Double
  var succeededWithIssues: scala.Double
}

object Anon_Abandoned {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    canceled: scala.Double,
    failed: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    succeededWithIssues: scala.Double
  ): Anon_Abandoned = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abandoned")(abandoned)
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("skipped")(skipped)
    __obj.updateDynamic("succeeded")(succeeded)
    __obj.updateDynamic("succeededWithIssues")(succeededWithIssues)
    __obj.asInstanceOf[Anon_Abandoned]
  }
}

