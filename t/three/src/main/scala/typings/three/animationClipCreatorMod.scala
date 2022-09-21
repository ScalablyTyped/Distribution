package typings.three

import typings.three.threeMod.AnimationClip
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationClipCreatorMod {
  
  trait AnimationClipCreator extends StObject {
    
    def CreateMaterialColorAnimation(duration: Double, colors: js.Array[Double]): AnimationClip
    
    def CreatePulsationAnimation(duration: Double, pulseScale: Double): AnimationClip
    
    def CreateRotationAnimation(period: Double, axis: String): AnimationClip
    
    def CreateScaleAxisAnimation(period: Double, axis: String): AnimationClip
    
    def CreateShakeAnimation(duration: Double, shakeScale: Vector3): AnimationClip
    
    def CreateVisibilityAnimation(duration: Double): AnimationClip
  }
  object AnimationClipCreator {
    
    @JSImport("three/examples/jsm/animation/AnimationClipCreator", "AnimationClipCreator")
    @js.native
    val ^ : AnimationClipCreator = js.native
    
    extension [Self <: AnimationClipCreator](x: Self) {
      
      inline def setCreateMaterialColorAnimation(value: (Double, js.Array[Double]) => AnimationClip): Self = StObject.set(x, "CreateMaterialColorAnimation", js.Any.fromFunction2(value))
      
      inline def setCreatePulsationAnimation(value: (Double, Double) => AnimationClip): Self = StObject.set(x, "CreatePulsationAnimation", js.Any.fromFunction2(value))
      
      inline def setCreateRotationAnimation(value: (Double, String) => AnimationClip): Self = StObject.set(x, "CreateRotationAnimation", js.Any.fromFunction2(value))
      
      inline def setCreateScaleAxisAnimation(value: (Double, String) => AnimationClip): Self = StObject.set(x, "CreateScaleAxisAnimation", js.Any.fromFunction2(value))
      
      inline def setCreateShakeAnimation(value: (Double, Vector3) => AnimationClip): Self = StObject.set(x, "CreateShakeAnimation", js.Any.fromFunction2(value))
      
      inline def setCreateVisibilityAnimation(value: Double => AnimationClip): Self = StObject.set(x, "CreateVisibilityAnimation", js.Any.fromFunction1(value))
    }
  }
}
