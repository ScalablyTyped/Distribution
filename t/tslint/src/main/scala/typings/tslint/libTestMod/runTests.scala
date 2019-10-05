package typings.tslint.libTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/test", "runTests")
@js.native
object runTests extends js.Object {
  def apply(patterns: js.Array[String]): js.Array[TestResult] = js.native
  def apply(patterns: js.Array[String], rulesDirectory: String): js.Array[TestResult] = js.native
  def apply(patterns: js.Array[String], rulesDirectory: js.Array[String]): js.Array[TestResult] = js.native
}

