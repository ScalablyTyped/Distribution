package typings.winrt.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimationDescriptionFactory extends StObject {
  
  def createInstance(effect: AnimationEffect, target: AnimationEffectTarget): AnimationDescription = js.native
}
object IAnimationDescriptionFactory {
  
  @scala.inline
  def apply(createInstance: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): IAnimationDescriptionFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction2(createInstance))
    __obj.asInstanceOf[IAnimationDescriptionFactory]
  }
  
  @scala.inline
  implicit class IAnimationDescriptionFactoryMutableBuilder[Self <: IAnimationDescriptionFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateInstance(value: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): Self = StObject.set(x, "createInstance", js.Any.fromFunction2(value))
  }
}
