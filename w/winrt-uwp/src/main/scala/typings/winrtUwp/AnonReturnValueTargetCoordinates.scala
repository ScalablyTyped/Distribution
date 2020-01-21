package typings.winrtUwp

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnValueTargetCoordinates extends js.Object {
  /** This function returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction
  /** The pixel coordinates, mapped to depth image space. */ var targetCoordinates: Point
}

object AnonReturnValueTargetCoordinates {
  @scala.inline
  def apply(returnValue: IPromiseWithIAsyncAction, targetCoordinates: Point): AnonReturnValueTargetCoordinates = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], targetCoordinates = targetCoordinates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReturnValueTargetCoordinates]
  }
}

