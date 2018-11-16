package typings
package tooltipsterLib.JQueryTooltipsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** see http://iamceege.github.io/tooltipster/#positioning */

trait ITooltipPosition extends js.Object {
  /** determines the position of the tooltip and are relative to the viewport */
  var coord: tooltipsterLib.Anon_Top
  /** the offset that will be applied between the origin and the tooltip */
  var distance: scala.Double
  /** is the side Tooltipster has judged best for your tooltip, according to your requirements */
  var side: TooltipPositioningSide
  /**
  		 * the size that your tooltip will have. It is either the natural size of the tooltip, or a size that has been 
  		 * set by Tooltipster to fit best on screen according to your requirements
  		 */
  var size: tooltipsterLib.Anon_Height
  /**
  		 * the location Tooltipster thinks the tooltip should ideally be centered on, and the arrow aiming at. It is 
  		 * given as the distance from the relevant edge of the viewport (left edge if the side is "top" or "bottom", 
  		 * top edge if the side is "left" or "right"). The target is usually the middle of the origin, but can be 
  		 * somewhere else when the origin is actually a portion of text split in several lines. Editing this value 
  		 * will change the location the arrow is aiming at but will not change the position of the tooltip itself 
  		 * (use coord for that).
  		 */
  var target: scala.Double
}

