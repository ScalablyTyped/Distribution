package typings.vexdb.settingsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.vexdb.anon.PollTime
import typings.vexdb.anon.Ttl
import typings.vexdb.requestObjectsMod.RequestObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait settings extends js.Object {
  var baseURL: String
  var cache: Ttl
  var headers: StringDictionary[String]
  var live: PollTime
  var params: RequestObject
}

@JSImport("vexdb/out/constants/settings", "settings")
@js.native
object settings extends TopLevel[settings]

