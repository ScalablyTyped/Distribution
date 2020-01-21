package typings.wordpressData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "registerStore")
@js.native
object registerStore extends js.Object {
  def apply[T](key: String, config: StoreConfig[T]): Unit = js.native
}

