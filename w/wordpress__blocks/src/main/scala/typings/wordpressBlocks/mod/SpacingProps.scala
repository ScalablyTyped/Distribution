package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingProps extends StObject {
  
  var blockGap: Boolean | js.Array[AxialDirection]
  
  /**
    * Enable margin control UI for all or specified element directions
    *
    * @defaultValue false
    */
  var margin: Boolean | js.Array[CSSDirection]
  
  /**
    * Enable padding control UI for all or specified element directions
    *
    * @defaultValue false
    */
  var padding: Boolean | js.Array[CSSDirection]
}
object SpacingProps {
  
  inline def apply(
    blockGap: Boolean | js.Array[AxialDirection],
    margin: Boolean | js.Array[CSSDirection],
    padding: Boolean | js.Array[CSSDirection]
  ): SpacingProps = {
    val __obj = js.Dynamic.literal(blockGap = blockGap.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpacingProps] (val x: Self) extends AnyVal {
    
    inline def setBlockGap(value: Boolean | js.Array[AxialDirection]): Self = StObject.set(x, "blockGap", value.asInstanceOf[js.Any])
    
    inline def setBlockGapVarargs(value: AxialDirection*): Self = StObject.set(x, "blockGap", js.Array(value*))
    
    inline def setMargin(value: Boolean | js.Array[CSSDirection]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: CSSDirection*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setPadding(value: Boolean | js.Array[CSSDirection]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: CSSDirection*): Self = StObject.set(x, "padding", js.Array(value*))
  }
}
