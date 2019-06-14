package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NameCollisionOption extends js.Object

@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends js.Object {
  @js.native
  sealed trait failIfExists
    extends winrtLib.WindowsNs.StorageNs.NameCollisionOption
  
  @js.native
  sealed trait generateUniqueName
    extends winrtLib.WindowsNs.StorageNs.NameCollisionOption
  
  @js.native
  sealed trait replaceExisting
    extends winrtLib.WindowsNs.StorageNs.NameCollisionOption
  
  /* 2 */ val failIfExists: failIfExists with scala.Double = js.native
  /* 0 */ val generateUniqueName: generateUniqueName with scala.Double = js.native
  /* 1 */ val replaceExisting: replaceExisting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.NameCollisionOption with scala.Double] = js.native
}

