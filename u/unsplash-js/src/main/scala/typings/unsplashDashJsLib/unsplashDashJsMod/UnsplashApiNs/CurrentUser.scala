package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  def profile(): js.Promise[stdLib.Response]
  def updateProfile(options: unsplashDashJsLib.Anon_Bio): js.Promise[stdLib.Response]
}

object CurrentUser {
  @scala.inline
  def apply(
    profile: () => js.Promise[stdLib.Response],
    updateProfile: unsplashDashJsLib.Anon_Bio => js.Promise[stdLib.Response]
  ): CurrentUser = {
    val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile), updateProfile = js.Any.fromFunction1(updateProfile))
  
    __obj.asInstanceOf[CurrentUser]
  }
}

