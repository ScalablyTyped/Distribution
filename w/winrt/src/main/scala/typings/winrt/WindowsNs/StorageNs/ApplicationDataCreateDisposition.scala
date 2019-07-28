package typings.winrt.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataCreateDisposition extends js.Object

@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends js.Object {
  @js.native
  sealed trait always extends ApplicationDataCreateDisposition
  
  @js.native
  sealed trait existing extends ApplicationDataCreateDisposition
  
  /* 0 */ val always: typings.winrt.WindowsNs.StorageNs.ApplicationDataCreateDisposition.always with Double = js.native
  /* 1 */ val existing: typings.winrt.WindowsNs.StorageNs.ApplicationDataCreateDisposition.existing with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationDataCreateDisposition with Double] = js.native
}

