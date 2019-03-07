package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Categories extends js.Object {
  def category(id: js.Any): js.Promise[stdLib.Response] = js.native
  def categoryPhotos(id: js.Any): js.Promise[stdLib.Response] = js.native
  def categoryPhotos(id: js.Any, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def categoryPhotos(id: js.Any, page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def listCategories(): js.Promise[stdLib.Response] = js.native
}

