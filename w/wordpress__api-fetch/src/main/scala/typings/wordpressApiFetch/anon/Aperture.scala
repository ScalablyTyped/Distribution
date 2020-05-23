package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aperture extends js.Object {
  var aperture: String
  var camera: String
  var caption: String
  var copyright: String
  var created_timestamp: String
  var credit: String
  var focal_length: String
  var iso: String
  var keywords: js.Array[String]
  var orientation: String
  var shutter_speed: String
  var title: String
}

object Aperture {
  @scala.inline
  def apply(
    aperture: String,
    camera: String,
    caption: String,
    copyright: String,
    created_timestamp: String,
    credit: String,
    focal_length: String,
    iso: String,
    keywords: js.Array[String],
    orientation: String,
    shutter_speed: String,
    title: String
  ): Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], created_timestamp = created_timestamp.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], focal_length = focal_length.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], shutter_speed = shutter_speed.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aperture]
  }
}

