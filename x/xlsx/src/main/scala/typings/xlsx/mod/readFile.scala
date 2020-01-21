package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xlsx", "readFile")
@js.native
object readFile extends js.Object {
  def apply(filename: String): WorkBook = js.native
  def apply(filename: String, opts: ParsingOptions): WorkBook = js.native
}

