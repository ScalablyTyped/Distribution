package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceChangeRequestedEventArgs extends js.Object {
  var album: java.lang.String
  var author: java.lang.String
  var date: stdLib.Date
  var description: java.lang.String
  var genre: java.lang.String
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  var rating: scala.Double
  var stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
  var thumbnail: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
  var title: java.lang.String
}

