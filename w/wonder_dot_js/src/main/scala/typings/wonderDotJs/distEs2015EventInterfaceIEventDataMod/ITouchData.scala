package typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchData extends js.Object {
  var clientX: Double
  var clientY: Double
  var force: Double
  var identifier: Double
  var pageX: Double
  var pageY: Double
  var radiusX: Double
  var radiusY: Double
  var rotationAngle: Double
  var screenX: Double
  var screenY: Double
  var target: HTMLElement
}

object ITouchData {
  @scala.inline
  def apply(
    clientX: Double,
    clientY: Double,
    force: Double,
    identifier: Double,
    pageX: Double,
    pageY: Double,
    radiusX: Double,
    radiusY: Double,
    rotationAngle: Double,
    screenX: Double,
    screenY: Double,
    target: HTMLElement
  ): ITouchData = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], radiusX = radiusX.asInstanceOf[js.Any], radiusY = radiusY.asInstanceOf[js.Any], rotationAngle = rotationAngle.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITouchData]
  }
}

