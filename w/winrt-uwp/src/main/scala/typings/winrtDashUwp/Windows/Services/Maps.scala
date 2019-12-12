package typings.winrtDashUwp.Windows.Services

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardLeft
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.hardRight
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.left
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightLeft
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.lightRight
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.none
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.right
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.straight
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.unknown
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnLeft
import typings.winrtDashUwp.Windows.Services.Maps.Guidance.GuidanceLaneMarkers.uturnRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Windows.Services.Maps namespace contains classes that provide location, routing, and geocoding services. */
@JSGlobal("Windows.Services.Maps")
@js.native
object Maps extends js.Object {
  /** Provides APIs for turn-by-turn guided navigation. */
  @js.native
  object Guidance extends js.Object {
    @js.native
    sealed trait GuidanceLaneMarkers extends js.Object
    
    /** Specifies the path of the lane. */
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
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[GuidanceLaneMarkers with Double] = js.native
      /* 6 */ @js.native
      object hardLeft extends TopLevel[hardLeft with Double]
      
      /* 3 */ @js.native
      object hardRight extends TopLevel[hardRight with Double]
      
      /* 7 */ @js.native
      object left extends TopLevel[left with Double]
      
      /* 8 */ @js.native
      object lightLeft extends TopLevel[lightLeft with Double]
      
      /* 1 */ @js.native
      object lightRight extends TopLevel[lightRight with Double]
      
      /* 0 */ @js.native
      object none extends TopLevel[none with Double]
      
      /* 2 */ @js.native
      object right extends TopLevel[right with Double]
      
      /* 4 */ @js.native
      object straight extends TopLevel[straight with Double]
      
      /* 10 */ @js.native
      object unknown extends TopLevel[unknown with Double]
      
      /* 5 */ @js.native
      object uturnLeft extends TopLevel[uturnLeft with Double]
      
      /* 9 */ @js.native
      object uturnRight extends TopLevel[uturnRight with Double]
      
    }
    
  }
  
}

