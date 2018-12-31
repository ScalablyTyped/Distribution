package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for describing the preview image rectangle. This will be undefined when custom camera overlay is not used.
  */
trait PreviewRectType extends js.Object {
  /**
  	 * Height preview image, in pixels.
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Width preview image, in pixels.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

