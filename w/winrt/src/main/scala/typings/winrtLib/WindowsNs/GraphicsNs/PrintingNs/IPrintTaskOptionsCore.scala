package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionsCore extends js.Object {
  def getPageDescription(jobPageNumber: scala.Double): PrintPageDescription
}

object IPrintTaskOptionsCore {
  @scala.inline
  def apply(getPageDescription: js.Function1[scala.Double, PrintPageDescription]): IPrintTaskOptionsCore = {
    val __obj = js.Dynamic.literal(getPageDescription = getPageDescription)
  
    __obj.asInstanceOf[IPrintTaskOptionsCore]
  }
}

