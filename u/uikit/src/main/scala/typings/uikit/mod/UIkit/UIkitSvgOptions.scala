package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitSvgOptions extends StObject {
  
  var src: js.UndefOr[String] = js.undefined
  
  var `stroke-animation`: js.UndefOr[Boolean] = js.undefined
}
object UIkitSvgOptions {
  
  inline def apply(): UIkitSvgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSvgOptions]
  }
  
  extension [Self <: UIkitSvgOptions](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def `setStroke-animation`(value: Boolean): Self = StObject.set(x, "stroke-animation", value.asInstanceOf[js.Any])
    
    inline def `setStroke-animationUndefined`: Self = StObject.set(x, "stroke-animation", js.undefined)
  }
}
