package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnifiedPosErrorReason extends js.Object

/** Defines the constants that indicates the reason for the error event. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosErrorReason")
@js.native
object UnifiedPosErrorReason extends js.Object {
  /** The device is busy. */
  @js.native
  sealed trait busy extends UnifiedPosErrorReason
  
  /** The device is closed. */
  @js.native
  sealed trait closed extends UnifiedPosErrorReason
  
  /** The device is not enabled. */
  @js.native
  sealed trait disabled extends UnifiedPosErrorReason
  
  /** The operation failed and returned a vendor specific error information. */
  @js.native
  sealed trait extended extends UnifiedPosErrorReason
  
  /** The operation failed although the device was connected and powered on. */
  @js.native
  sealed trait failure extends UnifiedPosErrorReason
  
  /** The operation is not supported or not available on the device. */
  @js.native
  sealed trait illegal extends UnifiedPosErrorReason
  
  /** The device is not connected or not powered on. */
  @js.native
  sealed trait noHardware extends UnifiedPosErrorReason
  
  /** Cannot communicate with the device, possibly due to a configuration error. */
  @js.native
  sealed trait noService extends UnifiedPosErrorReason
  
  /** The device is offline. */
  @js.native
  sealed trait offline extends UnifiedPosErrorReason
  
  /** The operation timed out while waiting for a response from the device. */
  @js.native
  sealed trait timeout extends UnifiedPosErrorReason
  
  /** Unknown reason. */
  @js.native
  sealed trait unknownErrorReason extends UnifiedPosErrorReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosErrorReason with Double] = js.native
  /* 9 */ @js.native
  object busy extends TopLevel[busy with Double]
  
  /* 5 */ @js.native
  object closed extends TopLevel[closed with Double]
  
  /* 2 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 10 */ @js.native
  object extended extends TopLevel[extended with Double]
  
  /* 7 */ @js.native
  object failure extends TopLevel[failure with Double]
  
  /* 3 */ @js.native
  object illegal extends TopLevel[illegal with Double]
  
  /* 4 */ @js.native
  object noHardware extends TopLevel[noHardware with Double]
  
  /* 1 */ @js.native
  object noService extends TopLevel[noService with Double]
  
  /* 6 */ @js.native
  object offline extends TopLevel[offline with Double]
  
  /* 8 */ @js.native
  object timeout extends TopLevel[timeout with Double]
  
  /* 0 */ @js.native
  object unknownErrorReason extends TopLevel[unknownErrorReason with Double]
  
}

