package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a successful `GET /v1/batches` request. */
trait Batches extends js.Object {
  /** A list of the status of all batch requests. */
  var batches: js.UndefOr[js.Array[BatchStatus]] = js.undefined
}

object Batches {
  @scala.inline
  def apply(batches: js.Array[BatchStatus] = null): Batches = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batches]
  }
}

