package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numericOperatorsMod {
  import typings.std.Pick
  import typings.tstl.numericIComputableMod.IComputable
  import typings.tstl.tstlStrings.plus

  /**
    * @hidden
    */
  type Param[Y, Ret, Key /* <: String */] = Double | (Pick[IComputable[Y, Ret], Key])
  /**
    * @hidden
    */
  type PlusParam[Y, Ret] = Double | String | (Pick[IComputable[Y, Ret], plus])
}
