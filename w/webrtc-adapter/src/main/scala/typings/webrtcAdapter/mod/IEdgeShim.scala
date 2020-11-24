package typings.webrtcAdapter.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEdgeShim extends js.Object {
  
  def shimPeerConnection(window: Window): Unit = js.native
  
  def shimReplaceTrack(window: Window): Unit = js.native
}
object IEdgeShim {
  
  @scala.inline
  def apply(shimPeerConnection: Window => Unit, shimReplaceTrack: Window => Unit): IEdgeShim = {
    val __obj = js.Dynamic.literal(shimPeerConnection = js.Any.fromFunction1(shimPeerConnection), shimReplaceTrack = js.Any.fromFunction1(shimReplaceTrack))
    __obj.asInstanceOf[IEdgeShim]
  }
  
  @scala.inline
  implicit class IEdgeShimOps[Self <: IEdgeShim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShimPeerConnection(value: Window => Unit): Self = this.set("shimPeerConnection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShimReplaceTrack(value: Window => Unit): Self = this.set("shimReplaceTrack", js.Any.fromFunction1(value))
  }
}
