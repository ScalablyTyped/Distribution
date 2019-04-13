package typings
package throughLib.throughMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, scala.Unit]): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, scala.Unit], end: js.Function0[scala.Unit]): ThroughStream = js.native
  def apply(
    write: js.Function1[/* data */ js.Any, scala.Unit],
    end: js.Function0[scala.Unit],
    opts: throughLib.Anon_AutoDestroy
  ): ThroughStream = js.native
}

