package typings.webpackBlocksCore

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTest extends js.Object {
  var test: RegExp | js.Array[RegExp]
}

object AnonTest {
  @scala.inline
  def apply(test: RegExp | js.Array[RegExp]): AnonTest = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTest]
  }
}

