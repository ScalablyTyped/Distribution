package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.twilioVideoStrings.canvas
import typings.twilioVideo.twilioVideoStrings.offscreencanvas
import typings.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProcessorOptions extends StObject {
  
  var inputFrameBufferType: js.UndefOr[video | canvas | offscreencanvas] = js.undefined
  
  var outputFrameBufferContextType: js.UndefOr[String] = js.undefined
}
object AddProcessorOptions {
  
  inline def apply(): AddProcessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddProcessorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddProcessorOptions] (val x: Self) extends AnyVal {
    
    inline def setInputFrameBufferType(value: video | canvas | offscreencanvas): Self = StObject.set(x, "inputFrameBufferType", value.asInstanceOf[js.Any])
    
    inline def setInputFrameBufferTypeUndefined: Self = StObject.set(x, "inputFrameBufferType", js.undefined)
    
    inline def setOutputFrameBufferContextType(value: String): Self = StObject.set(x, "outputFrameBufferContextType", value.asInstanceOf[js.Any])
    
    inline def setOutputFrameBufferContextTypeUndefined: Self = StObject.set(x, "outputFrameBufferContextType", js.undefined)
  }
}
