package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICursorTool extends ITool {
  var direction: java.lang.String
  var dragging: scala.Double
  var followMouse: scala.Boolean
  var format: IFormat
  var horizAxis: IAxis
  var render: java.lang.String
  var size: IPoint
  var vertAxis: IAxis
  def over(point: IPoint): scala.Boolean
  def setRender(render: java.lang.String): scala.Unit
}

