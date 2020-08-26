package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AnimationUtils")
@js.native
object AnimationUtils extends js.Object {
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
  def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit = js.native
  def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = js.native
  def isTypedArray(`object`: js.Any): Boolean = js.native
  def makeClipAdditive(targetClip: typings.three.animationClipMod.AnimationClip): typings.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: js.UndefOr[scala.Nothing],
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: typings.three.animationClipMod.AnimationClip
  ): typings.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: js.UndefOr[scala.Nothing],
    referenceClip: typings.three.animationClipMod.AnimationClip,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(targetClip: typings.three.animationClipMod.AnimationClip, referenceFrame: Double): typings.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: js.UndefOr[scala.Nothing],
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typings.three.animationClipMod.AnimationClip
  ): typings.three.animationClipMod.AnimationClip = js.native
  def makeClipAdditive(
    targetClip: typings.three.animationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typings.three.animationClipMod.AnimationClip,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = js.native
  def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_] = js.native
  def subclip(
    sourceClip: typings.three.animationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double
  ): typings.three.animationClipMod.AnimationClip = js.native
  def subclip(
    sourceClip: typings.three.animationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double,
    fps: Double
  ): typings.three.animationClipMod.AnimationClip = js.native
}

