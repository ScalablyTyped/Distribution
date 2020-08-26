package typings.uifabricStyling.ianimationstylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimationVariables extends js.Object {
  var durationValue1: String = js.native
  var durationValue2: String = js.native
  var durationValue3: String = js.native
  var durationValue4: String = js.native
  var easeFunction1: String = js.native
  var easeFunction2: String = js.native
}

object IAnimationVariables {
  @scala.inline
  def apply(
    durationValue1: String,
    durationValue2: String,
    durationValue3: String,
    durationValue4: String,
    easeFunction1: String,
    easeFunction2: String
  ): IAnimationVariables = {
    val __obj = js.Dynamic.literal(durationValue1 = durationValue1.asInstanceOf[js.Any], durationValue2 = durationValue2.asInstanceOf[js.Any], durationValue3 = durationValue3.asInstanceOf[js.Any], durationValue4 = durationValue4.asInstanceOf[js.Any], easeFunction1 = easeFunction1.asInstanceOf[js.Any], easeFunction2 = easeFunction2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationVariables]
  }
  @scala.inline
  implicit class IAnimationVariablesOps[Self <: IAnimationVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDurationValue1(value: String): Self = this.set("durationValue1", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationValue2(value: String): Self = this.set("durationValue2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationValue3(value: String): Self = this.set("durationValue3", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationValue4(value: String): Self = this.set("durationValue4", value.asInstanceOf[js.Any])
    @scala.inline
    def setEaseFunction1(value: String): Self = this.set("easeFunction1", value.asInstanceOf[js.Any])
    @scala.inline
    def setEaseFunction2(value: String): Self = this.set("easeFunction2", value.asInstanceOf[js.Any])
  }
  
}

