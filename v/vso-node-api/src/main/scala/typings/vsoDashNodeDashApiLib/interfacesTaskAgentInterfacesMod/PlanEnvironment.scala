package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanEnvironment extends js.Object {
  var mask: js.Array[MaskHint]
  var options: org.scalablytyped.runtime.StringDictionary[JobOption]
  var variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object PlanEnvironment {
  @scala.inline
  def apply(
    mask: js.Array[MaskHint],
    options: org.scalablytyped.runtime.StringDictionary[JobOption],
    variables: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): PlanEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mask")(mask)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[PlanEnvironment]
  }
}

