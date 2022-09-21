package typings.wechatMiniprogram.DB

import typings.std.Record
import typings.wechatMiniprogram.OQ
import typings.wechatMiniprogram.anon.RQIGetDocumentOptions
import typings.wechatMiniprogram.anon.RQIRemoveSingleDocumentOp
import typings.wechatMiniprogram.anon.RQISetSingleDocumentOptio
import typings.wechatMiniprogram.anon.RQIUpdateSingleDocumentOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentReference extends StObject {
  
  def field(`object`: Record[String, Any]): this.type = js.native
  
  def get(): js.Promise[IQuerySingleResult] = js.native
  def get(options: OQ[IGetDocumentOptions]): Unit = js.native
  def get(options: RQIGetDocumentOptions): js.Promise[IQuerySingleResult] = js.native
  
  def remove(): js.Promise[IRemoveResult] = js.native
  def remove(options: OQ[IRemoveSingleDocumentOptions]): Unit = js.native
  def remove(options: RQIRemoveSingleDocumentOp): js.Promise[IRemoveResult] = js.native
  
  def set(): js.Promise[ISetResult] = js.native
  def set(options: OQ[ISetSingleDocumentOptions]): Unit = js.native
  def set(options: RQISetSingleDocumentOptio): js.Promise[ISetResult] = js.native
  
  def update(): js.Promise[IUpdateResult] = js.native
  def update(options: OQ[IUpdateSingleDocumentOptions]): Unit = js.native
  def update(options: RQIUpdateSingleDocumentOp): js.Promise[IUpdateResult] = js.native
  
  def watch(options: IWatchOptions): RealtimeListener = js.native
}
