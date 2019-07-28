package typings.yadda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofScenarioLevelPlugin extends js.Object {
  def init(options: js.Any): Unit
}

object TypeofScenarioLevelPlugin {
  @scala.inline
  def apply(init: js.Any => Unit): TypeofScenarioLevelPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
  
    __obj.asInstanceOf[TypeofScenarioLevelPlugin]
  }
}

