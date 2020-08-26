package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.OQ
import typings.wechatMiniprogram.anon.RQICountDocumentOptions
import typings.wechatMiniprogram.anon.RQIGetDocumentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  def count(): js.Promise[ICountResult] = js.native
  def count(options: OQ[ICountDocumentOptions]): Unit = js.native
  def count(options: RQICountDocumentOptions): js.Promise[ICountResult] = js.native
  def field(`object`: js.Object): Query = js.native
  def get(): js.Promise[IQueryResult] = js.native
  def get(options: OQ[IGetDocumentOptions]): Unit = js.native
  def get(options: RQIGetDocumentOptions): js.Promise[IQueryResult] = js.native
  def limit(max: Double): Query = js.native
  def orderBy(fieldPath: String, order: String): Query = js.native
  def skip(offset: Double): Query = js.native
  def watch(options: IWatchOptions): RealtimeListener = js.native
  def where(condition: IQueryCondition): Query = js.native
}

