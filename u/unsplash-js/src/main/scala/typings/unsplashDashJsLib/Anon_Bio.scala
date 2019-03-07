package typings
package unsplashDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bio extends js.Object {
  var bio: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var instagramUsername: js.UndefOr[java.lang.String] = js.undefined
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bio {
  @scala.inline
  def apply(
    bio: java.lang.String = null,
    email: java.lang.String = null,
    firstName: java.lang.String = null,
    instagramUsername: java.lang.String = null,
    lastName: java.lang.String = null,
    location: java.lang.String = null,
    url: java.lang.String = null,
    username: java.lang.String = null
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

