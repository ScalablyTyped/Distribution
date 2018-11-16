package typings
package telebotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Interval extends js.Object {
  // Optional. Use polling.
  var interval: js.UndefOr[scala.Double] = js.undefined
   // Optional. Update polling timeout (0 - short polling).
  var limit: js.UndefOr[scala.Double] = js.undefined
   // Optional. Reconnecting timeout (in ms).
  var proxy: js.UndefOr[java.lang.String] = js.undefined
   // Optional. Limits the number of updates to be retrieved.
  var retryTimeout: js.UndefOr[scala.Double] = js.undefined
   // Optional. How often check updates (in ms).
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

