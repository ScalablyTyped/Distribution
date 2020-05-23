package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple `Error` argument provided to the callback from the
  * [executeAllAsync](Titanium.Database.DB.executeAllAsync) method in case of failure
  */
trait PossibleBatchQueryError extends js.Object {
  /**
    * Index of the failed query
    */
  var index: js.UndefOr[Double] = js.undefined
}

object PossibleBatchQueryError {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined): PossibleBatchQueryError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleBatchQueryError]
  }
}

