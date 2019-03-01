package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReturnValueTargetCoordinates extends js.Object {
  /** This function returns asynchronously. */ var returnValue: winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
  /** The pixel coordinates, mapped to depth image space. */ var targetCoordinates: winrtDashUwpLib.WindowsNs.FoundationNs.Point
}

object Anon_ReturnValueTargetCoordinates {
  @scala.inline
  def apply(
    returnValue: winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction,
    targetCoordinates: winrtDashUwpLib.WindowsNs.FoundationNs.Point
  ): Anon_ReturnValueTargetCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("targetCoordinates")(targetCoordinates)
    __obj.asInstanceOf[Anon_ReturnValueTargetCoordinates]
  }
}

