package typings.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buckets extends js.Object {
  
  var buckets: Double = js.native
  
  var granularity: js.UndefOr[js.Any] = js.native
  
  var groupBy: js.Any = js.native
  
  var output: js.UndefOr[js.Object] = js.native
}
object Buckets {
  
  @scala.inline
  def apply(buckets: Double, groupBy: js.Any): Buckets = {
    val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buckets]
  }
  
  @scala.inline
  implicit class BucketsOps[Self <: Buckets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuckets(value: Double): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: js.Any): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularity(value: js.Any): Self = this.set("granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Object): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
