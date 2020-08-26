package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.OQ
import typings.wechatMiniprogram.anon.RQIAddDocumentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionReference extends Query {
  val collectionName: String = js.native
  def add(options: OQ[IAddDocumentOptions]): Unit = js.native
  def add(options: RQIAddDocumentOptions): js.Promise[IAddResult] = js.native
  def doc(docId: String): DocumentReference = js.native
  def doc(docId: Double): DocumentReference = js.native
}

