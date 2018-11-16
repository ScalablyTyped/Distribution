package typings
package testDashListenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("test-listen", JSImport.Namespace)
@js.native
object testDashListenMod extends js.Object {
  def apply(srv: nodeLib.netMod.Server): stdLib.Promise[java.lang.String] = js.native
  def apply(srv: nodeLib.netMod.Server, hostname: java.lang.String): stdLib.Promise[java.lang.String] = js.native
}

