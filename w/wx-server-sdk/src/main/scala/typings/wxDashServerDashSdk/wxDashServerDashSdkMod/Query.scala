package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.asc
import typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  def count(): js.Promise[CountCollectionResult] = js.native
  def field(definition: js.Object): Collection | Query | Document = js.native
  def get(): js.Promise[GetCollectionResult] = js.native
  def limit(max: Double): Collection | Query = js.native
  @JSName("orderBy")
  def orderBy_asc(fieldName: String, order: asc): Collection | Query = js.native
  @JSName("orderBy")
  def orderBy_desc(fieldName: String, order: desc): Collection | Query = js.native
  def remove(): js.Promise[RemoveCollectionResult] = js.native
  def skip(offset: Double): Collection | Query = js.native
  def update(options: CommonOption[_]): js.Promise[UpateCollectionResult] = js.native
}

