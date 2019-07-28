package typings.workboxDashSw.workboxDashSwMod

import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  A class to make it easier to serialize and de-serialize requests so they can be stored in IndexedDB.
  *  @private
  */
trait StorableRequest extends js.Object {
  /**
  	 * Returns a deep clone of the instances `_requestData` object.
  	 * @private
  	 * @return {StorableRequestOptions}
  	 */
  def toObject(): StorableRequestOptions
  /**
  	 * Converts this instance to a Request.
  	 * @private
  	 * @return {Request}
  	 */
  def toRequest(): Request
}

object StorableRequest {
  @scala.inline
  def apply(clone: () => StorableRequest, toObject: () => StorableRequestOptions, toRequest: () => Request): StorableRequest = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), toObject = js.Any.fromFunction0(toObject), toRequest = js.Any.fromFunction0(toRequest))
  
    __obj.asInstanceOf[StorableRequest]
  }
}

