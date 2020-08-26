package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple `Error` argument provided to the callback from the
  * [executeAllAsync](Titanium.Database.DB.executeAllAsync) method in case of failure
  */
@js.native
trait PossibleBatchQueryError extends js.Object {
  /**
    * Index of the failed query
    */
  var index: js.UndefOr[Double] = js.native
}

object PossibleBatchQueryError {
  @scala.inline
  def apply(): PossibleBatchQueryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PossibleBatchQueryError]
  }
  @scala.inline
  implicit class PossibleBatchQueryErrorOps[Self <: PossibleBatchQueryError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

