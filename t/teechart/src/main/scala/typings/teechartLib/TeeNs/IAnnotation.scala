package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnotation extends ITool {
  var bounds: IRectangle
  var format: IFormat
  var items: js.Array[IAnnotation]
  var margins: IMargins
  var position: IPoint
  var text: java.lang.String
  var transparent: scala.Boolean
  var visible: scala.Boolean
  def add(text: java.lang.String): IAnnotation
  def resize(): scala.Unit
}

