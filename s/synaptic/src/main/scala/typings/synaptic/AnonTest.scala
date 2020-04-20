package typings.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTest extends js.Object {
  var test: js.Any
  var train: js.Any
}

object AnonTest {
  @scala.inline
  def apply(test: js.Any, train: js.Any): AnonTest = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], train = train.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTest]
  }
}

