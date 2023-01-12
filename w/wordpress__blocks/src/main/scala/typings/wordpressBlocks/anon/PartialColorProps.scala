package typings.wordpressBlocks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.ColorProps> */
trait PartialColorProps extends StObject {
  
  var background: js.UndefOr[Boolean] = js.undefined
  
  var gradients: js.UndefOr[Boolean] = js.undefined
  
  var link: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[Boolean] = js.undefined
}
object PartialColorProps {
  
  inline def apply(): PartialColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialColorProps] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setGradients(value: Boolean): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
    
    inline def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
    
    inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
