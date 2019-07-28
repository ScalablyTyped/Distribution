package typings.teechart.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends js.Object {
  var format: IFormat
  var margins: IMargins
  var transparent: Boolean
}

object IPanel {
  @scala.inline
  def apply(format: IFormat, margins: IMargins, transparent: Boolean): IPanel = {
    val __obj = js.Dynamic.literal(format = format, margins = margins, transparent = transparent)
  
    __obj.asInstanceOf[IPanel]
  }
}

