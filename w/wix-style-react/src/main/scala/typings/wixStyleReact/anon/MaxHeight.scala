package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxHeight extends StObject {
  
  /** The Popover's appendTo */
  var appendTo: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  /** Enables text ellipsis on tight containers */
  var ellipsis: Requireable[Boolean]
  
  /**
    * Whether to enable the fixed behaviour. This behaviour is used to keep the `<Popover/>` at it's
    * original placement even when it's being positioned outside the boundary.
    */
  var fixed: Requireable[Boolean]
  
  /**
    * Whether to enable the flip behaviour. This behaviour is used to flip the `<Popover/>`'s placement
    * when it starts to overlap the target element (`<Popover.Element/>`).
    */
  var flip: Requireable[Boolean]
  
  /** The maximum height value applied to the list */
  var maxHeight: Requireable[String | Double]
  
  /** The maximum width applied to the list */
  var maxWidth: Requireable[Double]
  
  /** The minimum width applied to the list */
  var minWidth: Requireable[Double]
  
  /** Moves popover content relative to the parent by x or y */
  var moveBy: Requireable[InferProps[X]]
  
  /** The Popover's placement:
    *  * auto-start
    *  * auto
    *  * auto-end
    *  * top-start
    *  * top
    *  * top-end
    *  * right-start
    *  * right
    *  * right-end
    *  * bottom-end
    *  * bottom
    *  * bottom-start
    *  * left-end
    *  * left
    *  * left-start
    */
  var placement: Requireable[String]
  
  /** Whether to show the Popover's arrow */
  var showArrow: Requireable[Boolean]
  
  /** Changing text size */
  var textSize: Requireable[String]
  
  /** Popover content z-index */
  var zIndex: Requireable[Double]
}
object MaxHeight {
  
  inline def apply(
    appendTo: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    ellipsis: Requireable[Boolean],
    fixed: Requireable[Boolean],
    flip: Requireable[Boolean],
    maxHeight: Requireable[String | Double],
    maxWidth: Requireable[Double],
    minWidth: Requireable[Double],
    moveBy: Requireable[InferProps[X]],
    placement: Requireable[String],
    showArrow: Requireable[Boolean],
    textSize: Requireable[String],
    zIndex: Requireable[Double]
  ): MaxHeight = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], ellipsis = ellipsis.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], moveBy = moveBy.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], showArrow = showArrow.asInstanceOf[js.Any], textSize = textSize.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxHeight]
  }
  
  extension [Self <: MaxHeight](x: Self) {
    
    inline def setAppendTo(value: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setEllipsis(value: Requireable[Boolean]): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: Requireable[Boolean]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: Requireable[Boolean]): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Requireable[String | Double]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Requireable[Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Requireable[Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMoveBy(value: Requireable[InferProps[X]]): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Requireable[String]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setShowArrow(value: Requireable[Boolean]): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setTextSize(value: Requireable[String]): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Requireable[Double]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
