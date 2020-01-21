package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a system condition that must be in effect for a background task to run. */
@JSGlobal("Windows.ApplicationModel.Background.SystemCondition")
@js.native
class SystemCondition protected () extends js.Object {
  /**
    * Initializes a new instance of a system condition.
    * @param conditionType Specifies the condition type.
    */
  def this(conditionType: SystemConditionType) = this()
  /** Gets the condition type of a system condition. */
  var conditionType: SystemConditionType = js.native
}

