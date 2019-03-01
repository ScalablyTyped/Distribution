package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationDescriptionFactory extends js.Object {
  def createInstance(effect: AnimationEffect, target: AnimationEffectTarget): AnimationDescription
}

object IAnimationDescriptionFactory {
  @scala.inline
  def apply(createInstance: js.Function2[AnimationEffect, AnimationEffectTarget, AnimationDescription]): IAnimationDescriptionFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInstance")(createInstance)
    __obj.asInstanceOf[IAnimationDescriptionFactory]
  }
}

