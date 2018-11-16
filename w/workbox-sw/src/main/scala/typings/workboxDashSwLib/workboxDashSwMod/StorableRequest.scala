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

