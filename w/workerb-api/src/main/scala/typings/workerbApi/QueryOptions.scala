package typings.workerbApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptions extends js.Object {
  
  /**
    *  A number number which specifies how many times the script runner will try to find the target element. The default value is 10.
    */
  var numberOfTries: js.UndefOr[Double] = js.native
  
  /**
    *  A number which specifies after how many milliseconds the runtime will try to find the target element. The default value is 200.
    */
  var retryDuration: js.UndefOr[Double] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
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
    def setNumberOfTries(value: Double): Self = this.set("numberOfTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfTries: Self = this.set("numberOfTries", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Double): Self = this.set("retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDuration: Self = this.set("retryDuration", js.undefined)
  }
}
