package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document counts. */
@js.native
trait DocCounts extends js.Object {
  
  /** Number of documents not successfully processed. */
  var failed: js.UndefOr[Double] = js.native
  
  /** Number of pending documents. */
  var pending: js.UndefOr[Double] = js.native
  
  /** Number of documents successfully processed. */
  var successful: js.UndefOr[Double] = js.native
  
  /** Total number of documents. */
  var total: js.UndefOr[Double] = js.native
}
object DocCounts {
  
  @scala.inline
  def apply(): DocCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocCounts]
  }
  
  @scala.inline
  implicit class DocCountsOps[Self <: DocCounts] (val x: Self) extends AnyVal {
    
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
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    
    @scala.inline
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
    
    @scala.inline
    def setSuccessful(value: Double): Self = this.set("successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessful: Self = this.set("successful", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
