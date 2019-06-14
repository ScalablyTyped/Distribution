package typings
package winrtDashUwpLib.WindowsNs.StorageNs

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
  sealed trait failIfExists
    extends winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  
  /** Automatically append a number to the base of the specified name if the file or folder already exists. */
  @js.native
  sealed trait generateUniqueName
    extends winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  
  /** Return the existing item if the file or folder already exists. */
  @js.native
  sealed trait openIfExists
    extends winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  
  /** Replace the existing item if the file or folder already exists. */
  @js.native
  sealed trait replaceExisting
    extends winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  
  /* 2 */ val failIfExists: failIfExists with scala.Double = js.native
  /* 0 */ val generateUniqueName: generateUniqueName with scala.Double = js.native
  /* 3 */ val openIfExists: openIfExists with scala.Double = js.native
  /* 1 */ val replaceExisting: replaceExisting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption with scala.Double] = js.native
}

