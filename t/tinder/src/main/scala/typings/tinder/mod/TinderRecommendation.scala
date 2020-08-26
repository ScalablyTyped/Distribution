package typings.tinder.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderRecommendation extends js.Object {
   // todo
  var _id: String = js.native
  var badges: js.Array[_] = js.native
   // todo
  var bio: String = js.native
  var birth_date: String = js.native
   // todo
  var birth_date_info: String = js.native
  var common_connections: js.Array[_] = js.native
   // todo
  var common_friends: js.Array[_] = js.native
   // todo
  var common_interests: js.Array[_] = js.native
   // todo
  var common_likes: js.Array[_] = js.native
  var distance_mi: Number = js.native
  var gender: Double = js.native
  var jobs: js.Array[_] = js.native
  var name: String = js.native
  var photos: js.Array[TinderPhoto] = js.native
  var ping_time: String = js.native
   // todo
  var schools: js.Array[_] = js.native
   // todo
  var teaser: typings.tinder.anon.String = js.native
   // todo
  var uncommon_interests: js.Array[_] = js.native
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
    teaser: typings.tinder.anon.String,
    uncommon_interests: js.Array[_]
  ): TinderRecommendation = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], birth_date_info = birth_date_info.asInstanceOf[js.Any], common_connections = common_connections.asInstanceOf[js.Any], common_friends = common_friends.asInstanceOf[js.Any], common_interests = common_interests.asInstanceOf[js.Any], common_likes = common_likes.asInstanceOf[js.Any], distance_mi = distance_mi.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], ping_time = ping_time.asInstanceOf[js.Any], schools = schools.asInstanceOf[js.Any], teaser = teaser.asInstanceOf[js.Any], uncommon_interests = uncommon_interests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderRecommendation]
  }
  @scala.inline
  implicit class TinderRecommendationOps[Self <: TinderRecommendation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadgesVarargs(value: js.Any*): Self = this.set("badges", js.Array(value :_*))
    @scala.inline
    def setBadges(value: js.Array[_]): Self = this.set("badges", value.asInstanceOf[js.Any])
    @scala.inline
    def setBio(value: String): Self = this.set("bio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirth_date(value: String): Self = this.set("birth_date", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirth_date_info(value: String): Self = this.set("birth_date_info", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommon_connectionsVarargs(value: js.Any*): Self = this.set("common_connections", js.Array(value :_*))
    @scala.inline
    def setCommon_connections(value: js.Array[_]): Self = this.set("common_connections", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommon_friendsVarargs(value: js.Any*): Self = this.set("common_friends", js.Array(value :_*))
    @scala.inline
    def setCommon_friends(value: js.Array[_]): Self = this.set("common_friends", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommon_interestsVarargs(value: js.Any*): Self = this.set("common_interests", js.Array(value :_*))
    @scala.inline
    def setCommon_interests(value: js.Array[_]): Self = this.set("common_interests", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommon_likesVarargs(value: js.Any*): Self = this.set("common_likes", js.Array(value :_*))
    @scala.inline
    def setCommon_likes(value: js.Array[_]): Self = this.set("common_likes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance_mi(value: Number): Self = this.set("distance_mi", value.asInstanceOf[js.Any])
    @scala.inline
    def setGender(value: Double): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobsVarargs(value: js.Any*): Self = this.set("jobs", js.Array(value :_*))
    @scala.inline
    def setJobs(value: js.Array[_]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotosVarargs(value: TinderPhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[TinderPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def setPing_time(value: String): Self = this.set("ping_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchoolsVarargs(value: js.Any*): Self = this.set("schools", js.Array(value :_*))
    @scala.inline
    def setSchools(value: js.Array[_]): Self = this.set("schools", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeaser(value: typings.tinder.anon.String): Self = this.set("teaser", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncommon_interestsVarargs(value: js.Any*): Self = this.set("uncommon_interests", js.Array(value :_*))
    @scala.inline
    def setUncommon_interests(value: js.Array[_]): Self = this.set("uncommon_interests", value.asInstanceOf[js.Any])
  }
  
}

