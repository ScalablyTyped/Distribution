package typings.webrtc

import typings.std.MediaStreamError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("getUserMedia")
  var getUserMedia_Original: NavigatorGetUserMedia
  
  val mediaDevices: MediaDevices
  
  def mozGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("mozGetUserMedia")
  var mozGetUserMedia_Original: NavigatorGetUserMedia
  
  def msGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("msGetUserMedia")
  var msGetUserMedia_Original: NavigatorGetUserMedia
  
  def webkitGetUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: js.Function1[/* stream */ MediaStream, Unit],
    errorCallback: js.Function1[/* error */ MediaStreamError, Unit]
  ): Unit
  @JSName("webkitGetUserMedia")
  var webkitGetUserMedia_Original: NavigatorGetUserMedia
}
object Navigator {
  
  inline def apply(
    getUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit,
    mediaDevices: MediaDevices,
    mozGetUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit,
    msGetUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit,
    webkitGetUserMedia: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit
  ): Navigator = {
    val __obj = js.Dynamic.literal(getUserMedia = js.Any.fromFunction3(getUserMedia), mediaDevices = mediaDevices.asInstanceOf[js.Any], mozGetUserMedia = js.Any.fromFunction3(mozGetUserMedia), msGetUserMedia = js.Any.fromFunction3(msGetUserMedia), webkitGetUserMedia = js.Any.fromFunction3(webkitGetUserMedia))
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit
    ): Self = StObject.set(x, "getUserMedia", js.Any.fromFunction3(value))
    
    inline def setMediaDevices(value: MediaDevices): Self = StObject.set(x, "mediaDevices", value.asInstanceOf[js.Any])
    
    inline def setMozGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit
    ): Self = StObject.set(x, "mozGetUserMedia", js.Any.fromFunction3(value))
    
    inline def setMsGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit
    ): Self = StObject.set(x, "msGetUserMedia", js.Any.fromFunction3(value))
    
    inline def setWebkitGetUserMedia(
      value: (/* constraints */ MediaStreamConstraints, /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit]) => Unit
    ): Self = StObject.set(x, "webkitGetUserMedia", js.Any.fromFunction3(value))
  }
}
