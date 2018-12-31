package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specifier for a media library query. By default, filters perform an exact match.
  */
trait MediaQueryType extends js.Object {
  /**
  	 * The album artist to filter on. Value should be a String.
  	 */
  var albumArtist: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.undefined
  /**
  	 * The album artist persistent ID to filter on. Value should be a Number.
  	 */
  var albumArtistPersistentID: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * The album persistent ID to filter on. Value should be a Number.
  	 */
  var albumPersistentID: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * The album title to filter on. Value should be a String.
  	 */
  var albumTitle: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.undefined
  /**
  	 * The artist to filter on. Value should be a String.
  	 */
  var artist: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.undefined
  /**
  	 * The composer to filter on. Value should be a String.
  	 */
  var composer: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.undefined
  /**
  	 * The composer persistent ID to filter on. Value should be a Number.
  	 */
  var composerPersistentID: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * The genre to filter on. Value should be a String.
  	 */
  var genre: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.undefined
  /**
  	 * The genre persistent ID to filter on. Value should be a Number.
  	 */
  var genrePersistentID: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * A constant that specifies the ordering of the result array.
  	 */
  var grouping: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Filter by whether or not the item is a protected asset.
  	 * Value should be a Boolean.
  	 */
  var hasProtectedAsset: js.UndefOr[MediaQueryInfoType | scala.Boolean] = js.undefined
  /**
  	 * Filter by whether or not the item is a cloud item.
  	 * Value should be a Boolean.
  	 */
  var isCloudItem: js.UndefOr[MediaQueryInfoType | scala.Boolean] = js.undefined
  /**
  	 * Filter by whether or not the item is a compilation.
  	 * The value should be a Boolean.
  	 */
  var isCompilation: js.UndefOr[MediaQueryInfoType | scala.Boolean] = js.undefined
  /**
  	 * The media type to filter on.
  	 */
  var mediaType: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * The persistent ID to filter on. Value should be a Number.
  	 */
  var persistentID: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * The play count to filter on. Value should be a Number.
  	 */
  var playCount: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * The podcast persistent ID to filter on. Value should be a Number.
  	 */
  var podcastPersistentID: js.UndefOr[MediaQueryInfoType | scala.Double] = js.undefined
  /**
  	 * The podcast title to filter on. Value should be a String.
  	 */
  var podcastTitle: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.undefined
  /**
  	 * The title to filter on. Value should be a String.
  	 */
  var title: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.undefined
}

