package typings.usePersistedState

import typings.std.Pick
import typings.std.Storage
import typings.usePersistedState.usePersistedStateStrings.getItem
import typings.usePersistedState.usePersistedStateStrings.setItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-persisted-state", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(key: String): FnInitialState = js.native
  def default(key: String, provider: Pick[Storage, getItem | setItem]): FnInitialState = js.native
}

