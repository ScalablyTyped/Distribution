package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6.2
@js.native
trait WebCLImage extends WebCLMemoryObject {
  
  def getInfo(): WebCLImageDescriptor = js.native
}
object WebCLImage {
  
  @scala.inline
  def apply(getInfo: () => WebCLImageDescriptor, release: () => Unit): WebCLImage = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLImage]
  }
  
  @scala.inline
  implicit class WebCLImageMutableBuilder[Self <: WebCLImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInfo(value: () => WebCLImageDescriptor): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
  }
}
