package typings.wordpressData.anon

import typings.wordpressData.mod.DataRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  var registry: DataRegistry
}

object Registry {
  @scala.inline
  def apply(registry: DataRegistry): Registry = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry]
  }
}

