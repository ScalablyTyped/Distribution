package typings.tstl

import typings.std.Pick
import typings.tstl.numericIComputableMod.IComputable
import typings.tstl.tstlStrings.plus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numericOperatorsMod {
  /**
    * @hidden
    */
  type Param[Y, Ret, Key /* <: String */] = Double | (Pick[IComputable[Y, Ret], Key])
  /**
    * @hidden
    */
  type PlusParam[Y, Ret] = Double | String | (Pick[IComputable[Y, Ret], plus])
}
