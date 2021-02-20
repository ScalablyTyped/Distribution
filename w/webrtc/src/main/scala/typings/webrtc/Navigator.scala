package typings.webrtc

import typings.std.MediaStreamError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
  @JSName("getUserMedia")
  var getUserMedia_Original: NavigatorGetUserMedia = js.native
  
  val mediaDevices: MediaDevices = js.native
  
  def mozGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
  @JSName("mozGetUserMedia")
  var mozGetUserMedia_Original: NavigatorGetUserMedia = js.native
  
  def msGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
  @JSName("msGetUserMedia")
  var msGetUserMedia_Original: NavigatorGetUserMedia = js.native
  
  def webkitGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit = js.native
  @JSName("webkitGetUserMedia")
  var webkitGetUserMedia_Original: NavigatorGetUserMedia = js.native
}
