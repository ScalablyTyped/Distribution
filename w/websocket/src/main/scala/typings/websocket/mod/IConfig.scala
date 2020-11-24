package typings.websocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfig extends js.Object {
  
  /**
    * If true, fragmented messages will be automatically assembled and the full
    * message will be emitted via a `message` event. If false, each frame will be
    * emitted on the `connection` object via a `frame` event and the application
    * will be responsible for aggregating multiple fragmented frames. Single-frame
    * messages will emit a `message` event in addition to the `frame` event.
    * @default true
    */
  var assembleFragments: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds to wait after sending a close frame for an
    * `acknowledgement` to come back before giving up and just closing the socket.
    * @default 5000
    */
  var closeTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not to fragment outgoing messages. If true, messages will be
    * automatically fragmented into chunks of up to `fragmentationThreshold` bytes.
    * @default true
    */
  var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum size of a frame in bytes before it is automatically fragmented.
    * @default 16KiB
    */
  var fragmentationThreshold: js.UndefOr[Double] = js.native
  
  /**
    * The maximum allowed received frame size in bytes.
    * Single frame messages will also be limited to this maximum.
    * @default 1MiB
    */
  var maxReceivedFrameSize: js.UndefOr[Double] = js.native
  
  /**
    * The maximum allowed aggregate message size (for fragmented messages) in bytes
    * @default 8MiB
    */
  var maxReceivedMessageSize: js.UndefOr[Double] = js.native
}
object IConfig {
  
  @scala.inline
  def apply(): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    
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
    def setAssembleFragments(value: Boolean): Self = this.set("assembleFragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssembleFragments: Self = this.set("assembleFragments", js.undefined)
    
    @scala.inline
    def setCloseTimeout(value: Double): Self = this.set("closeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTimeout: Self = this.set("closeTimeout", js.undefined)
    
    @scala.inline
    def setFragmentOutgoingMessages(value: Boolean): Self = this.set("fragmentOutgoingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragmentOutgoingMessages: Self = this.set("fragmentOutgoingMessages", js.undefined)
    
    @scala.inline
    def setFragmentationThreshold(value: Double): Self = this.set("fragmentationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragmentationThreshold: Self = this.set("fragmentationThreshold", js.undefined)
    
    @scala.inline
    def setMaxReceivedFrameSize(value: Double): Self = this.set("maxReceivedFrameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReceivedFrameSize: Self = this.set("maxReceivedFrameSize", js.undefined)
    
    @scala.inline
    def setMaxReceivedMessageSize(value: Double): Self = this.set("maxReceivedMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReceivedMessageSize: Self = this.set("maxReceivedMessageSize", js.undefined)
  }
}
