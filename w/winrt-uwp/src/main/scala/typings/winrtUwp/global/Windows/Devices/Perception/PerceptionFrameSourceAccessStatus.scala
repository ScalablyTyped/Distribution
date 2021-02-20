package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the access status an app is allowed for a particular type of frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourceAccessStatus")
@js.native
object PerceptionFrameSourceAccessStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus with Double
  ] = js.native
  
  /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.allowed with Double = js.native
  
  /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.deniedBySystem with Double = js.native
  
  /* 2 */ val deniedByUser: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.deniedByUser with Double = js.native
  
  /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus.unspecified with Double = js.native
}
