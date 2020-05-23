package typings.wordpressData.mod

import typings.wordpressData.anon.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "plugins")
@js.native
object plugins extends js.Object {
  var persistence: Plugin[Storage] = js.native
}

