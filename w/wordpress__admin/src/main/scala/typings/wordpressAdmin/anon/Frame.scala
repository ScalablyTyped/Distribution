package typings.wordpressAdmin.anon

import typings.wordpressAdmin.componentsMediaViewsMod.MediaFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  def Frame(): Extend
  @JSName("Frame")
  var Frame_Original: typings.wordpressAdmin.componentsMediaViewsMod.Frame
  
  def MediaFrame(): Extend
  @JSName("MediaFrame")
  var MediaFrame_Original: MediaFrame
}
object Frame {
  
  inline def apply(Frame: typings.wordpressAdmin.componentsMediaViewsMod.Frame, MediaFrame: MediaFrame): Frame = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], MediaFrame = MediaFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setFrame(value: typings.wordpressAdmin.componentsMediaViewsMod.Frame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setMediaFrame(value: MediaFrame): Self = StObject.set(x, "MediaFrame", value.asInstanceOf[js.Any])
  }
}
