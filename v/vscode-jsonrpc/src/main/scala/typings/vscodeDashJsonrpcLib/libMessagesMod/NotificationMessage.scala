package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NotificationMessage extends Message {
  /**
       * The method to be invoked.
       */
  var method: java.lang.String
  /**
       * The notification's params.
       */
  var params: js.UndefOr[js.Any] = js.undefined
}

