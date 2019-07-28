package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.NumericsNs.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Results extends js.Object {
  /** A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values. */ var results: Vector3
  /** This method returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction
}

object Anon_Results {
  @scala.inline
  def apply(results: Vector3, returnValue: IPromiseWithIAsyncAction): Anon_Results = {
    val __obj = js.Dynamic.literal(results = results, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_Results]
  }
}

