package typings.unsplashDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bio extends js.Object {
  var bio: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var instagramUsername: js.UndefOr[String] = js.undefined
  var lastName: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Bio {
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
  ): Anon_Bio = {
    val __obj = js.Dynamic.literal()
    if (bio != null) __obj.updateDynamic("bio")(bio)
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (instagramUsername != null) __obj.updateDynamic("instagramUsername")(instagramUsername)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (location != null) __obj.updateDynamic("location")(location)
    if (url != null) __obj.updateDynamic("url")(url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Bio]
  }
}

