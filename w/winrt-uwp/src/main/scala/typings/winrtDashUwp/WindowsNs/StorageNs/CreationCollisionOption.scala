package typings.winrtDashUwp.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CreationCollisionOption extends js.Object

/** Specifies what to do if a file or folder with the specified name already exists in the current folder when you create a new file or folder. */
@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends js.Object {
  /** Raise an exception of type System.Exception if the file or folder already exists. */
  @js.native
  sealed trait failIfExists extends CreationCollisionOption
  
  /** Automatically append a number to the base of the specified name if the file or folder already exists. */
  @js.native
  sealed trait generateUniqueName extends CreationCollisionOption
  
  /** Return the existing item if the file or folder already exists. */
  @js.native
  sealed trait openIfExists extends CreationCollisionOption
  
  /** Replace the existing item if the file or folder already exists. */
  @js.native
  sealed trait replaceExisting extends CreationCollisionOption
  
  /* 2 */ val failIfExists: typings.winrtDashUwp.WindowsNs.StorageNs.CreationCollisionOption.failIfExists with Double = js.native
  /* 0 */ val generateUniqueName: typings.winrtDashUwp.WindowsNs.StorageNs.CreationCollisionOption.generateUniqueName with Double = js.native
  /* 3 */ val openIfExists: typings.winrtDashUwp.WindowsNs.StorageNs.CreationCollisionOption.openIfExists with Double = js.native
  /* 1 */ val replaceExisting: typings.winrtDashUwp.WindowsNs.StorageNs.CreationCollisionOption.replaceExisting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CreationCollisionOption with Double] = js.native
}

