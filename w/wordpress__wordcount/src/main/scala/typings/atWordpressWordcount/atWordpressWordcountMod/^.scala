package typings.atWordpressWordcount.atWordpressWordcountMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/wordcount", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def count(text: String, `type`: CountType): Double = js.native
  def count(text: String, `type`: CountType, userSettings: Partial[Settings]): Double = js.native
}

