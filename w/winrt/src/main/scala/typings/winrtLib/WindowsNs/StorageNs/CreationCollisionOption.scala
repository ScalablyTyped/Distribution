package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CreationCollisionOption extends js.Object

@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends js.Object {
  @js.native
  sealed trait failIfExists
    extends winrtLib.WindowsNs.StorageNs.CreationCollisionOption
  
  @js.native
  sealed trait generateUniqueName
    extends winrtLib.WindowsNs.StorageNs.CreationCollisionOption
  
  @js.native
  sealed trait openIfExists
    extends winrtLib.WindowsNs.StorageNs.CreationCollisionOption
  
  @js.native
  sealed trait replaceExisting
    extends winrtLib.WindowsNs.StorageNs.CreationCollisionOption
  
  /* 2 */ val failIfExists: failIfExists with scala.Double = js.native
  /* 0 */ val generateUniqueName: generateUniqueName with scala.Double = js.native
  /* 3 */ val openIfExists: openIfExists with scala.Double = js.native
  /* 1 */ val replaceExisting: replaceExisting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.CreationCollisionOption with scala.Double] = js.native
}

