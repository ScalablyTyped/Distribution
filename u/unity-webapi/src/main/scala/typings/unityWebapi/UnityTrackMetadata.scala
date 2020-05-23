package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnityTrackMetadata extends js.Object {
  // Optionals
  var album: String
  var artLocation: String
  var artist: String
  var title: String
}

object UnityTrackMetadata {
  @scala.inline
  def apply(album: String, artLocation: String, artist: String, title: String): UnityTrackMetadata = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artLocation = artLocation.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityTrackMetadata]
  }
}

