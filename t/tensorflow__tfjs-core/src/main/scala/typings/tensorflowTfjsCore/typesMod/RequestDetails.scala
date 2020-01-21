package typings.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDetails extends js.Object {
  /**
    * Is this request for a binary file (as opposed to a json file)
    */
  var isBinary: js.UndefOr[Boolean] = js.undefined
}

object RequestDetails {
  @scala.inline
  def apply(isBinary: js.UndefOr[Boolean] = js.undefined): RequestDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isBinary)) __obj.updateDynamic("isBinary")(isBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetails]
  }
}

