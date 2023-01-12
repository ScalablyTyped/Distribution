package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Timeslice. */
trait Timeslice extends StObject {
  
  /** Used to indicate that anomaly detection should be performed. Anomaly detection is used to locate unusual datapoints within a time series. */
  var anomaly: js.UndefOr[Boolean] = js.undefined
  
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
  
  /** Interval of the aggregation. Valid date interval values are second/seconds minute/minutes, hour/hours, day/days, week/weeks, month/months, and year/years. */
  var interval: js.UndefOr[String] = js.undefined
}
object Timeslice {
  
  inline def apply(): Timeslice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeslice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timeslice] (val x: Self) extends AnyVal {
    
    inline def setAnomaly(value: Boolean): Self = StObject.set(x, "anomaly", value.asInstanceOf[js.Any])
    
    inline def setAnomalyUndefined: Self = StObject.set(x, "anomaly", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
