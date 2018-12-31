package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRuleOptions extends js.Object {
  var expression: java.lang.String
  var filter_friendly_name: js.UndefOr[java.lang.String] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  // Don't ask me why, but all of these are supported options.
  var friendly_name: js.UndefOr[java.lang.String] = js.undefined
  var targets: js.Array[WorkflowRuleTargetOptions]
}

