package typings.atWordpressApiDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aperture extends js.Object {
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

object Anon_Aperture {
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
  ): Anon_Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture, camera = camera, caption = caption, copyright = copyright, created_timestamp = created_timestamp, credit = credit, focal_length = focal_length, iso = iso, keywords = keywords, orientation = orientation, shutter_speed = shutter_speed, title = title)
  
    __obj.asInstanceOf[Anon_Aperture]
  }
}

