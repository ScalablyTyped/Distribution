package typings.unsplashJs.mod

import typings.std.Response
import typings.unsplashJs.AnonBody
import typings.unsplashJs.mod.UnsplashApi.Auth
import typings.unsplashJs.mod.UnsplashApi.Collections
import typings.unsplashJs.mod.UnsplashApi.CurrentUser
import typings.unsplashJs.mod.UnsplashApi.Photo
import typings.unsplashJs.mod.UnsplashApi.Search
import typings.unsplashJs.mod.UnsplashApi.Stats
import typings.unsplashJs.mod.UnsplashApi.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsplash extends js.Object {
  var auth: Auth
  var collections: Collections
  var currentUser: CurrentUser
  var photos: Photo
  var search: Search
  var stats: Stats
  var users: Users
  def request(requestOptions: AnonBody): js.Promise[Response]
}

object Unsplash {
  @scala.inline
  def apply(
    auth: Auth,
    collections: Collections,
    currentUser: CurrentUser,
    photos: Photo,
    request: AnonBody => js.Promise[Response],
    search: Search,
    stats: Stats,
    users: Users
  ): Unsplash = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), search = search.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unsplash]
  }
}

