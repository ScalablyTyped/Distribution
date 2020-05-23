package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Test extends js.Object {
  var test: js.Any
  var train: js.Any
}

object Test {
  @scala.inline
  def apply(test: js.Any, train: js.Any): Test = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], train = train.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
}

