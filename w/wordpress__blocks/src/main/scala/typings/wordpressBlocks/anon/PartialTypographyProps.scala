package typings.wordpressBlocks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.TypographyProps> */
trait PartialTypographyProps extends StObject {
  
  var fontSize: js.UndefOr[Boolean] = js.undefined
  
  var lineHeight: js.UndefOr[Boolean] = js.undefined
}
object PartialTypographyProps {
  
  inline def apply(): PartialTypographyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypographyProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTypographyProps] (val x: Self) extends AnyVal {
    
    inline def setFontSize(value: Boolean): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setLineHeight(value: Boolean): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
  }
}
