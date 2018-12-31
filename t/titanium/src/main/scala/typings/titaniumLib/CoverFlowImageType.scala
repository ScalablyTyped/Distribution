package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for defining a single image in a cover flow view.
  */
trait CoverFlowImageType extends js.Object {
  /**
  	 * Display height of the image, in Apple points.
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Image to use, as a local file URL, `Blob`, or `File`.
  	 */
  var image: js.UndefOr[
    java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File
  ] = js.undefined
  /**
  	 * Display width for the image, in Apple points.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

