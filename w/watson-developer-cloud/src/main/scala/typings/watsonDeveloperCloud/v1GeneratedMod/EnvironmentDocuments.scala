package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the document usage statistics for the environment. */
trait EnvironmentDocuments extends js.Object {
  /** Number of documents indexed for the environment. */
  var indexed: js.UndefOr[Double] = js.undefined
  /** Total number of documents allowed in the environment's capacity. */
  var maximum_allowed: js.UndefOr[Double] = js.undefined
}

object EnvironmentDocuments {
  @scala.inline
  def apply(indexed: js.UndefOr[Double] = js.undefined, maximum_allowed: js.UndefOr[Double] = js.undefined): EnvironmentDocuments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum_allowed)) __obj.updateDynamic("maximum_allowed")(maximum_allowed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentDocuments]
  }
}

