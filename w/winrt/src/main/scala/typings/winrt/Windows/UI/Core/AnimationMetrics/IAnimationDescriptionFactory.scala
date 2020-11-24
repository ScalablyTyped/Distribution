package typings.winrt.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimationDescriptionFactory extends js.Object {
  
  def createInstance(effect: AnimationEffect, target: AnimationEffectTarget): AnimationDescription = js.native
}
object IAnimationDescriptionFactory {
  
  @scala.inline
  def apply(createInstance: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): IAnimationDescriptionFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction2(createInstance))
    __obj.asInstanceOf[IAnimationDescriptionFactory]
  }
  
  @scala.inline
  implicit class IAnimationDescriptionFactoryOps[Self <: IAnimationDescriptionFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateInstance(value: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): Self = this.set("createInstance", js.Any.fromFunction2(value))
  }
}
