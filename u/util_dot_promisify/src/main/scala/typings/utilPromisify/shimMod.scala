package typings.utilPromisify

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("util.promisify/shim", JSImport.Namespace)
@js.native
object shimMod extends js.Object {
  def apply(): js.Function1[
    /* fn */ js.Function1[/* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], Unit], 
    js.Function0[js.Promise[Unit]]
  ] = js.native
}

