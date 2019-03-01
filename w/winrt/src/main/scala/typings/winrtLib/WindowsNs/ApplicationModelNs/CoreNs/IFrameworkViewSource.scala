package typings
package winrtLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameworkViewSource extends js.Object {
  def createView(): IFrameworkView
}

object IFrameworkViewSource {
  @scala.inline
  def apply(createView: js.Function0[IFrameworkView]): IFrameworkViewSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createView")(createView)
    __obj.asInstanceOf[IFrameworkViewSource]
  }
}

