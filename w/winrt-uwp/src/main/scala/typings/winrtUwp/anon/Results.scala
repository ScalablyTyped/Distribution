package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  /** A set of coordinates, relative to the coordinate system of the camera device and with correlated depth values. */ var results: Vector3 = js.native
  /** This method returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction = js.native
}

object Results {
  @scala.inline
  def apply(results: Vector3, returnValue: IPromiseWithIAsyncAction): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResults(value: Vector3): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: IPromiseWithIAsyncAction): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

