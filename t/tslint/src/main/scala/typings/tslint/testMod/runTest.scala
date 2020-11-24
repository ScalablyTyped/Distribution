package typings.tslint.testMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/test", "runTest")
@js.native
object runTest extends js.Object {
  
  def apply(testDirectory: String): TestResult = js.native
  def apply(testDirectory: String, rulesDirectory: String): TestResult = js.native
  def apply(testDirectory: String, rulesDirectory: js.Array[String]): TestResult = js.native
}
