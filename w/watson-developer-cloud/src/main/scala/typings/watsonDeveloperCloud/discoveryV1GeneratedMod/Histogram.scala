package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Histogram. */
trait Histogram extends StObject {
  
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
  
  /** Interval of the aggregation. (For 'histogram' type). */
  var interval: js.UndefOr[Double] = js.undefined
}
object Histogram {
  
  inline def apply(): Histogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Histogram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Histogram] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
