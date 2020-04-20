package typings.winrt.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationDescriptionFactory extends js.Object {
  def createInstance(effect: AnimationEffect, target: AnimationEffectTarget): AnimationDescription
}

object IAnimationDescriptionFactory {
  @scala.inline
  def apply(createInstance: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): IAnimationDescriptionFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction2(createInstance))
    __obj.asInstanceOf[IAnimationDescriptionFactory]
  }
}

