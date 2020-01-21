package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorageItemTypes extends js.Object

/** Describes whether an item that implements the IStorageItem interface is a file or a folder. */
@JSGlobal("Windows.Storage.StorageItemTypes")
@js.native
object StorageItemTypes extends js.Object {
  /** A file that is represented as a StorageFile instance. */
  @js.native
  sealed trait file extends StorageItemTypes
  
  /** A folder that is represented as a StorageFolder instance. */
  @js.native
  sealed trait folder extends StorageItemTypes
  
  /** A storage item that is neither a file nor a folder. */
  @js.native
  sealed trait none extends StorageItemTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorageItemTypes with Double] = js.native
  /* 1 */ @js.native
  object file extends TopLevel[file with Double]
  
  /* 2 */ @js.native
  object folder extends TopLevel[folder with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

