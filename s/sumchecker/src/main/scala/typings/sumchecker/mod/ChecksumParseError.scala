package typings.sumchecker.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sumchecker", "ChecksumParseError")
@js.native
class ChecksumParseError protected () extends Error {
  def this(lineNumber: Double, line: String) = this()
}

