package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app content and properties that can be added to the ContentIndexer . */
@JSGlobal("Windows.Storage.Search.IndexableContent")
@js.native
/** Initializes a new instance of the IndexableContent class. */
class IndexableContent () extends js.Object {
  /** Gets or sets the identifier for the content properties in the IndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var id: java.lang.String = js.native
  /** Gets the content properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, _] = js.native
  /** Gets or sets a Stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Specifies the type of content in the Stream . */
  var streamContentType: java.lang.String = js.native
}

