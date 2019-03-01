package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  A class to make it easier to serialize and de-serialize requests so they can be stored in IndexedDB.
  */
trait StorableRequest extends js.Object {
  val timestamp: scala.Double
  def toObject(): IStorableRequestOptions
  def toRequest(): stdLib.Request
}

object StorableRequest {
  @scala.inline
  def apply(
    clone: js.Function0[StorableRequest],
    timestamp: scala.Double,
    toObject: js.Function0[IStorableRequestOptions],
    toRequest: js.Function0[stdLib.Request]
  ): StorableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("toObject")(toObject)
    __obj.updateDynamic("toRequest")(toRequest)
    __obj.asInstanceOf[StorableRequest]
  }
}

