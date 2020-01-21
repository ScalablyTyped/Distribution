package typings.validDataUrl

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("valid-data-url", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var regex: RegExp = js.native
  def apply(candidate: String): Boolean = js.native
}

