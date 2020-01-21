package typings.wordpressData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "use")
@js.native
object use extends js.Object {
  def apply[T](plugin: Plugin[T], options: T): DataRegistry = js.native
}

