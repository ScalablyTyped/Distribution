package typings.useragent.mod

import typings.useragent.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "fromJSON")
@js.native
object fromJSON extends js.Object {
  def apply(obj: String): Agent = js.native
  def apply(obj: Major): Agent = js.native
}

