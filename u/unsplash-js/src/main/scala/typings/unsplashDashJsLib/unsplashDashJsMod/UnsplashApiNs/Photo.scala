package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Photo extends js.Object {
  def downloadPhoto(photo: unsplashDashJsLib.Anon_Links): js.Promise[stdLib.Response] = js.native
  def getPhoto(id: java.lang.String): js.Promise[stdLib.Response] = js.native
  def getPhoto(id: java.lang.String, width: scala.Double): js.Promise[stdLib.Response] = js.native
  def getPhoto(id: java.lang.String, width: scala.Double, height: scala.Double): js.Promise[stdLib.Response] = js.native
  def getPhoto(id: java.lang.String, width: scala.Double, height: scala.Double, rectangle: js.Array[scala.Double]): js.Promise[stdLib.Response] = js.native
  def getPhotoStats(id: java.lang.String): js.Promise[stdLib.Response] = js.native
  def getRandomPhoto(options: unsplashDashJsLib.Anon_Collections): js.Promise[stdLib.Response] = js.native
  def likePhoto(id: java.lang.String): js.Promise[stdLib.Response] = js.native
  def listCuratedPhotos(): js.Promise[stdLib.Response] = js.native
  def listCuratedPhotos(page: scala.Double): js.Promise[stdLib.Response] = js.native
  def listCuratedPhotos(page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def listCuratedPhotos(page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def listPhotos(): js.Promise[stdLib.Response] = js.native
  def listPhotos(page: scala.Double): js.Promise[stdLib.Response] = js.native
  def listPhotos(page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def listPhotos(page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def searchPhotos(
    query: java.lang.String,
    categories: js.Array[java.lang.String],
    page: scala.Double,
    perPage: scala.Double
  ): js.Promise[stdLib.Response] = js.native
  def unlikePhoto(id: java.lang.String): js.Promise[stdLib.Response] = js.native
  def uploadPhoto(photo: js.Object): scala.Unit = js.native
}

