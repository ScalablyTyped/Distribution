package typings.teechart.Tee

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
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPanel]
  }
}

