package typings.swPrecacheWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChunkName extends js.Object {
  var chunkName: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
}

object AnonChunkName {
  @scala.inline
  def apply(chunkName: String = null, filename: String = null): AnonChunkName = {
    val __obj = js.Dynamic.literal()
    if (chunkName != null) __obj.updateDynamic("chunkName")(chunkName.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChunkName]
  }
}

