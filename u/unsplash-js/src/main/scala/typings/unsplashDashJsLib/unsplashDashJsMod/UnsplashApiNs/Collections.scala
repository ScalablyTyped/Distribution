package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collections extends js.Object {
  def addPhotoToCollection(collectionId: scala.Double, photoId: java.lang.String): js.Promise[stdLib.Response] = js.native
  def createCollection(title: java.lang.String): js.Promise[stdLib.Response] = js.native
  def createCollection(title: java.lang.String, description: java.lang.String): js.Promise[stdLib.Response] = js.native
  def createCollection(title: java.lang.String, description: java.lang.String, `private`: scala.Boolean): js.Promise[stdLib.Response] = js.native
  def deleteCollection(id: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCollection(id: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCollectionPhotos(id: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCollectionPhotos(id: scala.Double, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCollectionPhotos(id: scala.Double, page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCollectionPhotos(id: scala.Double, page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def getCuratedCollectionPhotos(id: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCuratedCollectionPhotos(id: scala.Double, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCuratedCollectionPhotos(id: scala.Double, page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def getCuratedCollectionPhotos(id: scala.Double, page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def listCollections(): js.Promise[stdLib.Response] = js.native
  def listCollections(page: scala.Double): js.Promise[stdLib.Response] = js.native
  def listCollections(page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def listCollections(page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def listCuratedCollections(): js.Promise[stdLib.Response] = js.native
  def listCuratedCollections(page: scala.Double): js.Promise[stdLib.Response] = js.native
  def listCuratedCollections(page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def listFeaturedCollections(): js.Promise[stdLib.Response] = js.native
  def listFeaturedCollections(page: scala.Double): js.Promise[stdLib.Response] = js.native
  def listFeaturedCollections(page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def listRelatedCollections(collectionId: scala.Double): js.Promise[stdLib.Response] = js.native
  def removePhotoFromCollection(collectionId: scala.Double, photoId: java.lang.String): js.Promise[stdLib.Response] = js.native
  def updateCollection(id: scala.Double): js.Promise[stdLib.Response] = js.native
  def updateCollection(id: scala.Double, title: java.lang.String): js.Promise[stdLib.Response] = js.native
  def updateCollection(id: scala.Double, title: java.lang.String, description: java.lang.String): js.Promise[stdLib.Response] = js.native
  def updateCollection(id: scala.Double, title: java.lang.String, description: java.lang.String, `private`: scala.Boolean): js.Promise[stdLib.Response] = js.native
}

