package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  /** A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values. */ var results: Vector3
  /** This method returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction
}

object Results {
  @scala.inline
  def apply(results: Vector3, returnValue: IPromiseWithIAsyncAction): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
}

