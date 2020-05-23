package typings.winrtUwp.Windows.Services

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
      
    }
    
  }
  
}

