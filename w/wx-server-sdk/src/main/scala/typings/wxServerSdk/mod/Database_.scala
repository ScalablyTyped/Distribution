package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database_ extends js.Object {
  var Geo: typings.wxServerSdk.mod.Geo = js.native
  var command: Command = js.native
  var createCollection: js.Promise[CreateCollectionSuccess] = js.native
  def RegExp(options: RegExpOptions): DBRegExp = js.native
  def collection(name: String): Collection = js.native
  def serverDate(): ServerDate = js.native
  def serverDate(options: js.Object): ServerDate = js.native
}

