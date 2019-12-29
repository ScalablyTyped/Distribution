package typings.winrtDashUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataUsageGranularity with Double] = js.native
  /* 2 */ @js.native
  object perDay extends TopLevel[perDay with Double]
  
  /* 1 */ @js.native
  object perHour extends TopLevel[perHour with Double]
  
  /* 0 */ @js.native
  object perMinute extends TopLevel[perMinute with Double]
  
  /* 3 */ @js.native
  object total extends TopLevel[total with Double]
  
}

