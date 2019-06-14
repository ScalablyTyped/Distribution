package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Settings for {@link GlobalContext.getAdvancedConfigSetting globalContext.getAdvancedConfigSetting(setting)}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.MaxChildIncidentNumber
  - xrmLib.xrmLibStrings.MaxIncidentMergeNumber
*/
trait AdvancedConfigSettingOption extends js.Object

object AdvancedConfigSettingOption {
  @scala.inline
  def MaxChildIncidentNumber: xrmLib.xrmLibStrings.MaxChildIncidentNumber = this.cast("MaxChildIncidentNumber")
  @scala.inline
  def MaxIncidentMergeNumber: xrmLib.xrmLibStrings.MaxIncidentMergeNumber = this.cast("MaxIncidentMergeNumber")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

