package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdvancedConfigSettingOption extends js.Object

/**
  * Constant Enum: Settings for {@link GlobalContext.getAdvancedConfigSetting globalContext.getAdvancedConfigSetting(setting)}
  */
@JSGlobal("XrmEnum.AdvancedConfigSettingOption")
@js.native
object AdvancedConfigSettingOption extends js.Object {
  @js.native
  sealed trait MaxChildIncidentNumber
    extends xrmLib.XrmEnumNs.AdvancedConfigSettingOption
  
  @js.native
  sealed trait MaxIncidentMergeNumber
    extends xrmLib.XrmEnumNs.AdvancedConfigSettingOption
  
  /* "MaxChildIncidentNumber" */ val MaxChildIncidentNumber: MaxChildIncidentNumber with java.lang.String = js.native
  /* "MaxIncidentMergeNumber" */ val MaxIncidentMergeNumber: MaxIncidentMergeNumber with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.AdvancedConfigSettingOption with java.lang.String] = js.native
}

