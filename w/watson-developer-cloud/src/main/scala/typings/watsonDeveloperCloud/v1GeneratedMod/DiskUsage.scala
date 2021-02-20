package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Summary of the disk usage statistics for the environment. */
@js.native
trait DiskUsage extends StObject {
  
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
  implicit class DiskUsageMutableBuilder[Self <: DiskUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum_allowed_bytes(value: Double): Self = StObject.set(x, "maximum_allowed_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum_allowed_bytesUndefined: Self = StObject.set(x, "maximum_allowed_bytes", js.undefined)
    
    @scala.inline
    def setUsed_bytes(value: Double): Self = StObject.set(x, "used_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsed_bytesUndefined: Self = StObject.set(x, "used_bytes", js.undefined)
  }
}
