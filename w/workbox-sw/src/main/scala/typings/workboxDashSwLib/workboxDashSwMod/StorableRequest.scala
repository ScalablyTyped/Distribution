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
    clone: () => StorableRequest,
    timestamp: scala.Double,
    toObject: () => IStorableRequestOptions,
    toRequest: () => stdLib.Request
  ): StorableRequest = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), timestamp = timestamp, toObject = js.Any.fromFunction0(toObject), toRequest = js.Any.fromFunction0(toRequest))
  
    __obj.asInstanceOf[StorableRequest]
  }
}

