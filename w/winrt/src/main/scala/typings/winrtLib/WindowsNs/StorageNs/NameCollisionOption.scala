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
  
  val failIfExists: failIfExists with java.lang.String = js.native
  val generateUniqueName: generateUniqueName with java.lang.String = js.native
  val replaceExisting: replaceExisting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.NameCollisionOption with java.lang.String] = js.native
}

