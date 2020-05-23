package typings.titanium

import typings.titanium.Titanium.Database.ResultSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple `Error` instance thrown from the
  * [executeAll](Titanium.Database.DB.executeAll) method in case of failure
  */
trait BatchQueryError extends js.Object {
  /**
    * Index of the failed query
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * partial `ResultSet`s of any successful queries before the failure
    */
  var results: js.UndefOr[js.Array[ResultSet]] = js.undefined
}

object BatchQueryError {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, results: js.Array[ResultSet] = null): BatchQueryError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchQueryError]
  }
}

