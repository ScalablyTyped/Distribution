package typings.webrtc

import typings.std.MediaDeviceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDevices extends StObject {
  
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]]
  
  def getSupportedConstraints(): MediaTrackSupportedConstraints
  
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream]
}
object MediaDevices {
  
  @scala.inline
  def apply(
    enumerateDevices: () => js.Promise[js.Array[MediaDeviceInfo]],
    getSupportedConstraints: () => MediaTrackSupportedConstraints,
    getUserMedia: MediaStreamConstraints => js.Promise[MediaStream]
  ): MediaDevices = {
    val __obj = js.Dynamic.literal(enumerateDevices = js.Any.fromFunction0(enumerateDevices), getSupportedConstraints = js.Any.fromFunction0(getSupportedConstraints), getUserMedia = js.Any.fromFunction1(getUserMedia))
    __obj.asInstanceOf[MediaDevices]
  }
  
  @scala.inline
  implicit class MediaDevicesMutableBuilder[Self <: MediaDevices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumerateDevices(value: () => js.Promise[js.Array[MediaDeviceInfo]]): Self = StObject.set(x, "enumerateDevices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedConstraints(value: () => MediaTrackSupportedConstraints): Self = StObject.set(x, "getSupportedConstraints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserMedia(value: MediaStreamConstraints => js.Promise[MediaStream]): Self = StObject.set(x, "getUserMedia", js.Any.fromFunction1(value))
  }
}
