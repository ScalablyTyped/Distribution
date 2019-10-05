package typings.winrt.Windows.Storage

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
  
  /* 2 */ val failIfExists: typings.winrt.Windows.Storage.CreationCollisionOption.failIfExists with Double = js.native
  /* 0 */ val generateUniqueName: typings.winrt.Windows.Storage.CreationCollisionOption.generateUniqueName with Double = js.native
  /* 3 */ val openIfExists: typings.winrt.Windows.Storage.CreationCollisionOption.openIfExists with Double = js.native
  /* 1 */ val replaceExisting: typings.winrt.Windows.Storage.CreationCollisionOption.replaceExisting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CreationCollisionOption with Double] = js.native
}

