package typings
package unsplashDashJsLib.unsplashDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unsplash-js", JSImport.Default)
@js.native
class default protected () extends Unsplash {
  def this(options: unsplashDashJsLib.Anon_ApiUrl) = this()
  /* CompleteClass */
  override var auth: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Auth = js.native
  /* CompleteClass */
  override var categories: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Categories = js.native
  /* CompleteClass */
  override var collections: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Collections = js.native
  /* CompleteClass */
  override var currentUser: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.CurrentUser = js.native
  /* CompleteClass */
  override var photos: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Photo = js.native
  /* CompleteClass */
  override var search: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Search = js.native
  /* CompleteClass */
  override var stats: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Stats = js.native
  /* CompleteClass */
  override var users: unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs.Users = js.native
  /* CompleteClass */
  override def request(requestOptions: unsplashDashJsLib.Anon_Body): js.Promise[stdLib.Response] = js.native
}

