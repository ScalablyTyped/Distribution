package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorProps extends StObject {
  
  /**
    * This property adds UI controls which allow the user to apply
    * a solid background color to a block.
    *
    * When the block declares support for `color.background`,
    * the attributes of a block will include two new entries:
    * `backgroundColor` and `style`.
    *
    * @defaultValue true
    */
  var background: Boolean
  
  /**
    * This property adds UI controls which allow the user to apply
    * a gradient background to a block.
    *
    * When the block declares support for `color.background`,
    * the attributes of a block will include two new entries:
    * `gradient` and `style`.
    *
    * @defaultValue false
    */
  var gradients: Boolean
  
  /**
    * This property adds block controls which allow the user
    * to set link color in a block, link color is disabled by default.
    *
    * @defaultValue false
    */
  var link: Boolean
  
  /**
    * This property adds block controls which allow the user
    * to set text color in a block.
    *
    * @defaultValue true
    */
  var text: Boolean
}
object ColorProps {
  
  inline def apply(background: Boolean, gradients: Boolean, link: Boolean, text: Boolean): ColorProps = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorProps] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setGradients(value: Boolean): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
