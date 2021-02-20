package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsGeographicalScope extends StObject
/** Values that describe the geographical scope of a cell broadcast message. */
@JSGlobal("Windows.Devices.Sms.SmsGeographicalScope")
@js.native
object SmsGeographicalScope extends StObject {
  
  /** Scope is a single cell tower. */
  @js.native
  sealed trait cell extends SmsGeographicalScope
  
  /** Scope is a single cell tower, with immediate display. */
  @js.native
  sealed trait cellWithImmediateDisplay extends SmsGeographicalScope
  
  /** Scope is a Location Area. */
  @js.native
  sealed trait locationArea extends SmsGeographicalScope
  
  /** An undefined or unknown geographical scope. */
  @js.native
  sealed trait none extends SmsGeographicalScope
  
  /** Scope is the entire Public Land Mobile Network (PLMN). */
  @js.native
  sealed trait plmn extends SmsGeographicalScope
}
