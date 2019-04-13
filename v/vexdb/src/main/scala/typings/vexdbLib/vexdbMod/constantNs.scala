package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "constant")
@js.native
object constantNs extends js.Object {
  val endpoints: js.Array[java.lang.String] = js.native
  def header(headers: js.Object): scala.Unit = js.native
  def isBrowser(): scala.Boolean = js.native
  def param(params: vexdbLib.vexdbMod.RequestObject): scala.Unit = js.native
  @js.native
  object settings extends js.Object {
    var baseURL: java.lang.String = js.native
    var cache: vexdbLib.Anon_Ttl = js.native
    var live: vexdbLib.Anon_PollTime = js.native
  }
  
  @js.native
  object uniques extends js.Object {
    var events: java.lang.String = js.native
    var teams: java.lang.String = js.native
  }
  
  @js.native
  object validParams extends js.Object {
    var awards: js.Array[java.lang.String] = js.native
    var events: js.Array[java.lang.String] = js.native
    var matches: js.Array[java.lang.String] = js.native
    var rankings: js.Array[java.lang.String] = js.native
    var season_rankings: js.Array[java.lang.String] = js.native
    var skills: js.Array[java.lang.String] = js.native
    var teams: js.Array[java.lang.String] = js.native
  }
  
}

