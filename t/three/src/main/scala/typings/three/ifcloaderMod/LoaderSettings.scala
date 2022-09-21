package typings.three.ifcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderSettings extends StObject {
  
  var CIRCLE_SEGMENTS_HIGH: js.UndefOr[Double] = js.undefined
  
  var CIRCLE_SEGMENTS_LOW: js.UndefOr[Double] = js.undefined
  
  var CIRCLE_SEGMENTS_MEDIUM: js.UndefOr[Double] = js.undefined
  
  var COORDINATE_TO_ORIGIN: Boolean
  
  var USE_FAST_BOOLS: Boolean
}
object LoaderSettings {
  
  inline def apply(COORDINATE_TO_ORIGIN: Boolean, USE_FAST_BOOLS: Boolean): LoaderSettings = {
    val __obj = js.Dynamic.literal(COORDINATE_TO_ORIGIN = COORDINATE_TO_ORIGIN.asInstanceOf[js.Any], USE_FAST_BOOLS = USE_FAST_BOOLS.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderSettings]
  }
  
  extension [Self <: LoaderSettings](x: Self) {
    
    inline def setCIRCLE_SEGMENTS_HIGH(value: Double): Self = StObject.set(x, "CIRCLE_SEGMENTS_HIGH", value.asInstanceOf[js.Any])
    
    inline def setCIRCLE_SEGMENTS_HIGHUndefined: Self = StObject.set(x, "CIRCLE_SEGMENTS_HIGH", js.undefined)
    
    inline def setCIRCLE_SEGMENTS_LOW(value: Double): Self = StObject.set(x, "CIRCLE_SEGMENTS_LOW", value.asInstanceOf[js.Any])
    
    inline def setCIRCLE_SEGMENTS_LOWUndefined: Self = StObject.set(x, "CIRCLE_SEGMENTS_LOW", js.undefined)
    
    inline def setCIRCLE_SEGMENTS_MEDIUM(value: Double): Self = StObject.set(x, "CIRCLE_SEGMENTS_MEDIUM", value.asInstanceOf[js.Any])
    
    inline def setCIRCLE_SEGMENTS_MEDIUMUndefined: Self = StObject.set(x, "CIRCLE_SEGMENTS_MEDIUM", js.undefined)
    
    inline def setCOORDINATE_TO_ORIGIN(value: Boolean): Self = StObject.set(x, "COORDINATE_TO_ORIGIN", value.asInstanceOf[js.Any])
    
    inline def setUSE_FAST_BOOLS(value: Boolean): Self = StObject.set(x, "USE_FAST_BOOLS", value.asInstanceOf[js.Any])
  }
}
