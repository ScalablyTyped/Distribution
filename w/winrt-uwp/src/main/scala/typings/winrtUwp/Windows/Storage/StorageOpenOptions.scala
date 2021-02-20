package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StorageOpenOptions extends StObject
/** Provides options to use when opening a file. */
@JSGlobal("Windows.Storage.StorageOpenOptions")
@js.native
object StorageOpenOptions extends StObject {
  
  /** Only allow the file to be read. */
  @js.native
  sealed trait allowOnlyReaders extends StorageOpenOptions
  
  /** No options are specified. */
  @js.native
  sealed trait none extends StorageOpenOptions
}
