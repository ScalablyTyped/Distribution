package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the [openMusicLibrary](Titanium.Media.openMusicLibrary)
  * `success` callback function.
  */
trait MusicLibraryResponseType extends js.Object {
  /**
  	 * A list of all the items chosen by the user.
  	 */
  var items: js.UndefOr[js.Array[titaniumLib.TitaniumNs.MediaNs.Item]] = js.undefined
  /**
  	 * A single representative of the selected items.
  	 */
  var representative: js.UndefOr[titaniumLib.TitaniumNs.MediaNs.Item] = js.undefined
  /**
  	 * Media types in this collection, represented as the bitwise OR of the media type
  	 * values for all media types represented in `items`.
  	 */
  var types: js.UndefOr[scala.Double] = js.undefined
}

object MusicLibraryResponseType {
  @scala.inline
  def apply(
    items: js.Array[titaniumLib.TitaniumNs.MediaNs.Item] = null,
    representative: titaniumLib.TitaniumNs.MediaNs.Item = null,
    types: scala.Int | scala.Double = null
  ): MusicLibraryResponseType = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (representative != null) __obj.updateDynamic("representative")(representative)
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicLibraryResponseType]
  }
}

