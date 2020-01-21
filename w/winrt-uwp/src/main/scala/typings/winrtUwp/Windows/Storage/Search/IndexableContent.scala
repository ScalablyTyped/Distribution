package typings.winrtUwp.Windows.Storage.Search

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app content and properties that can be added to the ContentIndexer . */
@JSGlobal("Windows.Storage.Search.IndexableContent")
@js.native
/** Initializes a new instance of the IndexableContent class. */
class IndexableContent () extends js.Object {
  /** Gets or sets the identifier for the content properties in the IndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var id: String = js.native
  /** Gets the content properties. */
  var properties: IMap[String, _] = js.native
  /** Gets or sets a Stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var stream: IRandomAccessStream = js.native
  /** Specifies the type of content in the Stream . */
  var streamContentType: String = js.native
}

