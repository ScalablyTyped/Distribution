package typings.unsplashDashJs.unsplashDashJsMod.UnsplashApiNs

import typings.std.Response
import typings.unsplashDashJs.Anon_Collections
import typings.unsplashDashJs.Anon_Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Photo extends js.Object {
  def downloadPhoto(photo: Anon_Links): js.Promise[Response] = js.native
  def getPhoto(id: String): js.Promise[Response] = js.native
  def getPhoto(id: String, width: Double): js.Promise[Response] = js.native
  def getPhoto(id: String, width: Double, height: Double): js.Promise[Response] = js.native
  def getPhoto(id: String, width: Double, height: Double, rectangle: js.Array[Double]): js.Promise[Response] = js.native
  def getPhotoStats(id: String): js.Promise[Response] = js.native
  def getRandomPhoto(options: Anon_Collections): js.Promise[Response] = js.native
  def likePhoto(id: String): js.Promise[Response] = js.native
  def listCuratedPhotos(): js.Promise[Response] = js.native
  def listCuratedPhotos(page: Double): js.Promise[Response] = js.native
  def listCuratedPhotos(page: Double, perPage: Double): js.Promise[Response] = js.native
  def listCuratedPhotos(page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def listPhotos(): js.Promise[Response] = js.native
  def listPhotos(page: Double): js.Promise[Response] = js.native
  def listPhotos(page: Double, perPage: Double): js.Promise[Response] = js.native
  def listPhotos(page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def searchPhotos(query: String, categories: js.Array[String], page: Double, perPage: Double): js.Promise[Response] = js.native
  def unlikePhoto(id: String): js.Promise[Response] = js.native
  def uploadPhoto(photo: js.Object): Unit = js.native
}

