package typings
package sweetalertLib.typingsModulesStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwalState extends js.Object {
  var actions: org.scalablytyped.runtime.StringDictionary[sweetalertLib.Anon_CloseModal]
  var isOpen: scala.Boolean
  var promise: sweetalertLib.Anon_Reject
  var timer: scala.Double
}

object SwalState {
  @scala.inline
  def apply(
    actions: org.scalablytyped.runtime.StringDictionary[sweetalertLib.Anon_CloseModal],
    isOpen: scala.Boolean,
    promise: sweetalertLib.Anon_Reject,
    timer: scala.Double
  ): SwalState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("isOpen")(isOpen)
    __obj.updateDynamic("promise")(promise)
    __obj.updateDynamic("timer")(timer)
    __obj.asInstanceOf[SwalState]
  }
}

