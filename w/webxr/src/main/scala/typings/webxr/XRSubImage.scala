package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRSubImage extends StObject {
  
  val viewport: XRViewport
}
object XRSubImage {
  
  inline def apply(viewport: XRViewport): XRSubImage = {
    val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRSubImage]
  }
  
  extension [Self <: XRSubImage](x: Self) {
    
    inline def setViewport(value: XRViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
