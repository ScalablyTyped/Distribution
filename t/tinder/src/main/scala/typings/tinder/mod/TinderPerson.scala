package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderPerson extends js.Object {
  var _id: String
  var badges: js.Array[_]
  var bio: String
  var birth_date: String
  var gender: Double
  var name: String
  var photos: js.Array[TinderPhoto]
  var ping_time: String
  var user_number: Double
}

object TinderPerson {
  @scala.inline
  def apply(
    _id: String,
    badges: js.Array[_],
    bio: String,
    birth_date: String,
    gender: Double,
    name: String,
    photos: js.Array[TinderPhoto],
    ping_time: String,
    user_number: Double
  ): TinderPerson = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], ping_time = ping_time.asInstanceOf[js.Any], user_number = user_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderPerson]
  }
}

