package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.NetChecksiteData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "inetChecksite")
@js.native
object inetChecksite extends js.Object {
  def apply(url: String): js.Promise[NetChecksiteData] = js.native
  def apply(url: String, cb: js.Function1[/* data */ NetChecksiteData, _]): js.Promise[NetChecksiteData] = js.native
}

