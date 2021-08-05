package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6.2
trait WebCLImage
  extends StObject
     with WebCLMemoryObject {
  
  def getInfo(): WebCLImageDescriptor
}
object WebCLImage {
  
  inline def apply(getInfo: () => WebCLImageDescriptor, release: () => Unit): WebCLImage = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLImage]
  }
  
  extension [Self <: WebCLImage](x: Self) {
    
    inline def setGetInfo(value: () => WebCLImageDescriptor): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
  }
}
