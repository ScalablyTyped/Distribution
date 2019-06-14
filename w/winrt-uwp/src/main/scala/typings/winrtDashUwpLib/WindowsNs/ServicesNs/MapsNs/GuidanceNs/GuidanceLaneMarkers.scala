package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs

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
  sealed trait hardLeft
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A hard right turn marker. */
  @js.native
  sealed trait hardRight
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A left turn marker. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A light left turn marker. */
  @js.native
  sealed trait lightLeft
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A light right turn marker. */
  @js.native
  sealed trait lightRight
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** No lane markers are present. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A right turn marker. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A go straight marker. */
  @js.native
  sealed trait straight
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** No lane marker information is available. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A left U-turn marker. */
  @js.native
  sealed trait uturnLeft
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /** A right U-turn marker. */
  @js.native
  sealed trait uturnRight
    extends winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers
  
  /* 6 */ val hardLeft: hardLeft with scala.Double = js.native
  /* 3 */ val hardRight: hardRight with scala.Double = js.native
  /* 7 */ val left: left with scala.Double = js.native
  /* 8 */ val lightLeft: lightLeft with scala.Double = js.native
  /* 1 */ val lightRight: lightRight with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val right: right with scala.Double = js.native
  /* 4 */ val straight: straight with scala.Double = js.native
  /* 10 */ val unknown: unknown with scala.Double = js.native
  /* 5 */ val uturnLeft: uturnLeft with scala.Double = js.native
  /* 9 */ val uturnRight: uturnRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers with scala.Double
  ] = js.native
}

