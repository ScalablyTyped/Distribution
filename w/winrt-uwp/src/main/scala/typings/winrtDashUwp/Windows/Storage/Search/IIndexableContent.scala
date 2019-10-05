package typings.winrtDashUwp.Windows.Storage.Search

import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app content and properties that can be added to the ContentIndexer . */
trait IIndexableContent extends js.Object {
  /** Gets or sets the identifier for the content properties in the IIndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var id: String
  /** Gets the content properties. */
  var properties: IMap[String, _]
  /** Gets or sets a stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var stream: IRandomAccessStream
  /** Specifies the type of content in the Stream . */
  var streamContentType: String
}

object IIndexableContent {
  @scala.inline
  def apply(id: String, properties: IMap[String, _], stream: IRandomAccessStream, streamContentType: String): IIndexableContent = {
    val __obj = js.Dynamic.literal(id = id, properties = properties, stream = stream, streamContentType = streamContentType)
  
    __obj.asInstanceOf[IIndexableContent]
  }
}

