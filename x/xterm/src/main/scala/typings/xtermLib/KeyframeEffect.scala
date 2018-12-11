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
  extends ScalablyTyped.runtime.Instantiable1[(/* target */ Element) | (/* source */ KeyframeEffect), KeyframeEffect]
     with ScalablyTyped.runtime.Instantiable2[
      (/* target */ Element) | (/* target */ scala.Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes), 
      KeyframeEffect
    ]
     with ScalablyTyped.runtime.Instantiable0[KeyframeEffect]
     with ScalablyTyped.runtime.Instantiable3[
      (/* target */ Element) | (/* target */ scala.Null), 
      (/* keyframes */ js.Array[Keyframe]) | (/* keyframes */ PropertyIndexedKeyframes) | (/* keyframes */ scala.Null), 
      (/* options */ scala.Double) | (/* options */ KeyframeEffectOptions), 
      KeyframeEffect
    ]

