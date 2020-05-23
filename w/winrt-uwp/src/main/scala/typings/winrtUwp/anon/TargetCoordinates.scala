package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetCoordinates extends js.Object {
  /** This function returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction
  /** The pixel coordinates, mapped to depth image space. */ var targetCoordinates: Point
}

object TargetCoordinates {
  @scala.inline
  def apply(returnValue: IPromiseWithIAsyncAction, targetCoordinates: Point): TargetCoordinates = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], targetCoordinates = targetCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCoordinates]
  }
}

