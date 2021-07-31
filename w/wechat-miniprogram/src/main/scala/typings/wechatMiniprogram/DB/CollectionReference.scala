package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.OQ
import typings.wechatMiniprogram.anon.RQIAddDocumentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionReference
  extends StObject
     with Query {
  
  def add(options: OQ[IAddDocumentOptions]): Unit = js.native
  def add(options: RQIAddDocumentOptions): js.Promise[IAddResult] = js.native
  
  val collectionName: String = js.native
  
  def doc(docId: String): DocumentReference = js.native
  def doc(docId: Double): DocumentReference = js.native
}
