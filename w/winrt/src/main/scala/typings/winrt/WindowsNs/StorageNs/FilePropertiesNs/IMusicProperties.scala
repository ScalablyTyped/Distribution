package typings.winrt.WindowsNs.StorageNs.FilePropertiesNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMusicProperties extends IStorageItemExtraProperties {
  var album: String = js.native
  var albumArtist: String = js.native
  var artist: String = js.native
  var bitrate: Double = js.native
  var composers: IVector[String] = js.native
  var conductors: IVector[String] = js.native
  var duration: Double = js.native
  var genre: IVector[String] = js.native
  var producers: IVector[String] = js.native
  var publisher: String = js.native
  var rating: Double = js.native
  var subtitle: String = js.native
  var title: String = js.native
  var trackNumber: Double = js.native
  var writers: IVector[String] = js.native
  var year: Double = js.native
}

