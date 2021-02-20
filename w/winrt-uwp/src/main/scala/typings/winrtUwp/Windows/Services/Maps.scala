package typings.winrtUwp.Windows.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
