package typings.swaggerStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucketcurrent extends js.Object {
  
  var bucket_current: Double = js.native
  
  var bucket_duration: Double = js.native
  
  var length: Double = js.native
}
object Bucketcurrent {
  
  @scala.inline
  def apply(bucket_current: Double, bucket_duration: Double, length: Double): Bucketcurrent = {
    val __obj = js.Dynamic.literal(bucket_current = bucket_current.asInstanceOf[js.Any], bucket_duration = bucket_duration.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucketcurrent]
  }
  
  @scala.inline
  implicit class BucketcurrentOps[Self <: Bucketcurrent] (val x: Self) extends AnyVal {
    
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
    def setBucket_current(value: Double): Self = this.set("bucket_current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket_duration(value: Double): Self = this.set("bucket_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
