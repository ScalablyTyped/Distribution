package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  @JSName("getUserMedia")
  var getUserMedia_Original: NavigatorGetUserMedia = js.native
  val mediaDevices: MediaDevices = js.native
  @JSName("mozGetUserMedia")
  var mozGetUserMedia_Original: NavigatorGetUserMedia = js.native
  @JSName("msGetUserMedia")
  var msGetUserMedia_Original: NavigatorGetUserMedia = js.native
  @JSName("webkitGetUserMedia")
  var webkitGetUserMedia_Original: NavigatorGetUserMedia = js.native
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
  def mozGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
  def msGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
  def webkitGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
}

