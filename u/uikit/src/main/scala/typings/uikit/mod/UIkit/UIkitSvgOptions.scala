package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitSvgOptions extends StObject {
  
  var src: js.UndefOr[String] = js.undefined
  
  var `stroke-animation`: js.UndefOr[Boolean] = js.undefined
}
object UIkitSvgOptions {
  
  @scala.inline
  def apply(): UIkitSvgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSvgOptions]
  }
  
  @scala.inline
  implicit class UIkitSvgOptionsMutableBuilder[Self <: UIkitSvgOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def `setStroke-animation`(value: Boolean): Self = StObject.set(x, "stroke-animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-animationUndefined`: Self = StObject.set(x, "stroke-animation", js.undefined)
  }
}
