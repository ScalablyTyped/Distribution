package typings.tooltipster.JQueryTooltipster

import typings.tooltipster.Anon_Height
import typings.tooltipster.Anon_Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** see http://iamceege.github.io/tooltipster/#positioning */
trait ITooltipPosition extends js.Object {
  /** determines the position of the tooltip and are relative to the viewport */
  var coord: Anon_Left
  /** the offset that will be applied between the origin and the tooltip */
  var distance: Double
  /** is the side Tooltipster has judged best for your tooltip, according to your requirements */
  var side: TooltipPositioningSide
  /**
  		 * the size that your tooltip will have. It is either the natural size of the tooltip, or a size that has been 
  		 * set by Tooltipster to fit best on screen according to your requirements
  		 */
  var size: Anon_Height
  /**
  		 * the location Tooltipster thinks the tooltip should ideally be centered on, and the arrow aiming at. It is 
  		 * given as the distance from the relevant edge of the viewport (left edge if the side is "top" or "bottom", 
  		 * top edge if the side is "left" or "right"). The target is usually the middle of the origin, but can be 
  		 * somewhere else when the origin is actually a portion of text split in several lines. Editing this value 
  		 * will change the location the arrow is aiming at but will not change the position of the tooltip itself 
  		 * (use coord for that).
  		 */
  var target: Double
}

object ITooltipPosition {
  @scala.inline
  def apply(
    coord: Anon_Left,
    distance: Double,
    side: TooltipPositioningSide,
    size: Anon_Height,
    target: Double
  ): ITooltipPosition = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITooltipPosition]
  }
}

