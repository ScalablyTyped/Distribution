package typings.titanium

import typings.titanium.Titanium.Media.Item
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
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  /**
    * A single representative of the selected items.
    */
  var representative: js.UndefOr[Item] = js.undefined
  /**
    * Media types in this collection, represented as the bitwise OR of the media type
    * values for all media types represented in `items`.
    */
  var types: js.UndefOr[Double] = js.undefined
}

object MusicLibraryResponseType {
  @scala.inline
  def apply(
    items: js.Array[Item] = null,
    representative: Item = null,
    types: js.UndefOr[Double] = js.undefined
  ): MusicLibraryResponseType = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (representative != null) __obj.updateDynamic("representative")(representative.asInstanceOf[js.Any])
    if (!js.isUndefined(types)) __obj.updateDynamic("types")(types.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicLibraryResponseType]
  }
}

