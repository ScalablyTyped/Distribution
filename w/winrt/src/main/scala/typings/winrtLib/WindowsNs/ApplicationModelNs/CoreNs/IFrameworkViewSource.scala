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
  def apply(createView: () => IFrameworkView): IFrameworkViewSource = {
    val __obj = js.Dynamic.literal(createView = js.Any.fromFunction0(createView))
  
    __obj.asInstanceOf[IFrameworkViewSource]
  }
}

