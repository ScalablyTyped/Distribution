package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.wxDashServerDashSdk.DBRegExp
import typings.wxDashServerDashSdk.ServerDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  var Geo: typings.wxDashServerDashSdk.wxDashServerDashSdkMod.Geo = js.native
  var command: Command = js.native
  var createCollection: js.Promise[CreateCollectionSuccess] = js.native
  def RegExp(options: RegExpOptions): DBRegExp = js.native
  def collection(name: String): Collection = js.native
  def serverDate(): ServerDate = js.native
  def serverDate(options: js.Object): ServerDate = js.native
}

@JSImport("wx-server-sdk", "database")
@js.native
object database extends js.Object {
  // 数据库 API
  def apply(): Database = js.native
  def apply(options: DatabaseOptions): Database = js.native
}

