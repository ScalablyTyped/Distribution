package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICandleData
  extends StObject
     with ISeriesData {
  
  var close: js.Array[Double]
  
  var high: js.Array[Double]
  
  var low: js.Array[Double]
  
  var open: js.Array[Double]
}
object ICandleData {
  
  inline def apply(
    close: js.Array[Double],
    high: js.Array[Double],
    labels: js.Array[String],
    low: js.Array[Double],
    open: js.Array[Double],
    source: js.Any,
    values: js.Array[Double]
  ): ICandleData = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICandleData]
  }
  
  extension [Self <: ICandleData](x: Self) {
    
    inline def setClose(value: js.Array[Double]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseVarargs(value: Double*): Self = StObject.set(x, "close", js.Array(value :_*))
    
    inline def setHigh(value: js.Array[Double]): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighVarargs(value: Double*): Self = StObject.set(x, "high", js.Array(value :_*))
    
    inline def setLow(value: js.Array[Double]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowVarargs(value: Double*): Self = StObject.set(x, "low", js.Array(value :_*))
    
    inline def setOpen(value: js.Array[Double]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenVarargs(value: Double*): Self = StObject.set(x, "open", js.Array(value :_*))
  }
}
