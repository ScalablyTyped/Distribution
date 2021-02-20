package typings.three

import typings.three.animationClipMod.AnimationClip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationUtilsMod {
  
  object AnimationUtils {
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.arraySlice")
    @js.native
    def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.convertArray")
    @js.native
    def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.flattenJSON")
    @js.native
    def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit = js.native
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.getKeyFrameOrder")
    @js.native
    def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = js.native
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.isTypedArray")
    @js.native
    def isTypedArray(`object`: js.Any): Boolean = js.native
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(targetClip: AnimationClip): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(
      targetClip: AnimationClip,
      referenceFrame: js.UndefOr[scala.Nothing],
      referenceClip: js.UndefOr[scala.Nothing],
      fps: Double
    ): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(targetClip: AnimationClip, referenceFrame: js.UndefOr[scala.Nothing], referenceClip: AnimationClip): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(
      targetClip: AnimationClip,
      referenceFrame: js.UndefOr[scala.Nothing],
      referenceClip: AnimationClip,
      fps: Double
    ): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(
      targetClip: AnimationClip,
      referenceFrame: Double,
      referenceClip: js.UndefOr[scala.Nothing],
      fps: Double
    ): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.makeClipAdditive")
    @js.native
    def makeClipAdditive(targetClip: AnimationClip, referenceFrame: Double, referenceClip: AnimationClip, fps: Double): AnimationClip = js.native
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.sortedArray")
    @js.native
    def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_] = js.native
    
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.subclip")
    @js.native
    def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double): AnimationClip = js.native
    @JSImport("three/src/animation/AnimationUtils", "AnimationUtils.subclip")
    @js.native
    def subclip(sourceClip: AnimationClip, name: String, startFrame: Double, endFrame: Double, fps: Double): AnimationClip = js.native
  }
}
