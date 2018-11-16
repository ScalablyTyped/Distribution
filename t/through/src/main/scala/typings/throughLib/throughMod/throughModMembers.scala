package typings
package throughLib.throughMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through", JSImport.Namespace)
@js.native
object throughModMembers extends js.Object {
  def apply(): throughLib.throughMod.throughNs.ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, scala.Unit]): throughLib.throughMod.throughNs.ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, scala.Unit], end: js.Function0[scala.Unit]): throughLib.throughMod.throughNs.ThroughStream = js.native
  def apply(
    write: js.Function1[/* data */ js.Any, scala.Unit],
    end: js.Function0[scala.Unit],
    opts: throughLib.Anon_AutoDestroy
  ): throughLib.throughMod.throughNs.ThroughStream = js.native
}

