package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataUsageGranularity extends js.Object
/** Defines levels of granularity used when retrieving data usage statistics with GetNetworkUsageAsync . */
@JSGlobal("Windows.Networking.Connectivity.DataUsageGranularity")
@js.native
object DataUsageGranularity extends js.Object {
  
  /** Provide data usage per day. */
  @js.native
  sealed trait perDay extends DataUsageGranularity
  
  /** Provide data usage per hour. */
  @js.native
  sealed trait perHour extends DataUsageGranularity
  
  /** Provide data usage per minute. */
  @js.native
  sealed trait perMinute extends DataUsageGranularity
  
  /** Provide data usage overall. */
  @js.native
  sealed trait total extends DataUsageGranularity
}
