package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends js.Object {
  var format: IFormat
  var margins: IMargins
  var transparent: scala.Boolean
}

object IPanel {
  @scala.inline
  def apply(format: IFormat, margins: IMargins, transparent: scala.Boolean): IPanel = {
    val __obj = js.Dynamic.literal(format = format, margins = margins, transparent = transparent)
  
    __obj.asInstanceOf[IPanel]
  }
}

