package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NameCollisionOption extends js.Object

@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends js.Object {
  @js.native
  sealed trait failIfExists extends NameCollisionOption
  
  @js.native
  sealed trait generateUniqueName extends NameCollisionOption
  
  @js.native
  sealed trait replaceExisting extends NameCollisionOption
  
  /* 2 */ val failIfExists: typings.winrt.Windows.Storage.NameCollisionOption.failIfExists with Double = js.native
  /* 0 */ val generateUniqueName: typings.winrt.Windows.Storage.NameCollisionOption.generateUniqueName with Double = js.native
  /* 1 */ val replaceExisting: typings.winrt.Windows.Storage.NameCollisionOption.replaceExisting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NameCollisionOption with Double] = js.native
}

