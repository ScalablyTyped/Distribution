package typings.winrt.WindowsNs.MediaNs.PlayToNs

import typings.std.Date
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo.SourceChangeRequestedEventArgs")
@js.native
class SourceChangeRequestedEventArgs () extends ISourceChangeRequestedEventArgs {
  /* CompleteClass */
  override var album: String = js.native
  /* CompleteClass */
  override var author: String = js.native
  /* CompleteClass */
  override var date: Date = js.native
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var genre: String = js.native
  /* CompleteClass */
  override var properties: IMapView[String, _] = js.native
  /* CompleteClass */
  override var rating: Double = js.native
  /* CompleteClass */
  override var stream: IRandomAccessStreamWithContentType = js.native
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
  /* CompleteClass */
  override var title: String = js.native
}

