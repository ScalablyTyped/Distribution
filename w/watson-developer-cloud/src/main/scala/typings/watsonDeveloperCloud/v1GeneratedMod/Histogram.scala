package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Histogram. */
@js.native
trait Histogram extends StObject {
  
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.native
  
  /** Interval of the aggregation. (For 'histogram' type). */
  var interval: js.UndefOr[Double] = js.native
}
object Histogram {
  
  @scala.inline
  def apply(): Histogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Histogram]
  }
  
  @scala.inline
  implicit class HistogramMutableBuilder[Self <: Histogram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
