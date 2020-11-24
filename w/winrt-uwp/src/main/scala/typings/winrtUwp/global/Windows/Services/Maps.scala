package typings.winrtUwp.global.Windows.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Services.Maps namespace contains classes that provide location, routing, and geocoding services. */
@JSGlobal("Windows.Services.Maps")
@js.native
object Maps extends js.Object {
  
  /** Provides APIs for turn-by-turn guided navigation. */
  @js.native
  object Guidance extends js.Object {
    
    /** Specifies the path of the lane. */
    @js.native
    object GuidanceLaneMarkers extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers with Double] = js.native
      
      /* 6 */ val hardLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardLeft with Double = js.native
      
      /* 3 */ val hardRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardRight with Double = js.native
      
      /* 7 */ val left: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.left with Double = js.native
      
      /* 8 */ val lightLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightLeft with Double = js.native
      
      /* 1 */ val lightRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightRight with Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.none with Double = js.native
      
      /* 2 */ val right: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.right with Double = js.native
      
      /* 4 */ val straight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.straight with Double = js.native
      
      /* 10 */ val unknown: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.unknown with Double = js.native
      
      /* 5 */ val uturnLeft: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnLeft with Double = js.native
      
      /* 9 */ val uturnRight: typings.winrtUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnRight with Double = js.native
    }
  }
}
