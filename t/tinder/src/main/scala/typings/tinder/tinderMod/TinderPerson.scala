package typings.tinder.tinderMod

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
    val __obj = js.Dynamic.literal(_id = _id, badges = badges, bio = bio, birth_date = birth_date, gender = gender, name = name, photos = photos, ping_time = ping_time, user_number = user_number)
  
    __obj.asInstanceOf[TinderPerson]
  }
}

