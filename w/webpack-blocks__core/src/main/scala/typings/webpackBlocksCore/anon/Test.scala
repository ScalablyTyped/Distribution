package typings.webpackBlocksCore.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends js.Object {
  var test: RegExp | js.Array[RegExp]
}

object Test {
  @scala.inline
  def apply(test: RegExp | js.Array[RegExp]): Test = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}

