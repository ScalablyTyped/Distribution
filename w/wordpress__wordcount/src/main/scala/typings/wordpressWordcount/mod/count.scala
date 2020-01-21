package typings.wordpressWordcount.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/wordcount", "count")
@js.native
object count extends js.Object {
  def apply(text: String, `type`: CountType): Double = js.native
  def apply(text: String, `type`: CountType, userSettings: Partial[Settings]): Double = js.native
}

