package typings.sweetalert

import typings.std.Partial
import typings.sweetalert.optionsMod.SwalOptions
import typings.sweetalert.stateMod.ActionOptions
import typings.sweetalert.stateMod.SwalState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sweetalert/typings/core", JSImport.Namespace)
@js.native
object coreMod extends js.Object {
  @js.native
  trait SweetAlert extends js.Object {
    var close: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[String], Unit]] = js.native
    var getState: js.UndefOr[js.Function0[SwalState]] = js.native
    var setActionValue: js.UndefOr[js.Function1[/* opts */ String | ActionOptions, Unit]] = js.native
    var setDefaults: js.UndefOr[js.Function1[/* opts */ js.Object, Unit]] = js.native
    var stopLoading: js.UndefOr[js.Function0[Unit]] = js.native
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type SwalParams is not an array type */ params: SwalParams
    ): js.Promise[_] = js.native
  }
  
  val default: SweetAlert = js.native
  type SwalParams = js.Array[String | Partial[SwalOptions]]
}

