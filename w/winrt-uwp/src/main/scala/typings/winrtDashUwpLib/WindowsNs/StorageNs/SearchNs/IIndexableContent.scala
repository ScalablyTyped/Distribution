package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app content and properties that can be added to the ContentIndexer . */

trait IIndexableContent extends js.Object {
  /** Gets or sets the identifier for the content properties in the IIndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var id: java.lang.String
  /** Gets the content properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, _]
  /** Gets or sets a stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  /** Specifies the type of content in the Stream . */
  var streamContentType: java.lang.String
}

