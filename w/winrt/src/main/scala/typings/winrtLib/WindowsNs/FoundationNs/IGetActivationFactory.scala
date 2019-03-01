package typings
package winrtLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetActivationFactory extends js.Object {
  def getActivationFactory(activatableClassId: java.lang.String): js.Any
}

object IGetActivationFactory {
  @scala.inline
  def apply(getActivationFactory: js.Function1[java.lang.String, js.Any]): IGetActivationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActivationFactory")(getActivationFactory)
    __obj.asInstanceOf[IGetActivationFactory]
  }
}

