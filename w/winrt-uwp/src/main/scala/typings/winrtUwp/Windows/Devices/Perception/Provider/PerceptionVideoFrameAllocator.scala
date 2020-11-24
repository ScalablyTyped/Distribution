package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An allocator that can create PerceptionFrames directly which can be written into or copied from Windows::Media::VideoFrame into a PerceptionFrame. */
@js.native
trait PerceptionVideoFrameAllocator extends js.Object {
  
  /**
    * Creates an empty PerceptionFrame with the properties specified when creating the PerceptionVideoFrameAllocator.
    * @return The empty frame with the properties specified when creating the PerceptionVideoFrameAllocator.
    */
  def allocateFrame(): PerceptionFrame = js.native
  
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  
  /**
    * Creates a deep copy of the video FrameProvider with the bytes already filled in with the resulting PerceptionFrame.
    * @param frame The input frame from which to copy the pixel data.
    * @return The resulting filled PerceptionFrame.
    */
  def copyFromVideoFrame(frame: VideoFrame): PerceptionFrame = js.native
}
object PerceptionVideoFrameAllocator {
  
  @scala.inline
  def apply(
    allocateFrame: () => PerceptionFrame,
    close: () => Unit,
    copyFromVideoFrame: VideoFrame => PerceptionFrame
  ): PerceptionVideoFrameAllocator = {
    val __obj = js.Dynamic.literal(allocateFrame = js.Any.fromFunction0(allocateFrame), close = js.Any.fromFunction0(close), copyFromVideoFrame = js.Any.fromFunction1(copyFromVideoFrame))
    __obj.asInstanceOf[PerceptionVideoFrameAllocator]
  }
  
  @scala.inline
  implicit class PerceptionVideoFrameAllocatorOps[Self <: PerceptionVideoFrameAllocator] (val x: Self) extends AnyVal {
    
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
    def setAllocateFrame(value: () => PerceptionFrame): Self = this.set("allocateFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyFromVideoFrame(value: VideoFrame => PerceptionFrame): Self = this.set("copyFromVideoFrame", js.Any.fromFunction1(value))
  }
}
