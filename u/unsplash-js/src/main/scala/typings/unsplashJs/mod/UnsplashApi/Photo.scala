package typings.unsplashJs.mod.UnsplashApi

import typings.std.Response
import typings.unsplashJs.anon.C
import typings.unsplashJs.anon.Links
import typings.unsplashJs.mod.PhotoOrderBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Photo extends js.Object {
  
  def downloadPhoto(photo: Links): js.Promise[Response] = js.native
  
  def getPhoto(id: String): js.Promise[Response] = js.native
  
  def getPhotoStats(id: String): js.Promise[Response] = js.native
  
  def getRandomPhoto(options: C): js.Promise[Response] = js.native
  
  def likePhoto(id: String): js.Promise[Response] = js.native
  
  def listPhotos(): js.Promise[Response] = js.native
  def listPhotos(page: js.UndefOr[scala.Nothing], perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def listPhotos(page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def listPhotos(page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def listPhotos(page: Double): js.Promise[Response] = js.native
  def listPhotos(page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  def listPhotos(page: Double, perPage: Double): js.Promise[Response] = js.native
  def listPhotos(page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
  
  def trackDownload(photo: Links): js.Promise[Response] = js.native
  
  def unlikePhoto(id: String): js.Promise[Response] = js.native
}
