package typings.uapiJson.airMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSegmentsParams extends StObject {
  
  var pnr: String
  
  var reservationLocatorCode: js.UndefOr[String] = js.undefined
  
  var segments: js.Array[Segment]
  
  var universalRecordLocatorCode: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object AddSegmentsParams {
  
  inline def apply(pnr: String, segments: js.Array[Segment]): AddSegmentsParams = {
    val __obj = js.Dynamic.literal(pnr = pnr.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSegmentsParams]
  }
  
  extension [Self <: AddSegmentsParams](x: Self) {
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
    
    inline def setReservationLocatorCode(value: String): Self = StObject.set(x, "reservationLocatorCode", value.asInstanceOf[js.Any])
    
    inline def setReservationLocatorCodeUndefined: Self = StObject.set(x, "reservationLocatorCode", js.undefined)
    
    inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setUniversalRecordLocatorCode(value: String): Self = StObject.set(x, "universalRecordLocatorCode", value.asInstanceOf[js.Any])
    
    inline def setUniversalRecordLocatorCodeUndefined: Self = StObject.set(x, "universalRecordLocatorCode", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
