package typings
package atUifabricStylingLib.libInterfacesIAnimationStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationVariables extends js.Object {
  var durationValue1: java.lang.String
  var durationValue2: java.lang.String
  var durationValue3: java.lang.String
  var durationValue4: java.lang.String
  var easeFunction1: java.lang.String
  var easeFunction2: java.lang.String
}

object IAnimationVariables {
  @scala.inline
  def apply(
    durationValue1: java.lang.String,
    durationValue2: java.lang.String,
    durationValue3: java.lang.String,
    durationValue4: java.lang.String,
    easeFunction1: java.lang.String,
    easeFunction2: java.lang.String
  ): IAnimationVariables = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("durationValue1")(durationValue1)
    __obj.updateDynamic("durationValue2")(durationValue2)
    __obj.updateDynamic("durationValue3")(durationValue3)
    __obj.updateDynamic("durationValue4")(durationValue4)
    __obj.updateDynamic("easeFunction1")(easeFunction1)
    __obj.updateDynamic("easeFunction2")(easeFunction2)
    __obj.asInstanceOf[IAnimationVariables]
  }
}

