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
  
  val failIfExists: failIfExists with java.lang.String = js.native
  val generateUniqueName: generateUniqueName with java.lang.String = js.native
  val openIfExists: openIfExists with java.lang.String = js.native
  val replaceExisting: replaceExisting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption with java.lang.String
  ] = js.native
}

