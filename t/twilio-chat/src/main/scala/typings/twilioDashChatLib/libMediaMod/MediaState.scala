package typings
package twilioDashChatLib.libMediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaState extends js.Object {
  var contentType: java.lang.String
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var sid: java.lang.String
  var size: scala.Double
}

object MediaState {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    sid: java.lang.String,
    size: scala.Double,
    filename: java.lang.String = null
  ): MediaState = {
    val __obj = js.Dynamic.literal(contentType = contentType, sid = sid, size = size)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[MediaState]
  }
}

