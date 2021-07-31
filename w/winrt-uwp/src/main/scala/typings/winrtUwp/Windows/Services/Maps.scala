package typings.winrtUwp.Windows.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Services.Maps namespace contains classes that provide location, routing, and geocoding services. */
object Maps {
  
  /** Provides APIs for turn-by-turn guided navigation. */
  object Guidance {
    
    @js.native
    sealed trait GuidanceLaneMarkers extends StObject
    /** Specifies the path of the lane. */
    @JSGlobal("Windows.Services.Maps.Guidance.GuidanceLaneMarkers")
    @js.native
    object GuidanceLaneMarkers extends StObject {
      
      /** A hard left turn marker. */
      @js.native
      sealed trait hardLeft
        extends StObject
           with GuidanceLaneMarkers
      
      /** A hard right turn marker. */
      @js.native
      sealed trait hardRight
        extends StObject
           with GuidanceLaneMarkers
      
      /** A left turn marker. */
      @js.native
      sealed trait left
        extends StObject
           with GuidanceLaneMarkers
      
      /** A light left turn marker. */
      @js.native
      sealed trait lightLeft
        extends StObject
           with GuidanceLaneMarkers
      
      /** A light right turn marker. */
      @js.native
      sealed trait lightRight
        extends StObject
           with GuidanceLaneMarkers
      
      /** No lane markers are present. */
      @js.native
      sealed trait none
        extends StObject
           with GuidanceLaneMarkers
      
      /** A right turn marker. */
      @js.native
      sealed trait right
        extends StObject
           with GuidanceLaneMarkers
      
      /** A go straight marker. */
      @js.native
      sealed trait straight
        extends StObject
           with GuidanceLaneMarkers
      
      /** No lane marker information is available. */
      @js.native
      sealed trait unknown
        extends StObject
           with GuidanceLaneMarkers
      
      /** A left U-turn marker. */
      @js.native
      sealed trait uturnLeft
        extends StObject
           with GuidanceLaneMarkers
      
      /** A right U-turn marker. */
      @js.native
      sealed trait uturnRight
        extends StObject
           with GuidanceLaneMarkers
    }
  }
}
