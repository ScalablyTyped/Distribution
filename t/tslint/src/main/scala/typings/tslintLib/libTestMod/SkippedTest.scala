package typings
package tslintLib.libTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkippedTest extends js.Object {
  var requirement: java.lang.String
  var skipped: tslintLib.tslintLibNumbers.`true`
}

object SkippedTest {
  @scala.inline
  def apply(requirement: java.lang.String, skipped: tslintLib.tslintLibNumbers.`true`): SkippedTest = {
    val __obj = js.Dynamic.literal(requirement = requirement, skipped = skipped)
  
    __obj.asInstanceOf[SkippedTest]
  }
}

