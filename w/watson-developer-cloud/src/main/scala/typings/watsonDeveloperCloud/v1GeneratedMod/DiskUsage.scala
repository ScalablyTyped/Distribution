package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Summary of the disk usage statistics for the environment. */
@js.native
trait DiskUsage extends js.Object {
  
  /** Total number of bytes available in the environment's disk capacity. */
  var maximum_allowed_bytes: js.UndefOr[Double] = js.native
  
  /** Number of bytes within the environment's disk capacity that are currently used to store data. */
  var used_bytes: js.UndefOr[Double] = js.native
}
object DiskUsage {
  
  @scala.inline
  def apply(): DiskUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskUsage]
  }
  
  @scala.inline
  implicit class DiskUsageOps[Self <: DiskUsage] (val x: Self) extends AnyVal {
    
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
    def setMaximum_allowed_bytes(value: Double): Self = this.set("maximum_allowed_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum_allowed_bytes: Self = this.set("maximum_allowed_bytes", js.undefined)
    
    @scala.inline
    def setUsed_bytes(value: Double): Self = this.set("used_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsed_bytes: Self = this.set("used_bytes", js.undefined)
  }
}
