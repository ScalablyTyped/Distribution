package typings
package sweetalertLib.typingsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SweetAlert extends js.Object {
  var close: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[java.lang.String], scala.Unit]] = js.native
  var getState: js.UndefOr[js.Function0[sweetalertLib.typingsModulesStateMod.SwalState]] = js.native
  var setActionValue: js.UndefOr[
    js.Function1[
      /* opts */ java.lang.String | sweetalertLib.typingsModulesStateMod.ActionOptions, 
      scala.Unit
    ]
  ] = js.native
  var setDefaults: js.UndefOr[js.Function1[/* opts */ js.Object, scala.Unit]] = js.native
  var stopLoading: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def apply(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param params because its type SwalParams is not an array type */ params: SwalParams
  ): js.Promise[_] = js.native
}

