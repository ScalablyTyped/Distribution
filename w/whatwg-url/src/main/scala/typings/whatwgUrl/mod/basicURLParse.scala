package typings.whatwgUrl.mod

import typings.whatwgUrl.anon.EncodingOverride
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url", "basicURLParse")
@js.native
object basicURLParse extends js.Object {
  def apply(input: String): URLRecord | Null = js.native
  def apply(input: String, options: EncodingOverride): URLRecord | Null = js.native
}

