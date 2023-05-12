package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureContent extends StObject {
  
  var captureContent: js.UndefOr[Boolean] = js.undefined
}
object CaptureContent {
  
  inline def apply(): CaptureContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptureContent] (val x: Self) extends AnyVal {
    
    inline def setCaptureContent(value: Boolean): Self = StObject.set(x, "captureContent", value.asInstanceOf[js.Any])
    
    inline def setCaptureContentUndefined: Self = StObject.set(x, "captureContent", js.undefined)
  }
}
