package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buckets extends StObject {
  
  var buckets: Double
  
  var granularity: js.UndefOr[js.Any] = js.undefined
  
  var groupBy: js.Any
  
  var output: js.UndefOr[js.Object] = js.undefined
}
object Buckets {
  
  @scala.inline
  def apply(buckets: Double, groupBy: js.Any): Buckets = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buckets]
  }
  
  @scala.inline
  implicit class BucketsMutableBuilder[Self <: Buckets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: Double): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularity(value: js.Any): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setGroupBy(value: js.Any): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: js.Object): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
