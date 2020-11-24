package typings.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A set of enumerated values together describing the possible enterprise data protection (EDP) enforcement levels. EDP enforcement level is one aspect of mobile device management (MDM) policy configuration. */
@JSGlobal("Windows.Security.EnterpriseData.EnforcementLevel")
@js.native
object EnforcementLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel with Double] = js.native
  
  /* 3 */ val block: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.block with Double = js.native
  
  /* 0 */ val noProtection: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.noProtection with Double = js.native
  
  /* 2 */ val `override`: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.`override` with Double = js.native
  
  /* 1 */ val silent: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.silent with Double = js.native
}
