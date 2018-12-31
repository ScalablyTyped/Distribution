package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract type to represent a metadata item inside the `metadata` event (iOS only).
  */
trait TiMetadataItemType extends js.Object {
  /**
  	 * A dictionary of the additional attributes.
  	 */
  var extraAttributes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The key of the metadata item, e.g. "title".
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The key-path of the metadata item.
  	 */
  var keySpace: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The value of the metadata item. Can be represented as various types.
  	 */
  var value: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
}

