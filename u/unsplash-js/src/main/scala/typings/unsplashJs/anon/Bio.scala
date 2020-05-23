package typings.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bio extends js.Object {
  var bio: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var instagramUsername: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Bio {
  @scala.inline
  def apply(
    bio: String = null,
    email: String = null,
    firstName: String = null,
    instagramUsername: String = null,
    lastName: String = null,
    location: String = null,
    url: String = null,
    username: String = null
  ): Bio = {
    val __obj = js.Dynamic.literal()
    if (bio != null) __obj.updateDynamic("bio")(bio.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (instagramUsername != null) __obj.updateDynamic("instagramUsername")(instagramUsername.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bio]
  }
}

