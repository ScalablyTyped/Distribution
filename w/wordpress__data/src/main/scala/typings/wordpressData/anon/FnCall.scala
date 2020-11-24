package typings.wordpressData.anon

import typings.redux.mod.AnyAction
import typings.wordpressData.mod.Store
import typings.wordpressData.mod.StoreConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = js.native
}
