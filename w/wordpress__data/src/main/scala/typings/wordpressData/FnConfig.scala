package typings.wordpressData

import typings.wordpressData.mod.StoreConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnConfig extends js.Object {
  def apply[T](key: String, config: StoreConfig[T]): Unit = js.native
}

