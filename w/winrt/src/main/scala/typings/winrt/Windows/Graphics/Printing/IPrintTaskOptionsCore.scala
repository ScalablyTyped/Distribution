package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionsCore extends js.Object {
  def getPageDescription(jobPageNumber: Double): PrintPageDescription
}

object IPrintTaskOptionsCore {
  @scala.inline
  def apply(getPageDescription: Double => PrintPageDescription): IPrintTaskOptionsCore = {
    val __obj = js.Dynamic.literal(getPageDescription = js.Any.fromFunction1(getPageDescription))
    __obj.asInstanceOf[IPrintTaskOptionsCore]
  }
}

