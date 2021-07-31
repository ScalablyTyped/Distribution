package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageItemTypes extends StObject
/** Describes whether an item that implements the IStorageItem interface is a file or a folder. */
@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends StObject {
  
  /** A file that is represented as a StorageFile instance. */
  @js.native
  sealed trait file
    extends StObject
       with StorageItemTypes
  
  /** A folder that is represented as a StorageFolder instance. */
  @js.native
  sealed trait folder
    extends StObject
       with StorageItemTypes
  
  /** A storage item that is neither a file nor a folder. */
  @js.native
  sealed trait none
    extends StObject
       with StorageItemTypes
}
