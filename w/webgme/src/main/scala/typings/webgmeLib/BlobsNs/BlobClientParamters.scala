package typings
package webgmeLib.BlobsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobClientParamters extends js.Object {
  var logger: webgmeLib.GlobalNs.GmeLogger
}

object BlobClientParamters {
  @scala.inline
  def apply(logger: webgmeLib.GlobalNs.GmeLogger): BlobClientParamters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[BlobClientParamters]
  }
}

