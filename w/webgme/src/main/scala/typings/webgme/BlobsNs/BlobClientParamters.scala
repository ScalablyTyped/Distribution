package typings.webgme.BlobsNs

import typings.webgme.GlobalNs.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobClientParamters extends js.Object {
  var logger: GmeLogger
}

object BlobClientParamters {
  @scala.inline
  def apply(logger: GmeLogger): BlobClientParamters = {
    val __obj = js.Dynamic.literal(logger = logger)
  
    __obj.asInstanceOf[BlobClientParamters]
  }
}

