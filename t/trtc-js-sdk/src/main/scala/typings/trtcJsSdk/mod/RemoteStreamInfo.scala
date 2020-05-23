package typings.trtcJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteStreamInfo extends js.Object {
  var stream: RemoteStream
}

object RemoteStreamInfo {
  @scala.inline
  def apply(stream: RemoteStream): RemoteStreamInfo = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteStreamInfo]
  }
}

