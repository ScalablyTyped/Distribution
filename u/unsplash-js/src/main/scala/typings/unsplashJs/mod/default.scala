package typings.unsplashJs.mod

import typings.std.Response
import typings.unsplashJs.AnonAccessKey
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

@JSImport("unsplash-js", JSImport.Default)
@js.native
class default protected () extends Unsplash {
  def this(options: AnonAccessKey) = this()
  /* CompleteClass */
  override var auth: Auth = js.native
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
  override def request(requestOptions: AnonBody): js.Promise[Response] = js.native
}

