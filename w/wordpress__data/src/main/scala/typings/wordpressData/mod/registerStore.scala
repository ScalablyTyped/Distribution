package typings.wordpressData.mod

import typings.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/data", "registerStore")
@js.native
object registerStore extends js.Object {
  
  def apply[T](key: String, config: StoreConfig[T]): Store[T, AnyAction] = js.native
}
