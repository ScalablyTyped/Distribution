package typings.winrtUwp.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Structure that determines version and counts of resources returned for the app package. */
@js.native
trait ResourceLayoutInfo extends js.Object {
  
  /** Framework-generated checksum. */
  var checksum: Double = js.native
  
  /** Major version of resources to be returned. */
  var majorVersion: Double = js.native
  
  /** Minor version of resources to be returned. */
  var minorVersion: Double = js.native
  
  /** Number of named resources to be returned. */
  var namedResourceCount: Double = js.native
  
  /** Number of resource subtrees to be returned. */
  var resourceSubtreeCount: Double = js.native
}
object ResourceLayoutInfo {
  
  @scala.inline
  def apply(
    checksum: Double,
    majorVersion: Double,
    minorVersion: Double,
    namedResourceCount: Double,
    resourceSubtreeCount: Double
  ): ResourceLayoutInfo = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], namedResourceCount = namedResourceCount.asInstanceOf[js.Any], resourceSubtreeCount = resourceSubtreeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLayoutInfo]
  }
  
  @scala.inline
  implicit class ResourceLayoutInfoOps[Self <: ResourceLayoutInfo] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: Double): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorVersion(value: Double): Self = this.set("majorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("minorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedResourceCount(value: Double): Self = this.set("namedResourceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSubtreeCount(value: Double): Self = this.set("resourceSubtreeCount", value.asInstanceOf[js.Any])
  }
}
