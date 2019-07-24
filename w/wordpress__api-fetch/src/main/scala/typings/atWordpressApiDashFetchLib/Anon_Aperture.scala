package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aperture extends js.Object {
  var aperture: java.lang.String
  var camera: java.lang.String
  var caption: java.lang.String
  var copyright: java.lang.String
  var created_timestamp: java.lang.String
  var credit: java.lang.String
  var focal_length: java.lang.String
  var iso: java.lang.String
  var keywords: js.Array[java.lang.String]
  var orientation: java.lang.String
  var shutter_speed: java.lang.String
  var title: java.lang.String
}

object Anon_Aperture {
  @scala.inline
  def apply(
    aperture: java.lang.String,
    camera: java.lang.String,
    caption: java.lang.String,
    copyright: java.lang.String,
    created_timestamp: java.lang.String,
    credit: java.lang.String,
    focal_length: java.lang.String,
    iso: java.lang.String,
    keywords: js.Array[java.lang.String],
    orientation: java.lang.String,
    shutter_speed: java.lang.String,
    title: java.lang.String
  ): Anon_Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture, camera = camera, caption = caption, copyright = copyright, created_timestamp = created_timestamp, credit = credit, focal_length = focal_length, iso = iso, keywords = keywords, orientation = orientation, shutter_speed = shutter_speed, title = title)
  
    __obj.asInstanceOf[Anon_Aperture]
  }
}

