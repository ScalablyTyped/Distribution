package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Test extends js.Object {
  var test: js.Any
  var train: js.Any
}

object Anon_Test {
  @scala.inline
  def apply(test: js.Any, train: js.Any): Anon_Test = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("test")(test)
    __obj.updateDynamic("train")(train)
    __obj.asInstanceOf[Anon_Test]
  }
}

