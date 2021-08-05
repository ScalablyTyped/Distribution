package typings.usePosition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accuracy extends StObject {
    
    var accuracy: js.UndefOr[Double] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var latitude: js.UndefOr[Double] = js.undefined
    
    var longitude: js.UndefOr[Double] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object Accuracy {
    
    inline def apply(): Accuracy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accuracy]
    }
    
    extension [Self <: Accuracy](x: Self) {
      
      inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
