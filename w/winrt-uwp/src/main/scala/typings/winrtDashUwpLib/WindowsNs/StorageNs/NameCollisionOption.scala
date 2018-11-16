package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NameCollisionOption extends js.Object

/** Specifies what to do if a file or folder with the specified name already exists in the current folder when you copy, move, or rename a file or folder. */
@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends js.Object {
  /** Raise an exception of type System.Exception if the file or folder already exists. */
  @js.native
  sealed trait failIfExists
    extends winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption
  
  /** Automatically append a number to the base of the specified name if the file or folder already exists. */
  @js.native
  sealed trait generateUniqueName
    extends winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption
  
  /** Replace the existing item if the file or folder already exists. */
  @js.native
  sealed trait replaceExisting
    extends winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption
  
  val failIfExists: failIfExists with java.lang.String = js.native
  val generateUniqueName: generateUniqueName with java.lang.String = js.native
  val replaceExisting: replaceExisting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption with java.lang.String] = js.native
}

