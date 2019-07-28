package typings.xrm.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Settings for {@link GlobalContext.getAdvancedConfigSetting globalContext.getAdvancedConfigSetting(setting)}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.MaxChildIncidentNumber
  - typings.xrm.xrmStrings.MaxIncidentMergeNumber
*/
trait AdvancedConfigSettingOption extends js.Object

object AdvancedConfigSettingOption {
  @scala.inline
  def MaxChildIncidentNumber: typings.xrm.xrmStrings.MaxChildIncidentNumber = this.cast("MaxChildIncidentNumber")
  @scala.inline
  def MaxIncidentMergeNumber: typings.xrm.xrmStrings.MaxIncidentMergeNumber = this.cast("MaxIncidentMergeNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

