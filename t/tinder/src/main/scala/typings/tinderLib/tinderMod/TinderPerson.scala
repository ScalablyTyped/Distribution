package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderPerson extends js.Object {
  var _id: java.lang.String
  var badges: js.Array[_]
  var bio: java.lang.String
  var birth_date: java.lang.String
  var gender: scala.Double
  var name: java.lang.String
  var photos: js.Array[TinderPhoto]
  var ping_time: java.lang.String
  var user_number: scala.Double
}

object TinderPerson {
  @scala.inline
  def apply(
    _id: java.lang.String,
    badges: js.Array[_],
    bio: java.lang.String,
    birth_date: java.lang.String,
    gender: scala.Double,
    name: java.lang.String,
    photos: js.Array[TinderPhoto],
    ping_time: java.lang.String,
    user_number: scala.Double
  ): TinderPerson = {
    val __obj = js.Dynamic.literal(_id = _id, badges = badges, bio = bio, birth_date = birth_date, gender = gender, name = name, photos = photos, ping_time = ping_time, user_number = user_number)
  
    __obj.asInstanceOf[TinderPerson]
  }
}

