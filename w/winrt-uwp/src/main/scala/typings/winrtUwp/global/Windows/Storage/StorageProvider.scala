package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains info about the service that stores files and folders. Files and folders may be stored either by the local file system or by a remote service like Microsoft OneDrive. */
/* note: abstract class */ @JSGlobal("Windows.Storage.StorageProvider")
@js.native
open class StorageProvider ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.StorageProvider {
  
  /** Gets a user-friendly name for the current provider of files and folders. */
  /* CompleteClass */
  var displayName: String = js.native
  
  /** Gets an identifier for the current provider of files and folders. */
  /* CompleteClass */
  var id: String = js.native
}
