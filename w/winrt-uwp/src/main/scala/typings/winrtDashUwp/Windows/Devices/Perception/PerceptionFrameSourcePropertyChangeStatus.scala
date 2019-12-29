package typings.winrtDashUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PerceptionFrameSourcePropertyChangeStatus extends js.Object

/** Indicates the status of a property change that an app requested of a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus")
@js.native
object PerceptionFrameSourcePropertyChangeStatus extends js.Object {
  /** The requested property change was accepted by the frame source. */
  @js.native
  sealed trait accepted extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The frame source property could not be changed because the app lost controller mode before the request was processed. */
  @js.native
  sealed trait lostControl extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property is not supported by the frame source. */
  @js.native
  sealed trait propertyNotSupported extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the property is read-only. */
  @js.native
  sealed trait propertyReadOnly extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The status change is unknown. */
  @js.native
  sealed trait unknown extends PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the value is not in a valid range. */
  @js.native
  sealed trait valueOutOfRange extends PerceptionFrameSourcePropertyChangeStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerceptionFrameSourcePropertyChangeStatus with Double] = js.native
  /* 1 */ @js.native
  object accepted extends TopLevel[accepted with Double]
  
  /* 2 */ @js.native
  object lostControl extends TopLevel[lostControl with Double]
  
  /* 3 */ @js.native
  object propertyNotSupported extends TopLevel[propertyNotSupported with Double]
  
  /* 4 */ @js.native
  object propertyReadOnly extends TopLevel[propertyReadOnly with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 5 */ @js.native
  object valueOutOfRange extends TopLevel[valueOutOfRange with Double]
  
}

