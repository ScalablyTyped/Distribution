package typings.webvrApi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class VRDisplay ()
    extends typings.webvrApi.VRDisplay
  
  @js.native
  class VRDisplayCapabilities ()
    extends typings.webvrApi.VRDisplayCapabilities
  
  @js.native
  class VRDisplayEvent protected ()
    extends typings.webvrApi.VRDisplayEvent {
    def this(`type`: String, eventInitDict: VRDisplayEventInit) = this()
  }
  
  @js.native
  class VREyeParameters ()
    extends typings.webvrApi.VREyeParameters
  
  @js.native
  class VRFieldOfView ()
    extends typings.webvrApi.VRFieldOfView
  
  @js.native
  class VRFrameData ()
    extends typings.webvrApi.VRFrameData
  
  @js.native
  class VRPose ()
    extends typings.webvrApi.VRPose
  
  @js.native
  object VRDisplay
    extends Instantiable0[typings.webvrApi.VRDisplay]
  
  @js.native
  object VRDisplayCapabilities
    extends Instantiable0[typings.webvrApi.VRDisplayCapabilities]
  
  @js.native
  object VRDisplayEvent
    extends Instantiable2[
          /* type */ String, 
          /* eventInitDict */ VRDisplayEventInit, 
          typings.webvrApi.VRDisplayEvent
        ]
  
  @js.native
  object VREyeParameters
    extends Instantiable0[typings.webvrApi.VREyeParameters]
  
  @js.native
  object VRFieldOfView
    extends Instantiable0[typings.webvrApi.VRFieldOfView]
  
  @js.native
  object VRFrameData
    extends Instantiable0[typings.webvrApi.VRFrameData]
  
  @js.native
  object VRPose
    extends Instantiable0[typings.webvrApi.VRPose]
  
}

