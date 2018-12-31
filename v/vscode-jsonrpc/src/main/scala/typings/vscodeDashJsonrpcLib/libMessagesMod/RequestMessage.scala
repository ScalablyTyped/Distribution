package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMessage extends Message {
  /**
    * The request id.
    */
  var id: scala.Double | java.lang.String
  /**
    * The method to be invoked.
    */
  var method: java.lang.String
  /**
    * The method's params.
    */
  var params: js.UndefOr[js.Any] = js.undefined
}

