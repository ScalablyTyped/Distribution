package typings
package wonderDotJsLib.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchData extends js.Object {
  var clientX: scala.Double
  var clientY: scala.Double
  var force: scala.Double
  var identifier: scala.Double
  var pageX: scala.Double
  var pageY: scala.Double
  var radiusX: scala.Double
  var radiusY: scala.Double
  var rotationAngle: scala.Double
  var screenX: scala.Double
  var screenY: scala.Double
  var target: stdLib.HTMLElement
}

object ITouchData {
  @scala.inline
  def apply(
    clientX: scala.Double,
    clientY: scala.Double,
    force: scala.Double,
    identifier: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotationAngle: scala.Double,
    screenX: scala.Double,
    screenY: scala.Double,
    target: stdLib.HTMLElement
  ): ITouchData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.updateDynamic("force")(force)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("radiusX")(radiusX)
    __obj.updateDynamic("radiusY")(radiusY)
    __obj.updateDynamic("rotationAngle")(rotationAngle)
    __obj.updateDynamic("screenX")(screenX)
    __obj.updateDynamic("screenY")(screenY)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ITouchData]
  }
}

