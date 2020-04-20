package typings.titanium

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
  var value: js.UndefOr[java.lang.String | Double | Boolean] = js.undefined
}

object TiMetadataItemType {
  @scala.inline
  def apply(
    extraAttributes: js.Any = null,
    key: java.lang.String = null,
    keySpace: java.lang.String = null,
    value: java.lang.String | Double | Boolean = null
  ): TiMetadataItemType = {
    val __obj = js.Dynamic.literal()
    if (extraAttributes != null) __obj.updateDynamic("extraAttributes")(extraAttributes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keySpace != null) __obj.updateDynamic("keySpace")(keySpace.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiMetadataItemType]
  }
}

