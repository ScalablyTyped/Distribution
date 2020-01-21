package typings.tinder.mod

import typings.std.Number
import typings.tinder.AnonString
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
  var teaser: AnonString
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
    teaser: AnonString,
    uncommon_interests: js.Array[_]
  ): TinderRecommendation = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], birth_date_info = birth_date_info.asInstanceOf[js.Any], common_connections = common_connections.asInstanceOf[js.Any], common_friends = common_friends.asInstanceOf[js.Any], common_interests = common_interests.asInstanceOf[js.Any], common_likes = common_likes.asInstanceOf[js.Any], distance_mi = distance_mi.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], ping_time = ping_time.asInstanceOf[js.Any], schools = schools.asInstanceOf[js.Any], teaser = teaser.asInstanceOf[js.Any], uncommon_interests = uncommon_interests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TinderRecommendation]
  }
}

