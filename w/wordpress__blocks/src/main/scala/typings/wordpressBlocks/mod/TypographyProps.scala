package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypographyProps extends StObject {
  
  /**
    * This value signals that a block supports the font-size
    * CSS style property. When it does, the block editor will
    * show an UI control for the user to set its value.
    *
    * The values shown in this control are the ones declared
    * by the theme via the editor-font-sizes theme support,
    * or the default ones if none are provided.
    *
    * @defaultValue false
    * @see {@link https://developer.wordpress.org/block-editor/how-to-guides/themes/theme-support/#block-font-sizes}
    */
  var fontSize: Boolean
  
  /**
    * This value signals that a block supports the line-height
    * CSS style property. When it does, the block editor will
    * show an UI control for the user to set its value if the
    * theme declares support.
    *
    * @defaultValue false
    * @see {@link https://developer.wordpress.org/block-editor/how-to-guides/themes/theme-support/#supporting-custom-line-heights}
    */
  var lineHeight: Boolean
}
object TypographyProps {
  
  inline def apply(fontSize: Boolean, lineHeight: Boolean): TypographyProps = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyProps]
  }
  
  extension [Self <: TypographyProps](x: Self) {
    
    inline def setFontSize(value: Boolean): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Boolean): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
