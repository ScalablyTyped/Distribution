package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphBlendMeshAnimation extends js.Object {
  var active: scala.Boolean
  var currentFrame: scala.Double
  var direction: scala.Double
  var directionBackwards: scala.Boolean
  var duration: scala.Double
  var end: scala.Double
  var fps: scala.Double
  var lastFrame: scala.Double
  var length: scala.Double
  var mirroredLoop: scala.Boolean
  var start: scala.Double
  var time: scala.Double
  var weight: scala.Double
}

object MorphBlendMeshAnimation {
  @scala.inline
  def apply(
    active: scala.Boolean,
    currentFrame: scala.Double,
    direction: scala.Double,
    directionBackwards: scala.Boolean,
    duration: scala.Double,
    end: scala.Double,
    fps: scala.Double,
    lastFrame: scala.Double,
    length: scala.Double,
    mirroredLoop: scala.Boolean,
    start: scala.Double,
    time: scala.Double,
    weight: scala.Double
  ): MorphBlendMeshAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("currentFrame")(currentFrame)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("directionBackwards")(directionBackwards)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("fps")(fps)
    __obj.updateDynamic("lastFrame")(lastFrame)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("mirroredLoop")(mirroredLoop)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[MorphBlendMeshAnimation]
  }
}

