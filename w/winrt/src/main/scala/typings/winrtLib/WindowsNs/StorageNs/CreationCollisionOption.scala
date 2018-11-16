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
  
  val failIfExists: failIfExists with java.lang.String = js.native
  val generateUniqueName: generateUniqueName with java.lang.String = js.native
  val openIfExists: openIfExists with java.lang.String = js.native
  val replaceExisting: replaceExisting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.CreationCollisionOption with java.lang.String] = js.native
}

