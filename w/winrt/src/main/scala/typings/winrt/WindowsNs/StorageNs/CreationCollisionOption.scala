package typings.winrt.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CreationCollisionOption extends js.Object

@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends js.Object {
  @js.native
  sealed trait failIfExists extends CreationCollisionOption
  
  @js.native
  sealed trait generateUniqueName extends CreationCollisionOption
  
  @js.native
  sealed trait openIfExists extends CreationCollisionOption
  
  @js.native
  sealed trait replaceExisting extends CreationCollisionOption
  
  /* 2 */ val failIfExists: typings.winrt.WindowsNs.StorageNs.CreationCollisionOption.failIfExists with Double = js.native
  /* 0 */ val generateUniqueName: typings.winrt.WindowsNs.StorageNs.CreationCollisionOption.generateUniqueName with Double = js.native
  /* 3 */ val openIfExists: typings.winrt.WindowsNs.StorageNs.CreationCollisionOption.openIfExists with Double = js.native
  /* 1 */ val replaceExisting: typings.winrt.WindowsNs.StorageNs.CreationCollisionOption.replaceExisting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CreationCollisionOption with Double] = js.native
}

