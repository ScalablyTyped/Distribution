package typings.winrtUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an enterprise protected file. */
@js.native
trait FileProtectionInfo extends StObject {
  
  /** The enterprise identity of the enterprise protected file. */
  var identity: String = js.native
  
  /** Specifies if the protection of the enterprise protected file can be roamed to other devices. */
  var isRoamable: Boolean = js.native
  
  /** The protection status of the enterprise protected file. */
  var status: FileProtectionStatus = js.native
}
object FileProtectionInfo {
  
  @scala.inline
  def apply(identity: String, isRoamable: Boolean, status: FileProtectionStatus): FileProtectionInfo = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isRoamable = isRoamable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProtectionInfo]
  }
  
  @scala.inline
  implicit class FileProtectionInfoMutableBuilder[Self <: FileProtectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoamable(value: Boolean): Self = StObject.set(x, "isRoamable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FileProtectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
