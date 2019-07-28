package typings.tinder.tinderMod

import typings.std.Number
import typings.tinder.Anon_String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinderRecommendation extends js.Object {
   // todo
  var _id: String
  var badges: js.Array[_]
   // todo
  var bio: String
  var birth_date: String
   // todo
  var birth_date_info: String
  var common_connections: js.Array[_]
   // todo
  var common_friends: js.Array[_]
   // todo
  var common_interests: js.Array[_]
   // todo
  var common_likes: js.Array[_]
  var distance_mi: Number
  var gender: Double
  var jobs: js.Array[_]
  var name: String
  var photos: js.Array[TinderPhoto]
  var ping_time: String
   // todo
  var schools: js.Array[_]
   // todo
  var teaser: Anon_String
   // todo
  var uncommon_interests: js.Array[_]
}

object TinderRecommendation {
  @scala.inline
  def apply(
    _id: String,
    badges: js.Array[_],
    bio: String,
    birth_date: String,
    birth_date_info: String,
    common_connections: js.Array[_],
    common_friends: js.Array[_],
    common_interests: js.Array[_],
    common_likes: js.Array[_],
    distance_mi: Number,
    gender: Double,
    jobs: js.Array[_],
    name: String,
    photos: js.Array[TinderPhoto],
    ping_time: String,
    schools: js.Array[_],
    teaser: Anon_String,
    uncommon_interests: js.Array[_]
  ): TinderRecommendation = {
    val __obj = js.Dynamic.literal(_id = _id, badges = badges, bio = bio, birth_date = birth_date, birth_date_info = birth_date_info, common_connections = common_connections, common_friends = common_friends, common_interests = common_interests, common_likes = common_likes, distance_mi = distance_mi, gender = gender, jobs = jobs, name = name, photos = photos, ping_time = ping_time, schools = schools, teaser = teaser, uncommon_interests = uncommon_interests)
  
    __obj.asInstanceOf[TinderRecommendation]
  }
}

