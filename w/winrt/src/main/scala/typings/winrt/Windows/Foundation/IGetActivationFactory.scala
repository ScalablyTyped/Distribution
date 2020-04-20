package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetActivationFactory extends js.Object {
  def getActivationFactory(activatableClassId: String): js.Any
}

object IGetActivationFactory {
  @scala.inline
  def apply(getActivationFactory: String => js.Any): IGetActivationFactory = {
    val __obj = js.Dynamic.literal(getActivationFactory = js.Any.fromFunction1(getActivationFactory))
    __obj.asInstanceOf[IGetActivationFactory]
  }
}

