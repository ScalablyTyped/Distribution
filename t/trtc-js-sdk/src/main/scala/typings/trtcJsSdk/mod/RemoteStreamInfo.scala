package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteStreamInfo extends StObject {
  
  var stream: RemoteStream
}
object RemoteStreamInfo {
  
  @scala.inline
  def apply(stream: RemoteStream): RemoteStreamInfo = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteStreamInfo]
  }
  
  @scala.inline
  implicit class RemoteStreamInfoMutableBuilder[Self <: RemoteStreamInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: RemoteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
