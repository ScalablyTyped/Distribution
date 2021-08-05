package typings.winrt.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationDescriptionFactory extends StObject {
  
  def createInstance(effect: AnimationEffect, target: AnimationEffectTarget): AnimationDescription
}
object IAnimationDescriptionFactory {
  
  inline def apply(createInstance: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): IAnimationDescriptionFactory = {
    val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction2(createInstance))
    __obj.asInstanceOf[IAnimationDescriptionFactory]
  }
  
  extension [Self <: IAnimationDescriptionFactory](x: Self) {
    
    inline def setCreateInstance(value: (AnimationEffect, AnimationEffectTarget) => AnimationDescription): Self = StObject.set(x, "createInstance", js.Any.fromFunction2(value))
  }
}
