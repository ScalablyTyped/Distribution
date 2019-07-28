package typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GuidanceLaneMarkers extends js.Object

/** Specifies the path of the lane. */
@JSGlobal("Windows.Services.Maps.Guidance.GuidanceLaneMarkers")
@js.native
object GuidanceLaneMarkers extends js.Object {
  /** A hard left turn marker. */
  @js.native
  sealed trait hardLeft extends GuidanceLaneMarkers
  
  /** A hard right turn marker. */
  @js.native
  sealed trait hardRight extends GuidanceLaneMarkers
  
  /** A left turn marker. */
  @js.native
  sealed trait left extends GuidanceLaneMarkers
  
  /** A light left turn marker. */
  @js.native
  sealed trait lightLeft extends GuidanceLaneMarkers
  
  /** A light right turn marker. */
  @js.native
  sealed trait lightRight extends GuidanceLaneMarkers
  
  /** No lane markers are present. */
  @js.native
  sealed trait none extends GuidanceLaneMarkers
  
  /** A right turn marker. */
  @js.native
  sealed trait right extends GuidanceLaneMarkers
  
  /** A go straight marker. */
  @js.native
  sealed trait straight extends GuidanceLaneMarkers
  
  /** No lane marker information is available. */
  @js.native
  sealed trait unknown extends GuidanceLaneMarkers
  
  /** A left U-turn marker. */
  @js.native
  sealed trait uturnLeft extends GuidanceLaneMarkers
  
  /** A right U-turn marker. */
  @js.native
  sealed trait uturnRight extends GuidanceLaneMarkers
  
  /* 6 */ val hardLeft: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.hardLeft with Double = js.native
  /* 3 */ val hardRight: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.hardRight with Double = js.native
  /* 7 */ val left: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.left with Double = js.native
  /* 8 */ val lightLeft: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.lightLeft with Double = js.native
  /* 1 */ val lightRight: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.lightRight with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.none with Double = js.native
  /* 2 */ val right: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.right with Double = js.native
  /* 4 */ val straight: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.straight with Double = js.native
  /* 10 */ val unknown: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.unknown with Double = js.native
  /* 5 */ val uturnLeft: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.uturnLeft with Double = js.native
  /* 9 */ val uturnRight: typings.winrtDashUwp.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers.uturnRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GuidanceLaneMarkers with Double] = js.native
}

