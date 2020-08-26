package typings.unsplashJs.mod.UnsplashApi

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collections extends js.Object {
  def addPhotoToCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
  def createCollection(title: String): js.Promise[Response] = js.native
  def createCollection(title: String, description: js.UndefOr[scala.Nothing], isPrivate: Boolean): js.Promise[Response] = js.native
  def createCollection(title: String, description: String): js.Promise[Response] = js.native
  def createCollection(title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
  def deleteCollection(id: Double): js.Promise[Response] = js.native
  def getCollection(id: Double): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double, page: js.UndefOr[scala.Nothing], perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double, page: Double): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double, page: Double, perPage: Double): js.Promise[Response] = js.native
  def getCollectionPhotos(id: Double, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def listCollections(): js.Promise[Response] = js.native
  def listCollections(page: js.UndefOr[scala.Nothing], perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def listCollections(page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def listCollections(page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def listCollections(page: Double): js.Promise[Response] = js.native
  def listCollections(page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def listCollections(page: Double, perPage: Double): js.Promise[Response] = js.native
  def listCollections(page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def listRelatedCollections(collectionId: Double): js.Promise[Response] = js.native
  def removePhotoFromCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
  def updateCollection(id: Double): js.Promise[Response] = js.native
  def updateCollection(
    id: Double,
    title: js.UndefOr[scala.Nothing],
    description: js.UndefOr[scala.Nothing],
    isPrivate: Boolean
  ): js.Promise[Response] = js.native
  def updateCollection(id: Double, title: js.UndefOr[scala.Nothing], description: String): js.Promise[Response] = js.native
  def updateCollection(id: Double, title: js.UndefOr[scala.Nothing], description: String, isPrivate: Boolean): js.Promise[Response] = js.native
  def updateCollection(id: Double, title: String): js.Promise[Response] = js.native
  def updateCollection(id: Double, title: String, description: js.UndefOr[scala.Nothing], isPrivate: Boolean): js.Promise[Response] = js.native
  def updateCollection(id: Double, title: String, description: String): js.Promise[Response] = js.native
  def updateCollection(id: Double, title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
}

