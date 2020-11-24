package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamedBatch[T] extends js.Object {
  
  var continuationToken: String = js.native
  
  var isLastBatch: Boolean = js.native
  
  var nextLink: String = js.native
  
  var values: js.Array[T] = js.native
}
object StreamedBatch {
  
  @scala.inline
  def apply[T](continuationToken: String, isLastBatch: Boolean, nextLink: String, values: js.Array[T]): StreamedBatch[T] = {
    val __obj = js.Dynamic.literal(continuationToken = continuationToken.asInstanceOf[js.Any], isLastBatch = isLastBatch.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamedBatch[T]]
  }
  
  @scala.inline
  implicit class StreamedBatchOps[Self <: StreamedBatch[_], T] (val x: Self with StreamedBatch[T]) extends AnyVal {
    
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
    def setContinuationToken(value: String): Self = this.set("continuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLastBatch(value: Boolean): Self = this.set("isLastBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: T*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[T]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
