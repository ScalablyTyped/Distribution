package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframeEffect extends AnimationEffect {
  var composite: CompositeOperation = js.native
  var iterationComposite: IterationCompositeOperation = js.native
  var target: Element | scala.Null = js.native
  def getKeyframes(): js.Array[ComputedKeyframe] = js.native
  def setKeyframes(): scala.Unit = js.native
  def setKeyframes(keyframes: js.Array[Keyframe]): scala.Unit = js.native
  def setKeyframes(keyframes: PropertyIndexedKeyframes): scala.Unit = js.native
}

@JSGlobal("KeyframeEffect")
@js.native
object KeyframeEffect
  extends org.scalablytyped.runtime.Instantiable0[KeyframeEffect]
     with org.scalablytyped.runtime.Instantiable2[
      (/* target */ Element) | (/* target */ scala.Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes), 
      KeyframeEffect
    ]
     with org.scalablytyped.runtime.Instantiable1[(/* target */ Element) | (/* source */ KeyframeEffect), KeyframeEffect]
     with org.scalablytyped.runtime.Instantiable3[
      (/* target */ Element) | (/* target */ scala.Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ scala.Null) | (/* keyframes */ PropertyIndexedKeyframes), 
      (/* options */ scala.Double) | (/* options */ KeyframeEffectOptions), 
      KeyframeEffect
    ]

