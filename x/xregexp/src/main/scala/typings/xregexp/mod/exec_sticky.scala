package typings.xregexp.mod

import typings.std.RegExp
import typings.xregexp.xregexpStrings.sticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "exec")
@js.native
object exec_sticky extends js.Object {
  def apply(str: String, regex: RegExp, pos: Double, sticky: sticky): ExecArray | Null = js.native
}

