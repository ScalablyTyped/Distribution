package typings.vexdb.vexdbMod

import typings.vexdb.Anon_PollTime
import typings.vexdb.Anon_Ttl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "constant")
@js.native
object constantNs extends js.Object {
  val endpoints: js.Array[String] = js.native
  def header(headers: js.Object): Unit = js.native
  def isBrowser(): Boolean = js.native
  def param(params: RequestObject): Unit = js.native
  @js.native
  object settings extends js.Object {
    var baseURL: String = js.native
    var cache: Anon_Ttl = js.native
    var live: Anon_PollTime = js.native
  }
  
  @js.native
  object uniques extends js.Object {
    var events: String = js.native
    var teams: String = js.native
  }
  
  @js.native
  object validParams extends js.Object {
    var awards: js.Array[String] = js.native
    var events: js.Array[String] = js.native
    var matches: js.Array[String] = js.native
    var rankings: js.Array[String] = js.native
    var season_rankings: js.Array[String] = js.native
    var skills: js.Array[String] = js.native
    var teams: js.Array[String] = js.native
  }
  
}

