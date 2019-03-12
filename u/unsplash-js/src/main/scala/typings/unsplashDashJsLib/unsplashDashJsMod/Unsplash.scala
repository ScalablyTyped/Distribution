package typings
package unsplashDashJsLib.unsplashDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsplash extends js.Object {
  var auth: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Auth
  var categories: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Categories
  var collections: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Collections
  var currentUser: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.CurrentUser
  var photos: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Photo
  var search: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Search
  var stats: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Stats
  var users: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Users
  def request(requestOptions: unsplashDashJsLib.Anon_Body): js.Promise[stdLib.Response]
}

object Unsplash {
  @scala.inline
  def apply(
    auth: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Auth,
    categories: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Categories,
    collections: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Collections,
    currentUser: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.CurrentUser,
    photos: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Photo,
    request: unsplashDashJsLib.Anon_Body => js.Promise[stdLib.Response],
    search: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Search,
    stats: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Stats,
    users: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Users
  ): Unsplash = {
    val __obj = js.Dynamic.literal(auth = auth, categories = categories, collections = collections, currentUser = currentUser, photos = photos, request = js.Any.fromFunction1(request), search = search, stats = stats, users = users)
  
    __obj.asInstanceOf[Unsplash]
  }
}

