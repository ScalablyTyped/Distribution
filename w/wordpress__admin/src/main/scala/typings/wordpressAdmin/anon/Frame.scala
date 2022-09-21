package typings.wordpressAdmin.anon

import typings.wordpressAdmin.mediaViewsMod.MediaFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  def Frame(): Extend
  @JSName("Frame")
  var Frame_Original: typings.wordpressAdmin.mediaViewsMod.Frame
  
  def MediaFrame(): Extend
  @JSName("MediaFrame")
  var MediaFrame_Original: MediaFrame
}
object Frame {
  
  inline def apply(Frame: typings.wordpressAdmin.mediaViewsMod.Frame, MediaFrame: MediaFrame): Frame = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], MediaFrame = MediaFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setFrame(value: typings.wordpressAdmin.mediaViewsMod.Frame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setMediaFrame(value: MediaFrame): Self = StObject.set(x, "MediaFrame", value.asInstanceOf[js.Any])
  }
}
