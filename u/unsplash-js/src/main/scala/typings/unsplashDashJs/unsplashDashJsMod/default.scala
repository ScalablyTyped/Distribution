package typings.unsplashDashJs.unsplashDashJsMod

import typings.std.Response
import typings.unsplashDashJs.Anon_ApiUrl
import typings.unsplashDashJs.Anon_Body
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.Auth
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.Categories
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.Collections
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.CurrentUser
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.Photo
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.Search
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.Stats
import typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unsplash-js", JSImport.Default)
@js.native
class default protected () extends Unsplash {
  def this(options: Anon_ApiUrl) = this()
  /* CompleteClass */
  override var auth: Auth = js.native
  /* CompleteClass */
  override var categories: Categories = js.native
  /* CompleteClass */
  override var collections: Collections = js.native
  /* CompleteClass */
  override var currentUser: CurrentUser = js.native
  /* CompleteClass */
  override var photos: Photo = js.native
  /* CompleteClass */
  override var search: Search = js.native
  /* CompleteClass */
  override var stats: Stats = js.native
  /* CompleteClass */
  override var users: Users = js.native
  /* CompleteClass */
  override def request(requestOptions: Anon_Body): js.Promise[Response] = js.native
}

