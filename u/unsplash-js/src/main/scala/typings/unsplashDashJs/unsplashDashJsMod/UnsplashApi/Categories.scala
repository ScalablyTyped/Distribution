package typings.unsplashDashJs.unsplashDashJsMod.UnsplashApi

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Categories extends js.Object {
  def category(id: js.Any): js.Promise[Response] = js.native
  def categoryPhotos(id: js.Any): js.Promise[Response] = js.native
  def categoryPhotos(id: js.Any, page: Double): js.Promise[Response] = js.native
  def categoryPhotos(id: js.Any, page: Double, perPage: Double): js.Promise[Response] = js.native
  def listCategories(): js.Promise[Response] = js.native
}

