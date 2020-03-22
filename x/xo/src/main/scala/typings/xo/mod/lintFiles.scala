package typings.xo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xo", "lintFiles")
@js.native
object lintFiles extends js.Object {
  def apply(patterns: String): ResultReport | js.Promise[ResultReport] = js.native
  def apply(patterns: String, options: Options): ResultReport | js.Promise[ResultReport] = js.native
  def apply(patterns: js.Array[String]): ResultReport | js.Promise[ResultReport] = js.native
  def apply(patterns: js.Array[String], options: Options): ResultReport | js.Promise[ResultReport] = js.native
}

