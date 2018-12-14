package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEffect extends js.Object {
  def getComputedTiming(): ComputedEffectTiming = js.native
  def getTiming(): EffectTiming = js.native
  def updateTiming(): scala.Unit = js.native
  def updateTiming(timing: OptionalEffectTiming): scala.Unit = js.native
}

@JSGlobal("AnimationEffect")
@js.native
object AnimationEffect
  extends org.scalablytyped.runtime.Instantiable0[AnimationEffect]

