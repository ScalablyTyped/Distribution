package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthUserData extends js.Object {
  var first_name: String
  var hash: String
  var last_name: String
  var photo: String
  var photo_rec: String
  var uid: Double
}

object AuthUserData {
  @scala.inline
  def apply(first_name: String, hash: String, last_name: String, photo: String, photo_rec: String, uid: Double): AuthUserData = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], photo_rec = photo_rec.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthUserData]
  }
}

