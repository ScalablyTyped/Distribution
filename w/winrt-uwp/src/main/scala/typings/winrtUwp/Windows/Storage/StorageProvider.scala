package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains info about the service that stores files and folders. Files and folders may be stored either by the local file system or by a remote service like Microsoft OneDrive. */
@js.native
trait StorageProvider extends StObject {
  
  /** Gets a user-friendly name for the current provider of files and folders. */
  var displayName: String = js.native
  
  /** Gets an identifier for the current provider of files and folders. */
  var id: String = js.native
}
object StorageProvider {
  
  @scala.inline
  def apply(displayName: String, id: String): StorageProvider = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageProvider]
  }
  
  @scala.inline
  implicit class StorageProviderMutableBuilder[Self <: StorageProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
