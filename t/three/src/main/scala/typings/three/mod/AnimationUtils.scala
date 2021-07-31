package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimationUtils {
  
  @JSImport("three", "AnimationUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySlice")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArray")(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], forceClone.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def flattenJSON(
    jsonKeys: js.Array[String],
    times: js.Array[js.Any],
    values: js.Array[js.Any],
    valuePropertyName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenJSON")(jsonKeys.asInstanceOf[js.Any], times.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valuePropertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyFrameOrder")(times.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def isTypedArray(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def makeClipAdditive(targetClip: typings.three.animationClipMod.AnimationClip): typings.three.animationClipMod.AnimationClip = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any]).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def makeClipAdditive(targetClip: typings.three.animationClipMod.AnimationClip, referenceFrame: Double): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: Unit,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typings.three.animationClipMod.AnimationClip
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typings.three.animationClipMod.AnimationClip,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Unit,
    referenceClip: Unit,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Unit,
    referenceClip: typings.three.animationClipMod.AnimationClip
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Unit,
    referenceClip: typings.three.animationClipMod.AnimationClip,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  
  @scala.inline
  def sortedArray(values: js.Array[js.Any], stride: Double, order: js.Array[Double]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortedArray")(values.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def subclip(
    sourceClip: typings.three.animationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("subclip")(sourceClip.asInstanceOf[js.Any], name.asInstanceOf[js.Any], startFrame.asInstanceOf[js.Any], endFrame.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
  @scala.inline
  def subclip(
    sourceClip: typings.three.animationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("subclip")(sourceClip.asInstanceOf[js.Any], name.asInstanceOf[js.Any], startFrame.asInstanceOf[js.Any], endFrame.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typings.three.animationClipMod.AnimationClip]
}
