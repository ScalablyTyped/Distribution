package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Results extends js.Object {
  /** A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values. */ var results: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector3
  /** This method returns asynchronously. */ var returnValue: winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
}

object Anon_Results {
  @scala.inline
  def apply(
    results: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Vector3,
    returnValue: winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
  ): Anon_Results = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_Results]
  }
}

