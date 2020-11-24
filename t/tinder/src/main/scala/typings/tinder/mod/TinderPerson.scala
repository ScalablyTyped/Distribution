package typings.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TinderPerson extends js.Object {
  
  var _id: String = js.native
  
  var badges: js.Array[_] = js.native
  
  var bio: String = js.native
  
  var birth_date: String = js.native
  
  var gender: Double = js.native
  
  var name: String = js.native
  
  var photos: js.Array[TinderPhoto] = js.native
  
  var ping_time: String = js.native
  
  var user_number: Double = js.native
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
  
  @scala.inline
  implicit class TinderPersonOps[Self <: TinderPerson] (val x: Self) extends AnyVal {
    
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
    def setGender(value: Double): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: TinderPhoto*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[TinderPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing_time(value: String): Self = this.set("ping_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_number(value: Double): Self = this.set("user_number", value.asInstanceOf[js.Any])
  }
}
