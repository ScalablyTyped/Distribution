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
  
  val hardLeft: hardLeft with java.lang.String = js.native
  val hardRight: hardRight with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val lightLeft: lightLeft with java.lang.String = js.native
  val lightRight: lightRight with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  val straight: straight with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val uturnLeft: uturnLeft with java.lang.String = js.native
  val uturnRight: uturnRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ServicesNs.MapsNs.GuidanceNs.GuidanceLaneMarkers with java.lang.String
  ] = js.native
}

